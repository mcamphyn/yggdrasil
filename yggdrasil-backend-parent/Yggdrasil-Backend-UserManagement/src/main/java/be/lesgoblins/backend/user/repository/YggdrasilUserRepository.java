package be.lesgoblins.backend.user.repository;

import be.lesgoblins.backend.user.entity.YggdrasilUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface YggdrasilUserRepository extends JpaRepository<YggdrasilUser,Long> {

    List<YggdrasilUser> findByOrderById();
    List<YggdrasilUser> findByOrderByUsername();

}
