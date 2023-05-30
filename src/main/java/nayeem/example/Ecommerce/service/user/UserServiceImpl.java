package nayeem.example.Ecommerce.service.user;

import nayeem.example.Ecommerce.dto.SignupDTO;
import nayeem.example.Ecommerce.dto.UserDTO;
import nayeem.example.Ecommerce.entities.User;
import nayeem.example.Ecommerce.enums.UserRole;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements  UserService{

    @Override
    public UserDTO createUser(SignupDTO signupDTO) {
        User user = new User();
        user.setName(signupDTO.getName());
        user.setEmail(signupDTO.getEmail());
        user.setUserRole(UserRole.USER);
        user.setPassword(new BCryptPasswordEncoder().encode(signupDTO.getPassword()));
        return user.mapUserTouserDTO();
    }
}
