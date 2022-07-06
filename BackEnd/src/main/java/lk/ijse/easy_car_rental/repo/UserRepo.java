package lk.ijse.easy_car_rental.repo;

import lk.ijse.easy_car_rental.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
}
