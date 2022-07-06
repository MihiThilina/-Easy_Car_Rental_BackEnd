package lk.ijse.easy_car_rental.service;


import lk.ijse.easy_car_rental.dto.UserDTO;

import java.util.List;

public interface UserService {

    void saveUser(UserDTO user);
    void deleteUser(String id);
    void updateUser(UserDTO entity);
    UserDTO searchUser(String id);
    List<UserDTO> getAllUser();

}
