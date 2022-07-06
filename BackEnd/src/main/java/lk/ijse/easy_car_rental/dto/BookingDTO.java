package lk.ijse.easy_car_rental.dto;

import lk.ijse.easy_car_rental.entity.Payment;

import java.time.LocalDate;

public class BookingDTO {
    private String booking_ID;
    private CustomerDTO customer;

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
