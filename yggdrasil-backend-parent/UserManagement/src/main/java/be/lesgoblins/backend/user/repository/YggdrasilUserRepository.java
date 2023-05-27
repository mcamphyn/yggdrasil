package be.lesgoblins.backend.user.repository;

import be.lesgoblins.backend.user.entity.YggdrasilUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YggdrasilUserRepository extends JpaRepository<YggdrasilUser,Long> {

}
