package lk.ijse.easy_car_rental.service.impl;

import lk.ijse.easy_car_rental.dto.CarsDTO;
import lk.ijse.easy_car_rental.dto.CustomerDTO;
import lk.ijse.easy_car_rental.entity.Cars;
import lk.ijse.easy_car_rental.entity.Customer;
import lk.ijse.easy_car_rental.repo.CarsRepo;
import lk.ijse.easy_car_rental.service.CarsService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CarsServiceImpl implements CarsService {

    @Autowired
    CarsRepo carsRepo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveCars(CarsDTO cars) {
        if(!carsRepo.existsById(cars.getRegistration_Number())){
            carsRepo.save(mapper.map(cars, Cars.class));
        }else {
            throw new RuntimeException("Customer Already Exist..!");
        }
    }

    @Override
    public void deleteCars(String id) {
        if(carsRepo.existsById(id)){
            carsRepo.deleteById(id);
        }else {
            throw new RuntimeException("Please check the ID.. No Such Cars..!");
        }
    }

    @Override
    public void updateCars(CarsDTO cars) {
        if (carsRepo.existsById(cars.getRegistration_Number())) {
            carsRepo.save(mapper.map(cars,Cars.class));
        } else {
            throw new RuntimeException("No Such Cars To Update..! Please Check the ID..!");
        }
    }

    @Override
    public CarsDTO searchCars(String id) {
        if (carsRepo.existsById(id)){
            return mapper.map(carsRepo.findById(id).get(), CarsDTO.class);
        }else{
            throw new RuntimeException("No Cars For "+id+" ..!");
        }
    }

    @Override
    public List<CarsDTO> getAllCars() {
        return mapper.map(carsRepo.findAll(), new TypeToken<List<CarsDTO>>() {}.getType());
    }
}
