package lk.ijse.easy_car_rental.controller;

import lk.ijse.easy_car_rental.service.UserService;
import lk.ijse.easy_car_rental.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class UserController {

    @Autowired
    UserService service;

    @GetMapping
    public ResponseUtil getAllUsers(){
        return new ResponseUtil(200,"ok",service.getAllUser());
    }

}
