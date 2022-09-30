package HotelManagementApplication.HotelManagement.repositories;

import HotelManagementApplication.HotelManagement.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
