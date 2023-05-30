package nayeem.example.Ecommerce.service.user;

import nayeem.example.Ecommerce.dto.SignupDTO;
import nayeem.example.Ecommerce.dto.UserDTO;

public interface UserService {
    UserDTO createUser(SignupDTO signupDTO);
}
