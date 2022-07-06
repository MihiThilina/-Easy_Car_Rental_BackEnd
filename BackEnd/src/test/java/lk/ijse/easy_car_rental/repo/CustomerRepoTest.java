package lk.ijse.easy_car_rental.repo;

import lk.ijse.easy_car_rental.config.JPAConfig;
import lk.ijse.easy_car_rental.entity.Customer;
import lk.ijse.easy_car_rental.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.*;

@WebAppConfiguration
@ContextConfiguration(classes = {JPAConfig.class})
@ExtendWith(SpringExtension.class)
class CustomerRepoTest {


    @Autowired
    CustomerRepo customerRepo;

    @Test
    public  void  saveCustomer(){

        Customer customer = new Customer(
                "890424252V",
                "neth123435678",
                "Gayathree",
                "Thalpitiya",
                "0774914870",
                "nethminiGayathree@Gmail.com",
                "123456789",
                new User(
                        "U001",
                        "Dasun",
                        "Galle12345",
                        "Driver"
                )
                );
        customerRepo.save(customer);
    }

}