package lk.ijse.easy_car_rental.service.impl;

import lk.ijse.easy_car_rental.dto.CustomerDTO;
import lk.ijse.easy_car_rental.dto.Rental_RatesDTO;
import lk.ijse.easy_car_rental.entity.Customer;
import lk.ijse.easy_car_rental.entity.Rental_Rates;
import lk.ijse.easy_car_rental.repo.Rental_RatesRepo;
import lk.ijse.easy_car_rental.service.Rental_RatesService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Rental_RatesServiceImpl implements Rental_RatesService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    Rental_RatesRepo rental_ratesRepo;

    @Override
    public void saveRent_Rate(Rental_RatesDTO rentalRates) {
        if(!rental_ratesRepo.existsById(rentalRates.getRental_ratesID())){
            rental_ratesRepo.save(modelMapper.map(rentalRates, Rental_Rates.class));
        }else {
            throw new RuntimeException("Rental_Rates Already Exist..!");
        }
    }

    @Override
    public void deleteRent_Rate(String id) {
        if(rental_ratesRepo.existsById(id)){
            rental_ratesRepo.deleteById(id);
        }else {
            throw new RuntimeException("Please check the Rental_Rates ID.. No Such Rental_Rates..!");
        }
    }

    @Override
    public void updateRent_Rate(Rental_RatesDTO rentalRates) {
        if (rental_ratesRepo.existsById(rentalRates.getRental_ratesID())) {
            rental_ratesRepo.save(modelMapper.map(rentalRates,Rental_Rates.class));
        } else {
            throw new RuntimeException("No Such Rental_Rates To Update..! Please Check the ID..!");
        }
    }

    @Override
    public Rental_RatesDTO searchRent_Rate(String id) {
        if (rental_ratesRepo.existsById(id)){
            return modelMapper.map(rental_ratesRepo.findById(id).get(), Rental_RatesDTO.class);
        }else{
            throw new RuntimeException("No Customer For "+id+" ..!");
        }
    }

    @Override
    public List<Rental_RatesDTO> getAllRent_Rate() {
        return modelMapper.map(rental_ratesRepo.findAll(), new TypeToken<List<Rental_RatesDTO>>() {}.getType());
    }
}
