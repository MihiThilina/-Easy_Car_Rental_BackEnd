package lk.ijse.easy_car_rental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class DriverBooking_PK implements Serializable {

    private String booking_ID;
    private String licence_ID;
}
