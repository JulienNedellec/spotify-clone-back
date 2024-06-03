package fr.codecake.spotify_clone.usercontext.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.codecake.spotify_clone.usercontext.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findOneByEmail(String email);

}
