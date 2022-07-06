package lk.ijse.easy_car_rental.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ResponseUtil {
    private int code;
    private String message;
    private Object data;
}