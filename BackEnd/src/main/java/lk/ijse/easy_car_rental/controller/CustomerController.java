package lk.ijse.easy_car_rental.controller;


import lk.ijse.easy_car_rental.dto.CustomerDTO;
import lk.ijse.easy_car_rental.service.CustomerService;
import lk.ijse.easy_car_rental.util.ResponseUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService customers;

    @GetMapping
    public ResponseUtil getAllCustomers() {
        return new ResponseUtil(200,"Ok",customers.getAllCustomer());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseUtil saveCustomer(@RequestBody CustomerDTO customer) {
        customers.saveCustomer(customer);
        return new ResponseUtil(200,"Save",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseUtil updateCustomer(@RequestBody CustomerDTO customer) {
        customers.updateCustomer(customer);
        return new ResponseUtil(200,"Updated",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseUtil deleteCustomer(@RequestParam String id) {
        customers.deleteCustomer(id);
        return new ResponseUtil(200,"Deleted",null);
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseUtil searchCustomer(@PathVariable String id) {
        return new ResponseUtil(200,"Ok",customers.searchCustomer(id));
    }




}
