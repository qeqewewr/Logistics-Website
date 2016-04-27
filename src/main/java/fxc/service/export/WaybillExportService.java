package fxc.service.export;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import fxc.entity.Waybill;


@Component
@Transactional  
public class WaybillExportService  {    
    
    String[] excelHeader = { "运单编号", "客户编号", "客户姓名","客户电话","客户邮箱","发件人","发件人号码","发件人地址","收件人","收件人号码","收件人地址","重量","体积","存放方式","运单价格","发件时间","收件时间","标注","付款方式"};    
    public HSSFWorkbook export(Waybill waybill) {    
        HSSFWorkbook wb = new HSSFWorkbook();    
        HSSFSheet sheet = wb.createSheet("Waybill");    
        HSSFRow row = sheet.createRow((int) 0);    
        HSSFCellStyle style = wb.createCellStyle();    
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);    
    
        for (int i = 0; i < excelHeader.length; i++) {    
            HSSFCell cell = row.createCell(i);    
            cell.setCellValue(excelHeader[i]);    
            cell.setCellStyle(style);    
            sheet.autoSizeColumn(i);    
        }    
        
        // 单元格列宽 
        for (int i = 0; i < 19; i++) {  
            sheet.setColumnWidth(i, 5000);  
        }     
        
        row = sheet.createRow(1);    
        row.createCell(0).setCellValue(waybill.getNumber());    
        row.createCell(1).setCellValue(waybill.getWlCustomer().getId());    
        row.createCell(2).setCellValue(waybill.getWlCustomer().getName());
        row.createCell(3).setCellValue(waybill.getWlGood().getNumber());
        row.createCell(4).setCellValue(waybill.getWlCustomer().getEmail());
        row.createCell(5).setCellValue(waybill.getSender());
        row.createCell(6).setCellValue(waybill.getSenderphone());
        row.createCell(7).setCellValue(waybill.getSendaddress());
        row.createCell(8).setCellValue(waybill.getReceiver());
        row.createCell(9).setCellValue(waybill.getReceiverphone());
        row.createCell(10).setCellValue(waybill.getReceiveaddress());
        row.createCell(11).setCellValue(waybill.getWeight());
        row.createCell(12).setCellValue(waybill.getVolume());
        row.createCell(13).setCellValue(waybill.getStoremode());
        row.createCell(14).setCellValue(waybill.getPrice());
        row.createCell(15).setCellValue(waybill.getSendtime().toString());
        if(waybill.getReceivetime()!=null){
        	row.createCell(16).setCellValue(waybill.getReceivetime().toString());}
        else{row.createCell(16).setCellValue("");}
        row.createCell(17).setCellValue(waybill.getRemark());
        row.createCell(18).setCellValue(waybill.getPayment());
        
        
        
        

        return wb;    
    }    
}    
