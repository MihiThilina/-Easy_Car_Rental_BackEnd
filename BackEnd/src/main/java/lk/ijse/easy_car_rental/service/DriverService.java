package lk.ijse.easy_car_rental.service;

import lk.ijse.easy_car_rental.dto.CustomerDTO;
import lk.ijse.easy_car_rental.dto.DriverDTO;
import lk.ijse.easy_car_rental.dto.UserDTO;

import java.util.List;

public interface DriverService {

    DriverDTO getUserForLogin(UserDTO userDTO);
    void saveDriver(DriverDTO driver);
    void deleteDriver(String id);
    void updateDriver(DriverDTO driver);
    DriverDTO searchDriver(String id);
    List<DriverDTO> getAllDriver();
    public DriverDTO getRandomDriver();
}
