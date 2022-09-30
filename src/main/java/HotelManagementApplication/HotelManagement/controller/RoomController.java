package HotelManagementApplication.HotelManagement.controller;

import HotelManagementApplication.HotelManagement.model.Room;
import HotelManagementApplication.HotelManagement.services.RoomService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomController {

    RoomService roomService;

    public RoomController(RoomService roomService){
        this.roomService = roomService;
    }

    @GetMapping("/api/getRoom")
    public ResponseEntity<List<Room>> getAllRoom(){
        List<Room> rooms = roomService.getRoom();
        return new ResponseEntity<>(rooms, HttpStatus.OK);
    }

    @PostMapping("/api/postRoom")
    public ResponseEntity<Room> saveRoom(@RequestBody Room room)
    {
        Room room1 = roomService.insert(room);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("room","/api/postRoom" + room1.getId().toString());
        return new ResponseEntity<>(room1, httpHeaders, HttpStatus.CREATED);
    }

}
