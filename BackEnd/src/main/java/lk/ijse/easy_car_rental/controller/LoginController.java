package lk.ijse.easy_car_rental.controller;


import lk.ijse.easy_car_rental.dto.AddminDTO;
import lk.ijse.easy_car_rental.dto.CustomerDTO;
import lk.ijse.easy_car_rental.dto.DriverDTO;
import lk.ijse.easy_car_rental.dto.UserDTO;
import lk.ijse.easy_car_rental.service.AddminService;
import lk.ijse.easy_car_rental.service.CustomerService;
import lk.ijse.easy_car_rental.service.DriverService;
import lk.ijse.easy_car_rental.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
@CrossOrigin
public class LoginController {

    @Autowired
    DriverService driverService;
    @Autowired
    AddminService addminService;
    @Autowired
    CustomerService customerService;


    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil checkLoging(@RequestBody UserDTO userDTO){
        System.out.println(userDTO.toString());
        CustomerDTO customerDTO = customerService.getUserForLogin(userDTO);
        if(customerDTO==null){
            DriverDTO driverForLoging = driverService.getUserForLogin(userDTO);
            if(driverForLoging==null){
                AddminDTO adminForLoging = addminService.getUserForLogin(userDTO);
                if (!(adminForLoging==null)){
                    return new ResponseUtil(200,"Admin",adminForLoging);
                }else {
                    return new ResponseUtil(200,"Incorrect user name and password",null);
                }
            }else {
                return new ResponseUtil(200,"Driver",driverForLoging);
            }
        }else {
            return new ResponseUtil(200,"Customer",customerDTO);
        }

    }



}
