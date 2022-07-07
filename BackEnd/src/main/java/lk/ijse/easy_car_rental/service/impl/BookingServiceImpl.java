package lk.ijse.easy_car_rental.service.impl;

import lk.ijse.easy_car_rental.dto.BookingDTO;
import lk.ijse.easy_car_rental.dto.UserDTO;
import lk.ijse.easy_car_rental.entity.Booking;
import lk.ijse.easy_car_rental.entity.Customer;
import lk.ijse.easy_car_rental.repo.BookingRepo;
import lk.ijse.easy_car_rental.service.BookingService;
import org.modelmapper.ModelMapper;
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
    ModelMapper modelMapper;


    @Override
    public void saveBooking(BookingDTO booking) {
        if(!bookingRepo.existsById(booking.getBooking_ID())){
            bookingRepo.save(modelMapper.map(booking, Booking.class));
        }else {
            throw new RuntimeException("Booking eka karannna ba..!");
        }
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
        return null;
    }
}
