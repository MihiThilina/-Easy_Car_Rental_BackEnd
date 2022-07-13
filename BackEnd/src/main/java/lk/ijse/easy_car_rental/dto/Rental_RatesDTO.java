package lk.ijse.easy_car_rental.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Rental_RatesDTO {
    private String rental_ratesID;
    private double price_per_Extra;
    private String type;
    private String km_for_a_month;
    private String km_for_a_day;
    private String dailyRate;
    private String monthlyRate;
}
