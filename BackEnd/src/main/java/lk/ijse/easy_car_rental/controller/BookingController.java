package lk.ijse.easy_car_rental.controller;


import lk.ijse.easy_car_rental.dto.BookingDTO;
import lk.ijse.easy_car_rental.service.BookingService;
import lk.ijse.easy_car_rental.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("booking")
@CrossOrigin
public class BookingController {

    @Autowired
    BookingService bookingService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveBooking(@RequestBody BookingDTO bookingDTO){
        System.out.println(bookingDTO.toString());
        bookingService.saveBooking(bookingDTO);
        return new ResponseUtil(200, "Save", null);
    }

}
