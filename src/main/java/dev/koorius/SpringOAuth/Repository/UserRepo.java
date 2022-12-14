package dev.koorius.SpringOAuth.Repository;

import dev.koorius.SpringOAuth.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, String> {
    User findUserByEmail(String email);
}
