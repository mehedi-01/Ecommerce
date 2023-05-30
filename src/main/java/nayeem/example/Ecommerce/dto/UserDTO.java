package nayeem.example.Ecommerce.dto;

import lombok.Data;
import nayeem.example.Ecommerce.enums.UserRole;

@Data

public class UserDTO {
    private Long id;

    private String name;

    private String email;

    private String password;

    public UserRole userRole;

    private byte[] img;

    public UserDTO(Long id, String email, String name, UserRole userRole) {
    }
}
