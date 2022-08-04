package lk.ijse.easy_car_rental.service.impl;

import lk.ijse.easy_car_rental.dto.DriverDTO;
import lk.ijse.easy_car_rental.dto.UserDTO;
import lk.ijse.easy_car_rental.entity.Driver;
import lk.ijse.easy_car_rental.repo.DriverRepo;
import lk.ijse.easy_car_rental.service.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class DriverServiceImpl implements DriverService {

    @Autowired
    DriverRepo driverRepo;
    @Autowired
    ModelMapper modelMapper;


    @Override
    public DriverDTO getUserForLogin(UserDTO userDTO) {
        List<Driver> all = driverRepo.findAll();
        for (Driver driver: all) {
           if (driver.getName().equals(userDTO.getUserName()) & driver.getLicence_ID().equals(userDTO.getPassword())){
               return  new DriverDTO(driver.getLicence_ID(),driver.getName(),driver.getAddress(),driver.getContact(),driver.getSalary(),driver.getDriLicence_ImgNIC());
           }
        }
        return  null;
    }

    @Override
    public void saveDriver(DriverDTO driver) {
        if(!driverRepo.existsById(driver.getLicence_ID())){
            driverRepo.save(modelMapper.map(driver, Driver.class));
        }else {
            throw new RuntimeException("Driver Already Exist..!");
        }
    }

    @Override
    public void deleteDriver(String id) {
        if(driverRepo.existsById(id)){
            driverRepo.deleteById(id);
        }else {
            throw new RuntimeException("Please check the Driver ID.. No Such Driver..!");
        }
    }

    @Override
    public void updateDriver(DriverDTO driver) {
        if (driverRepo.existsById(driver.getLicence_ID())) {
            driverRepo.save(modelMapper.map(driver,Driver.class));
        } else {
            throw new RuntimeException("No Such Driver To Update..! Please Check the ID..!");
        }
    }

    @Override
    public DriverDTO searchDriver(String id) {
        if (driverRepo.existsById(id)){
            return modelMapper.map(driverRepo.findById(id).get(), DriverDTO.class);
        }else{
            throw new RuntimeException("No Driver For "+id+" ..!");
        }
    }

    @Override
    public List<DriverDTO> getAllDriver() {
        return modelMapper.map(driverRepo.findAll(), new TypeToken<List<DriverDTO>>() {}.getType());
    }

    @Override
    public DriverDTO getRandomDriver() {
        Driver driverRandomly = driverRepo.findDriverRandomly();
        DriverDTO driverDTO =modelMapper.map(driverRandomly, DriverDTO.class);
        return driverDTO;
    }
}
