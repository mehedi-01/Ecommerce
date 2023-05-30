package nayeem.example.Ecommerce.repository;


import nayeem.example.Ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findFirstByEmail (String email);




}
