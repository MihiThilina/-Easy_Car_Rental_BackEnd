package lk.ijse.easy_car_rental.advisor;


import lk.ijse.easy_car_rental.util.ResponseUtil;
import org.modelmapper.ValidationException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author : Thilina
 * @since : 0.1.0
 **/

@CrossOrigin
@RestControllerAdvice
public class AppWideExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity Exception(Exception e) {
        return new ResponseEntity(new ResponseUtil(200, "Error", e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
