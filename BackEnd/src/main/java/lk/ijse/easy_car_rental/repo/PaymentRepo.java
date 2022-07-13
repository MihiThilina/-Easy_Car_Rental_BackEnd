package lk.ijse.easy_car_rental.repo;

import lk.ijse.easy_car_rental.entity.Payment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment,String> {
}
