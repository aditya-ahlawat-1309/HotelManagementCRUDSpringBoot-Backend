package HotelManagementApplication.HotelManagement.services;

import HotelManagementApplication.HotelManagement.model.Room;
import HotelManagementApplication.HotelManagement.repositories.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomServiceImp implements RoomService{

    RoomRepository roomRepository;

    public RoomServiceImp(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

    @Override
    public List<Room> getRoom() {
        List<Room> rooms = new ArrayList<>();
        roomRepository.findAll().forEach(rooms::add);
        return rooms;
    }

    @Override
    public Room insert(Room room) {
        return roomRepository.save(room);
    }
}
