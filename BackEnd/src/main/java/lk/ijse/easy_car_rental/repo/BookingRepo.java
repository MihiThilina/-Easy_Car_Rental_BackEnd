package lk.ijse.easy_car_rental.repo;

import lk.ijse.easy_car_rental.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<Booking,String> {
}
