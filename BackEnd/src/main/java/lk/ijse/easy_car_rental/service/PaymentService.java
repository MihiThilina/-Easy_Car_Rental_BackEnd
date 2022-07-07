package lk.ijse.easy_car_rental.service;

import lk.ijse.easy_car_rental.dto.PaymentDTO;
import lk.ijse.easy_car_rental.dto.UserDTO;

import java.util.List;

public interface PaymentService {

    void savePayment(PaymentDTO payment);
    PaymentDTO searchPayment(String id);
    List<PaymentDTO> getAllPayment();

}
