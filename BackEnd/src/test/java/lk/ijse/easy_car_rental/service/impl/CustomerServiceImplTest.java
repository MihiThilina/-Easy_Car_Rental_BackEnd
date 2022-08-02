package lk.ijse.easy_car_rental.service.impl;

import lk.ijse.easy_car_rental.config.WebAppConfig;
import lk.ijse.easy_car_rental.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@WebAppConfiguration
@ContextConfiguration(classes = {WebAppConfig.class})
@ExtendWith(SpringExtension.class)
@Transactional
class CustomerServiceImplTest {

    @Autowired
    CustomerService customerService;


    @Test
    void saveCustomer() {
    }

    @Test
    void deleteCustomer() {
        //Add multiple customers

        // delete existing customer
        assertDoesNotThrow(()->{
            customerService.deleteCustomer("830424252V");
        });

        //delete an non existing customer
        assertThrows(RuntimeException.class,()->{
            customerService.deleteCustomer("830424252V");
        });

    }

    @Test
    void updateCustomer() {
    }

    @Test
    void searchCustomer() {
    }

    @Test
    void getAllCustomer() {
    }
}