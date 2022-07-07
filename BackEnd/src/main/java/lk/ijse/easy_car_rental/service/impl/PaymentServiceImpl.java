package lk.ijse.easy_car_rental.service.impl;

import lk.ijse.easy_car_rental.dto.PaymentDTO;
import lk.ijse.easy_car_rental.entity.Payment;
import lk.ijse.easy_car_rental.repo.PaymentRepo;
import lk.ijse.easy_car_rental.service.PaymentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepo paymentRepo;
    @Autowired
    ModelMapper mapper;

    @Override
    public void savePayment(PaymentDTO payment) {

        if (!paymentRepo.existsById(payment.getPayID())){
            paymentRepo.save(mapper.map(payment, Payment.class));
        }else {
            throw new RuntimeException("Payment Already Exist..!");
        }
    }

    @Override
    public PaymentDTO searchPayment(String id) {
        return null;
    }

    @Override
    public List<PaymentDTO> getAllPayment() {
        return null;
    }
}
