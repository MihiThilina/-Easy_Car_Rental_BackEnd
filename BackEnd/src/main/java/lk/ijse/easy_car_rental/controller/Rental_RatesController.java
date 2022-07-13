package lk.ijse.easy_car_rental.controller;


import lk.ijse.easy_car_rental.dto.CustomerDTO;
import lk.ijse.easy_car_rental.dto.Rental_RatesDTO;
import lk.ijse.easy_car_rental.service.Rental_RatesService;
import lk.ijse.easy_car_rental.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("rental_rates")
@CrossOrigin
public class Rental_RatesController {

    @Autowired
    Rental_RatesService rental_ratesService;

    @GetMapping
    public ResponseUtil getAllRental_Rates() {
        return new ResponseUtil(200,"Ok",rental_ratesService.getAllRent_Rate());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseUtil saveRental_Rates(@RequestBody Rental_RatesDTO rentalRatesDTO) {
        rental_ratesService.saveRent_Rate(rentalRatesDTO);
        return new ResponseUtil(200,"Save",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseUtil updateRental_Rates(@RequestBody Rental_RatesDTO rentalRatesDTO) {
        rental_ratesService.saveRent_Rate(rentalRatesDTO);
        return new ResponseUtil(200,"Updated",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseUtil deleteRental_Rates(@RequestParam String id) {
        rental_ratesService.deleteRent_Rate(id);
        return new ResponseUtil(200,"Deleted",null);
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseUtil searchRental_Rates(@PathVariable String id) {
        return new ResponseUtil(200,"Ok",rental_ratesService.searchRent_Rate(id));
    }

}
