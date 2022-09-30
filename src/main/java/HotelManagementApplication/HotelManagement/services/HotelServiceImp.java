package HotelManagementApplication.HotelManagement.services;

import HotelManagementApplication.HotelManagement.model.Hotel;
import HotelManagementApplication.HotelManagement.repositories.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelServiceImp implements HotelService{

    HotelRepository hotelRepository;

    public HotelServiceImp(HotelRepository hotelRepository){
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<Hotel> getHotel(){
        List<Hotel> hotels = new ArrayList<>();
        hotelRepository.findAll().forEach(hotels::add);
        return hotels;
    }


    @Override
    public Hotel insert(Hotel hotel){
        return hotelRepository.save(hotel);
    }

}
