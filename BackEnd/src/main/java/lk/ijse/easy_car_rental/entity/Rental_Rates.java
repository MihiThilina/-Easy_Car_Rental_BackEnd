package lk.ijse.easy_car_rental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Rental_Rates {
    @Id
    private String rental_ratesID;
    private double price_per_Extra;
    private String type;
    private String km_for_a_month;
    private String km_for_a_day;
    private String dailyRate;
    private String monthlyRate;
}
