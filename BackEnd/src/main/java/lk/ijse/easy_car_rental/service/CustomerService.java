package lk.ijse.easy_car_rental.service;

import lk.ijse.easy_car_rental.dto.CustomerDTO;
import lk.ijse.easy_car_rental.dto.UserDTO;

import java.util.List;

public interface CustomerService {

    void saveCustomer(CustomerDTO customer);
    void deleteCustomer(String id);
    void updateCustomer(CustomerDTO customer);
    CustomerDTO searchCustomer(String id);
    List<CustomerDTO> getAllCustomer();

}
