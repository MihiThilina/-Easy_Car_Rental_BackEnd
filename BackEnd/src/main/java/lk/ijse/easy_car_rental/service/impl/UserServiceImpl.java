package lk.ijse.easy_car_rental.service.impl;

import lk.ijse.easy_car_rental.dto.UserDTO;
import lk.ijse.easy_car_rental.entity.User;
import lk.ijse.easy_car_rental.repo.UserRepo;
import lk.ijse.easy_car_rental.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.net.PasswordAuthentication;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    ModelMapper mapper;

    @Autowired
    PasswordEncoder passwordEncoder;




    @Override
    public void saveUser(UserDTO user) {
        User use1 = new User();
        use1.setUserID(user.getUserID());
        use1.setUserName(user.getUserName());
        String encryptedPassword = passwordEncoder.encode(user.getPassword());
        use1.setPassword(encryptedPassword);
        use1.setType(user.getType());
    }


    @Override
    public void deleteUser(String id) {
       if (userRepo.existsById(id)){
           userRepo.deleteById(id);
       }else {
           throw new RuntimeException("Please check the User ID.. No Such Users..!");
       }
    }

    @Override
    public void updateUser(UserDTO entity) {
       if (userRepo.existsById(entity.getUserID())){
           userRepo.save(mapper.map(entity,User.class));
       }else {
           throw new RuntimeException("No Such User To Update..! Please Check the ID..!");
       }
    }

    @Override
    public UserDTO searchUser(String id) {
       if(userRepo.existsById(id)){
           return mapper.map(userRepo.findById(id).get(),UserDTO.class);
       }else{
           throw new RuntimeException("No User For "+id+" ..!");
       }
    }

    @Override
    public List<UserDTO> getAllUser() {
        return mapper.map(userRepo.findAll(),new TypeToken<List<UserDTO>>() {}.getType());
    }
}
