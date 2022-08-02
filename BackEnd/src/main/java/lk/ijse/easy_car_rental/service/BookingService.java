package lk.ijse.easy_car_rental.service;

import lk.ijse.easy_car_rental.dto.BookingDTO;
import lk.ijse.easy_car_rental.dto.UserDTO;

import java.util.List;

public interface BookingService {

    void saveBooking(BookingDTO booking);
    String getBookigLastID();
    void deleteBooking(String id);
    void updateBooking(BookingDTO booking);
    BookingDTO  searchBooking(String id);
    List<BookingDTO> getAllBooking();

}
