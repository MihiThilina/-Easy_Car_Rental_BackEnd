package lk.ijse.easy_car_rental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Booking {
    @Id
    private String booking_ID;
    private String drop_time;
    private String driver_status;
    private String cars;
    private double loss_damage;
    private String pickup_date;
    private String pickup_time;
    private String drop_date;
    private String total_Days;
    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "nicNumber",referencedColumnName = "nicNumber",nullable = false)
    private Customer customer;

//    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
//    @JoinColumn(name = "payID",referencedColumnName = "payID",nullable = false)
//    private Payment payment;



    @OneToMany(mappedBy = "booking",cascade = CascadeType.ALL)
    private List<BookingDetails> bookingDetails;

    @OneToMany(mappedBy = "booking",cascade = CascadeType.ALL)
    private List<DriverSchedule> driverSchedules;



}
