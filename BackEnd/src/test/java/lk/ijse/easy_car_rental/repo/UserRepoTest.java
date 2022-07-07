package lk.ijse.easy_car_rental.repo;

import lk.ijse.easy_car_rental.config.JPAConfig;
import lk.ijse.easy_car_rental.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@WebAppConfiguration
@ContextConfiguration(classes = {JPAConfig.class})
@ExtendWith(SpringExtension.class)
class UserRepoTest {

    @Autowired
    UserRepo userRepo;

    @Test
    public  void  saveUser(){
        User user = new User("U0069", "Dasun", "Galle12345", "Driver");
        userRepo.save(user);
        System.out.println(user);
    }

    @Test
    public void getAlUser() {
        List<User> all = userRepo.findAll();
        for (User user : all) {
            System.out.println(user.toString());
        }
    }

}