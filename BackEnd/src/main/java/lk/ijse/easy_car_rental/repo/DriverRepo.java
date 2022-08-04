package lk.ijse.easy_car_rental.repo;

import lk.ijse.easy_car_rental.entity.BookingDetails;
import lk.ijse.easy_car_rental.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DriverRepo extends JpaRepository<Driver,String> {
    @Query(value = " select * from driver order by rand() limit 1; ", nativeQuery = true)
    Driver findDriverRandomly();
}
