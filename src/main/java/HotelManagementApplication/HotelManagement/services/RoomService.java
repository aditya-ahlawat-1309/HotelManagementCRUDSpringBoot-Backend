package HotelManagementApplication.HotelManagement.services;

import HotelManagementApplication.HotelManagement.model.Room;

import java.util.List;

public interface RoomService {

    List<Room> getRoom();
    Room insert(Room room);

}
