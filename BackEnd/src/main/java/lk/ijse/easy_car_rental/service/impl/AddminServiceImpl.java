package lk.ijse.easy_car_rental.service.impl;

import lk.ijse.easy_car_rental.dto.AddminDTO;
import lk.ijse.easy_car_rental.dto.UserDTO;
import lk.ijse.easy_car_rental.entity.Addmin;
import lk.ijse.easy_car_rental.repo.AddminRepo;
import lk.ijse.easy_car_rental.service.AddminService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AddminServiceImpl implements AddminService {

    @Autowired
    AddminRepo addminRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void saveAddmin(AddminDTO addminDTO) {
        if(!addminRepo.existsById(addminDTO.getUserID())){
            addminRepo.save(modelMapper.map(addminDTO, Addmin.class));
        }else {
            throw new RuntimeException("Addmin Already Exist..!");
        }
    }

    @Override
    public AddminDTO getUserForLogin(UserDTO userDTO) {
        List<Addmin> all = addminRepo.findAll();
        for (Addmin addmin: all) {
            if(addmin.getUserID().equals(userDTO.getUserName()) & addmin.getPassword().equals(userDTO.getPassword())){
                return new AddminDTO(addmin.getUserID(),addmin.getUserName(),addmin.getPassword());
            }
        }
        return null;
    }
}
