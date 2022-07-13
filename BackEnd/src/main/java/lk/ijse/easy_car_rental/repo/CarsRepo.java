package lk.ijse.easy_car_rental.repo;

import lk.ijse.easy_car_rental.entity.Cars;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarsRepo extends JpaRepository<Cars,String> {
}
