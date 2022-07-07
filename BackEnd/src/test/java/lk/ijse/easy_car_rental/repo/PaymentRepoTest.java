package lk.ijse.easy_car_rental.repo;

import lk.ijse.easy_car_rental.config.JPAConfig;
import lk.ijse.easy_car_rental.entity.Payment;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;


@WebAppConfiguration
@ContextConfiguration(classes = {JPAConfig.class})
@ExtendWith(SpringExtension.class)
class PaymentRepoTest {

    @Autowired
    PaymentRepo paymentRepo;

    @Test
    public  void  savePayment(){
        Payment payment = new Payment(
                "P0001",
                "12KM",
                "No Driver",
                         20000,
                "23"
        );

        paymentRepo.save(payment);

    }


}