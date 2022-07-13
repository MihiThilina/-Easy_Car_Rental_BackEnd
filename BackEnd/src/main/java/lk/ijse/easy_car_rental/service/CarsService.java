package lk.ijse.easy_car_rental.service;

import lk.ijse.easy_car_rental.dto.CarsDTO;


import java.util.List;

public interface CarsService {

    void saveCars(CarsDTO cars);
    void deleteCars(String id);
    void updateCars(CarsDTO cars);
    CarsDTO searchCars(String id);
    List<CarsDTO> getAllCars();

}
