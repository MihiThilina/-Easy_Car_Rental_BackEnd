package lk.ijse.easy_car_rental.dto;

import lk.ijse.easy_car_rental.entity.Payment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class BookingDTO {
    private String booking_ID;
    private CustomerDTO customer;
    private PaymentDTO payment;
    private LocalDate pickup_date;
    private LocalDate Drop_date;
    private String location;
    private String status;
    private String driver_status;
    private double price;
    private String cars;
    private double loss_damage;
    private String total_Days;
}
