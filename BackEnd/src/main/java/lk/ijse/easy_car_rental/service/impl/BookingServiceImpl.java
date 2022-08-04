package lk.ijse.easy_car_rental.service.impl;

import lk.ijse.easy_car_rental.dto.BookingDTO;
import lk.ijse.easy_car_rental.entity.Booking;
import lk.ijse.easy_car_rental.repo.BookingRepo;
import lk.ijse.easy_car_rental.repo.DriverScheduleRepo;
import lk.ijse.easy_car_rental.service.BookingService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepo bookingRepo;

    @Autowired
    DriverScheduleRepo driverScheduleRepo;

    @Autowired
    ModelMapper modelMapper;


    @Override
    public void saveBooking(BookingDTO booking) {
      Booking bookings = modelMapper.map(booking,Booking.class);
      if(!bookingRepo.existsById(booking.getBooking_ID())){

          Booking save = bookingRepo.save(bookings);
          if(booking.getBookingDetails().size()<1)throw new RuntimeException("No cars added for the booking..!");
          if(save!=null){

          }
      }else {
          throw new RuntimeException("Booking Failed..!" + booking.getBooking_ID() + " Already Exist.!");
      }
    }

    @Override
    public String getBookigLastID() {
        return bookingRepo.getBookingsByID();
    }

    @Override
    public void deleteBooking(String id) {

    }

    @Override
    public void updateBooking(BookingDTO booking) {

    }

    @Override
    public BookingDTO searchBooking(String id) {
        return null;
    }

    @Override
    public List<BookingDTO> getAllBooking() {
        return modelMapper.map(bookingRepo.findAll(), new TypeToken<List<BookingDTO>>() {}.getType());
    }
}
