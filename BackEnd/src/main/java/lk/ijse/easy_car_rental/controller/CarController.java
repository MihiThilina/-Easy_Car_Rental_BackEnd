package lk.ijse.easy_car_rental.controller;


import lk.ijse.easy_car_rental.dto.CarsDTO;
import lk.ijse.easy_car_rental.dto.CustomerDTO;
import lk.ijse.easy_car_rental.service.CarsService;
import lk.ijse.easy_car_rental.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cars")
@CrossOrigin
public class CarController {

    @Autowired
    CarsService carsService;

    @GetMapping
    public ResponseUtil getAllCars() {
        return new ResponseUtil(
                200,"Ok",carsService.getAllCars());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseUtil saveCars(@RequestBody CarsDTO carsDTO) {
        System.out.println("=========================");
        System.out.println(carsDTO.toString());
        System.out.println("=========================");
        carsService.saveCars(carsDTO);
        return new ResponseUtil(200,"Save",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseUtil updateCars(@RequestBody CarsDTO carsDTO) {
        carsService.updateCars(carsDTO);
        return new ResponseUtil(200,"Updated",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseUtil deleteCars(@RequestParam String id) {
        carsService.deleteCars(id);
        return new ResponseUtil(200,"Deleted",null);
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseUtil searchCars(@PathVariable String id) {
        return new ResponseUtil(200,"Ok",carsService.searchCars(id));
    }


}
