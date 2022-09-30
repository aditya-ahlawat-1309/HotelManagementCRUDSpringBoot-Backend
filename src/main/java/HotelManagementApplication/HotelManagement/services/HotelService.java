package HotelManagementApplication.HotelManagement.services;

import HotelManagementApplication.HotelManagement.model.Hotel;

import java.util.List;

public interface HotelService {

    List<Hotel> getHotel();
    Hotel insert(Hotel hotel);

}
