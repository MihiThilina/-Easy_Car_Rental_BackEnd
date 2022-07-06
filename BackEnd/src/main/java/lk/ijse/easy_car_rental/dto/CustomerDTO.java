package lk.ijse.easy_car_rental.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CustomerDTO {
    private String nicNumber;
    private UserDTO user;
    private String  password;
    private String name;
    private String address;
    private String contact;
    private String email;
    private String license_number;
}
