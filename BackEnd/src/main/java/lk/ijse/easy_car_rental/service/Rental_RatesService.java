package lk.ijse.easy_car_rental.service;

import lk.ijse.easy_car_rental.dto.Rental_RatesDTO;
import lk.ijse.easy_car_rental.dto.UserDTO;

import java.util.List;

public interface Rental_RatesService {

    void saveRent_Rate(Rental_RatesDTO rentalRates);
    void deleteRent_Rate(String id);
    void updateRent_Rate(Rental_RatesDTO rentalRates);
    Rental_RatesDTO searchRent_Rate(String id);
    List<Rental_RatesDTO> getAllRent_Rate();

}
