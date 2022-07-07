package lk.ijse.easy_car_rental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.context.annotation.Import;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@IdClass(BookingCar_PK.class)
public class BookingDetails {
   @Id
   private String booking_ID;
   @Id
   private String registration_Number;

   private LocalDate date;
   private LocalTime time;


   @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
   @JoinColumn(name = "booking_ID",referencedColumnName = "booking_ID",insertable = false,updatable = false)
   private Booking booking;

   @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
   @JoinColumn(name = "registration_Number",referencedColumnName = "registration_Number",insertable = false,updatable = false)
   private Cars cars;



}
