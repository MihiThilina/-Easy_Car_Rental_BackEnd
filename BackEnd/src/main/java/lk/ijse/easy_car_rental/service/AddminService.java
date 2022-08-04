package lk.ijse.easy_car_rental.service;

import lk.ijse.easy_car_rental.dto.AddminDTO;
import lk.ijse.easy_car_rental.dto.UserDTO;

public interface AddminService {

    void saveAddmin(AddminDTO addminDTO);
    AddminDTO getUserForLogin(UserDTO userDTO);

}
