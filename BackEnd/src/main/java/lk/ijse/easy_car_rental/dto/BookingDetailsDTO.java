package lk.ijse.easy_car_rental.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class BookingDetailsDTO {
    private String booking_ID;
    private String registration_Number;
    private String date;
    private String time;
}
