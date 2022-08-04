package lk.ijse.easy_car_rental.controller;



import lk.ijse.easy_car_rental.dto.CarsDTO;
import lk.ijse.easy_car_rental.dto.DriverDTO;
import lk.ijse.easy_car_rental.service.DriverService;
import lk.ijse.easy_car_rental.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

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
    @PostMapping(consumes = {MediaType.MULTIPART_FORM_DATA_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseUtil postDriver(@RequestPart("file") MultipartFile[] file){

        for (MultipartFile myFile : file) {
            try {
                String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
                File uploadsDir = new File(projectPath + "/uploads");
                uploadsDir.mkdir();
                myFile.transferTo(new File(uploadsDir.getAbsolutePath() + "/" + myFile.getOriginalFilename()));
                System.out.println(projectPath);
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
                return new ResponseUtil(500, "Registration Failed.Try Again Latter", null);
            }
        }

//         driverDTO.setDriLicence_ImgNIC("uploads/" + driverDTO.getDriLicence_ImgNIC());
//        driverService.saveDriver(driverDTO);
//        System.out.println("===============================================");
//        System.out.println(driverDTO.getDriLicence_ImgNIC());
//        System.out.println("===============================================");
//        System.out.println("===============================================");
//        System.out.println(driverDTO.toString());
//        System.out.println("===============================================");
//        driverService.saveDriver(driverDTO);
        return new ResponseUtil(200,"Driver Details Updated",null);
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseUtil saveCars(@RequestBody DriverDTO driverDTO) {
        System.out.println("=========================");
        System.out.println("=========================");
        driverService.saveDriver(driverDTO);
        return new ResponseUtil(200,"Save",null);
    }




















//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public  ResponseUtil saveDriver(@RequestBody DriverDTO driverDTO) {
//        driverService.saveDriver(driverDTO);
//        return new ResponseUtil(200,"Save",null);
//    }

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
