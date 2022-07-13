package lk.ijse.easy_car_rental.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class DriverScheduleDTO {
    private String booking_ID;
    private String licence_ID;
    private String status;
    private String date;
    private String time;
}
