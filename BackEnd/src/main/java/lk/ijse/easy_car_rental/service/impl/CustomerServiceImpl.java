package lk.ijse.easy_car_rental.service.impl;

import lk.ijse.easy_car_rental.dto.CustomerDTO;
import lk.ijse.easy_car_rental.entity.Customer;
import lk.ijse.easy_car_rental.repo.CustomerRepo;
import lk.ijse.easy_car_rental.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    ModelMapper mapper;

    @Autowired
    PasswordEncoder passwordEncoder;



    @Override
    public void saveCustomer(CustomerDTO customer) {
        if(!customerRepo.existsById(customer.getNicNumber())){
            customerRepo.save(mapper.map(customer, Customer.class));
        }else {
            throw new RuntimeException("Customer Already Exist..!");
        }
    }

    @Override
    public void deleteCustomer(String id) {
        if(customerRepo.existsById(id)){
            customerRepo.deleteById(id);
        }else {
            throw new RuntimeException("Please check the Customer ID.. No Such Customer..!");
        }
    }

    @Override
    public void updateCustomer(CustomerDTO customer) {
        if (customerRepo.existsById(customer.getNicNumber())) {
            customerRepo.save(mapper.map(customer,Customer.class));
        } else {
            throw new RuntimeException("No Such Customer To Update..! Please Check the ID..!");
        }
    }

    @Override
    public CustomerDTO searchCustomer(String id) {
        if (customerRepo.existsById(id)){
            return mapper.map(customerRepo.findById(id).get(),CustomerDTO.class);
        }else{
            throw new RuntimeException("No Customer For "+id+" ..!");
        }
    }

    @Override
    public List<CustomerDTO> getAllCustomer() {
        return mapper.map(customerRepo.findAll(), new TypeToken<List<CustomerDTO>>() {}.getType());
    }
}
