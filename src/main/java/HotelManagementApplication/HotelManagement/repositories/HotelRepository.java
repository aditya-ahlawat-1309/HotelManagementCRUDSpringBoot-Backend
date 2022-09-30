package HotelManagementApplication.HotelManagement.repositories;

import HotelManagementApplication.HotelManagement.model.Hotel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends CrudRepository<Hotel,Long> {
}
