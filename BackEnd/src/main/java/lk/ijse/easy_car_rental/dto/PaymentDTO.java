package lk.ijse.easy_car_rental.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class PaymentDTO {
    private String payID;
    private String totalKM;
    private String status;
    private double total_price;
    private String currently_run_km;
}
