package lk.ijse.easy_car_rental.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CarsDTO {
    private String registration_Number;
    private Rental_RatesDTO rental_rates;
    private String brand;
    private String type;
    private String passengers;
    private String transmission_type;
    private String fuel_Type;
    private String color;

}
