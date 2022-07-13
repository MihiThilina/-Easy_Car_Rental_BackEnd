package lk.ijse.easy_car_rental.repo;

import lk.ijse.easy_car_rental.entity.BookingDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDetailsRepo extends JpaRepository<BookingDetails,String> {
}
