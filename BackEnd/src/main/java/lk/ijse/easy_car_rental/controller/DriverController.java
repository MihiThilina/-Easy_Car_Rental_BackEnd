package lk.ijse.easy_car_rental.controller;


import lk.ijse.easy_car_rental.dto.CarsDTO;
import lk.ijse.easy_car_rental.dto.DriverDTO;
import lk.ijse.easy_car_rental.service.DriverService;
import lk.ijse.easy_car_rental.util.ResponseUtil;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("driver")
@CrossOrigin
public class DriverController {

    @Autowired
    DriverService driverService;

    @GetMapping
    public ResponseUtil getAllDriver() {
        return new ResponseUtil(200,"Ok",driverService.getAllDriver());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseUtil saveDriver(@RequestBody DriverDTO driverDTO) {
        driverService.saveDriver(driverDTO);
        return new ResponseUtil(200,"Save",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseUtil updateDriver(@RequestBody DriverDTO driverDTO) {
        driverService.saveDriver(driverDTO);
        return new ResponseUtil(200,"Updated",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseUtil deleteDriver(@RequestParam String id) {
        driverService.deleteDriver(id);
        return new ResponseUtil(200,"Deleted",null);
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseUtil searchCars(@PathVariable String id) {
        return new ResponseUtil(200,"Ok",driverService.searchDriver(id));
    }


}
