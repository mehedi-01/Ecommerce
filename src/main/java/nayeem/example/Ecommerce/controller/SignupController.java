package nayeem.example.Ecommerce.controller;

import nayeem.example.Ecommerce.dto.SignupDTO;
import nayeem.example.Ecommerce.dto.UserDTO;
import nayeem.example.Ecommerce.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SignupController {
    @Autowired

    private UserService userService;

    @PostMapping("/sign-up")

    public ResponseEntity<?> signupUser(@RequestBody SignupDTO signupDTO) {

        UserDTO createUser = userService.createUser(signupDTO);
        if ( createUser == null){

            return new ResponseEntity<>("User not  created. Come again later!", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(createUser,HttpStatus.CREATED);


    }
}
