package lk.ijse.easy_car_rental.repo;

import lk.ijse.easy_car_rental.entity.DriverSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverScheduleRepo extends JpaRepository<DriverSchedule,String> {

}
