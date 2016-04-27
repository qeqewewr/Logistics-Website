package fxc.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;

import fxc.entity.Owner;
import fxc.entity.Vehicle;

@ContextConfiguration(locations = { "/applicationContext.xml" })
public class VehicleDaoETest extends SpringTransactionalTestCase {

	@Autowired
	private VehicleDAO vehicledao;

	@Test
	public void findVehicleByUserId() throws Exception {
		List<Vehicle> vehicles = vehicledao.findByType("Wagon");
		assertEquals(true, vehicles.isEmpty());

		Owner owner = new Owner();
		owner.setId(1);
		vehicles = vehicledao.findByTypeAndWlOwner("Wagon", owner);
		assertEquals(true, vehicles.isEmpty());
	}
}
