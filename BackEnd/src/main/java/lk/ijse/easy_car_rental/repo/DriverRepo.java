package lk.ijse.easy_car_rental.repo;

import lk.ijse.easy_car_rental.entity.BookingDetails;
import lk.ijse.easy_car_rental.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepo extends JpaRepository<Driver,String> {
}
