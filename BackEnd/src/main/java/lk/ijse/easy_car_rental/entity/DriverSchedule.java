package lk.ijse.easy_car_rental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@IdClass(DriverBooking_PK.class)
public class DriverSchedule {
    @Id
    private String booking_ID;
    @Id
    private String licence_ID;
    private String status;
    private String date;
    private String time;

    @ManyToOne
    @JoinColumn(name = "booking_ID",referencedColumnName = "booking_ID",insertable = false,updatable = false)
    private Booking booking;

    @ManyToOne
    @JoinColumn(name = "licence_ID",referencedColumnName = "licence_ID",insertable = false,updatable = false)
    private Driver driver;


}
