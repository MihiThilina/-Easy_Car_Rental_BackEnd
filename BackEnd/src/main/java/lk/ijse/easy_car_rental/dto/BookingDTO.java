package lk.ijse.easy_car_rental.dto;

import lk.ijse.easy_car_rental.entity.Customer;
import lk.ijse.easy_car_rental.entity.DriverSchedule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class BookingDTO {

    private String booking_ID;
    private String pickup_date;
   //private String drop_date;
    private String location;
    private String status;
    private String driver_status;
    private double price;
    private String cars;
    private double loss_damage;
    private String total_Days;
    private CustomerDTO customer;
//  private Payment payment;
    private List<BookingDetailsDTO> bookingDetails;
    private List<DriverScheduleDTO> driverSchedules;
}
