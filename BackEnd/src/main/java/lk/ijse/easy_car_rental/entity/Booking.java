package lk.ijse.easy_car_rental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Booking {
    @Id
    private String booking_ID;
    private LocalDate pickup_date;
    private LocalDate Drop_date;
    private String location;
    private String status;
    private String driver_status;
    private double price;
    private String cars;
    private double loss_damage;
    private String total_Days;
    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "nicNumber",referencedColumnName = "nicNumber",nullable = false)
    private Customer customer;
    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "payID",referencedColumnName = "payID",nullable = false)
    private Payment payment;

}
