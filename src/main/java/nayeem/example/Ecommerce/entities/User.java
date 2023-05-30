package nayeem.example.Ecommerce.entities;


import jakarta.persistence.*;
import lombok.Data;
import nayeem.example.Ecommerce.enums.UserRole;

@Entity
@Data
@Table(name = " users ")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    private String email;

    public UserRole userRole;

    private byte[] img;


}
