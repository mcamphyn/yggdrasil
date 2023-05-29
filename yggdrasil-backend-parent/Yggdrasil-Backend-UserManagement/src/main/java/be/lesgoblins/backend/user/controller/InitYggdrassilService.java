package be.lesgoblins.backend.user.controller;

import be.lesgoblins.backend.user.entity.YggdrasilUser;
import be.lesgoblins.backend.user.repository.YggdrasilUserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class InitYggdrassilService {

    @Autowired
    private YggdrasilUserRepository yggdrasilUserRepository;

    @PostConstruct
    public void init(){

        yggdrasilUserRepository.deleteAll();

        log.info("Init user ");
        YggdrasilUser user1 = new YggdrasilUser();
        user1.setUsername("Dark Vador");
        user1.setSecret("qdsfqsdfqsdqsdfqsdf");
        user1.setEmail("VadorD@empire.net");
        yggdrasilUserRepository.save(user1);

        YggdrasilUser user2 = new YggdrasilUser();
        user2.setUsername("Yoda");
        user2.setSecret("qdsfqsdfqsdqsdfqsdf");
        user2.setEmail("Yoda@jedi.org");
        yggdrasilUserRepository.save(user2);

        YggdrasilUser user3 = new YggdrasilUser();
        user3.setUsername("THX1138");
        user3.setSecret("qdsfqsdfqsdqsdfqsdf");
        user3.setEmail("THX1138@empire.net");
        yggdrasilUserRepository.save(user3);
    }
}
