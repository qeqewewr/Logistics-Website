package fxc.web.export;

import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;



import fxc.entity.Waybill;
import fxc.service.Bill.WaybillService;
import fxc.service.export.WaybillExportService;


@Controller
@SessionAttributes("waybillexport")
public class WaybilExportController {
	
	@Autowired
	private WaybillExportService waybillExportService;
	
	@Autowired
	private WaybillService waybillService;
	
	
	
	@RequestMapping(value = "/excel/export/waybill/{id}")    
    public void exportExcel(@PathVariable("id") long id,HttpServletRequest request, HttpServletResponse response)     
    throws Exception {    
        Waybill waybill = waybillService.getWaybillByid(id);
        HSSFWorkbook wb = waybillExportService.export(waybill);    
        response.setContentType("application/vnd.ms-excel");    
        response.setHeader("Content-disposition", "attachment;filename=waybill.xls");    
        OutputStream ouputStream = response.getOutputStream();    
        wb.write(ouputStream);    
        ouputStream.flush();    
        ouputStream.close();    
   }    
	
	
	
	
	
	

}
