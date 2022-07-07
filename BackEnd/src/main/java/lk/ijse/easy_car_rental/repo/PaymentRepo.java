package lk.ijse.easy_car_rental.repo;

import lk.ijse.easy_car_rental.entity.Payment;
import lk.ijse.easy_car_rental.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment,String> {
}
