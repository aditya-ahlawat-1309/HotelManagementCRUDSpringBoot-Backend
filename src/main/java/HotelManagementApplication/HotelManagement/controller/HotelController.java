package HotelManagementApplication.HotelManagement.controller;

import HotelManagementApplication.HotelManagement.model.Hotel;
import HotelManagementApplication.HotelManagement.services.HotelService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {

    HotelService hotelService;

    public HotelController(HotelService hotelService){
        this.hotelService = hotelService;
    }

    @GetMapping("/api/getHotel")
    public ResponseEntity<List<Hotel>> getAllHotel(){
        List<Hotel> hotels = hotelService.getHotel();
        return new ResponseEntity<>(hotels, HttpStatus.OK);
    }

   @PostMapping("/api/postHotel")
    public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel)
   {
       Hotel hotel1 = hotelService.insert(hotel);
       HttpHeaders httpHeaders = new HttpHeaders();
       httpHeaders.add("hotel","/api/postHotel" + hotel1.getId().toString());
       return new ResponseEntity<>(hotel1, httpHeaders, HttpStatus.CREATED);
   }

}
