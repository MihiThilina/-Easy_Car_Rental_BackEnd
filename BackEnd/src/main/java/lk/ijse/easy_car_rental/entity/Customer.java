package lk.ijse.easy_car_rental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.ColumnTransformer;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Customer {
    @Id
    private String nicNumber;
//    @ColumnTransformer(
//            read = "PGP_SYM_DECRYPT(email, 'secret-key-12345')",
//            write = "PGP_SYM_ENCRYPT (?, 'secret-key-12345')"
//    )
    private String  password;
    private String name;
    private String address;
    private String contact;
    private String email;
    private String license_number;

}
