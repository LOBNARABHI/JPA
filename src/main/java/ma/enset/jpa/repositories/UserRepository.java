package ma.enset.jpa.repositories;

import ma.enset.jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User,String> {
    User findByUsername(String userName);
}
