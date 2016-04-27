package fxc.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import fxc.entity.Contro;
import fxc.entity.Owner;
import fxc.entity.Vehicle;

/**
 * 运力crud
 * 
 * @author Lenovo
 * 
 */
public interface VehicleDAO extends PagingAndSortingRepository<Vehicle, Long> {

	List<Vehicle> findByType(String type);

	List<Vehicle> findByWlOwner(Owner owner);

	List<Vehicle> findByTypeAndWlOwner(String type, Owner owner);

	Vehicle findByNumber(String number);

	List<Vehicle> findBywlOwner_wlController(Contro wlController);

}
