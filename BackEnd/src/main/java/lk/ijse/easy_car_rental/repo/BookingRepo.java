package lk.ijse.easy_car_rental.repo;

import lk.ijse.easy_car_rental.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookingRepo extends JpaRepository<Booking,String> {

     @Query(value="select booking_Id from booking order by booking_Id DESC limit 1",nativeQuery=true)
     String getBookingsByID();



}
