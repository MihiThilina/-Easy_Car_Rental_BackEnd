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
public class Cars {
    @Id
    private String registration_Number;
    private String brand;
    private String type;
    private String passengers;
    private String transmission_type;
    private String fuel_Type;
    private String color;

    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "rental_ratesID",referencedColumnName = "rental_ratesID",nullable = false)
    private Rental_Rates rental_rates;

}
