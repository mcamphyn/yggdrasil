package be.lesgoblins.backend.user.controller;

import be.lesgoblins.backend.user.entity.YggdrasilUser;
import be.lesgoblins.backend.user.repository.YggdrasilUserRepository;

import be.lesgoblins.yggdrasil.common.persistance.interceptor.InitInterceptorService;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManagerFactory;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.event.service.spi.EventListenerRegistry;
import org.hibernate.internal.SessionFactoryImpl;

import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class YggdrasilUserController {
    @Autowired
    private YggdrasilUserRepository yggdrasilUserRepository;
    public void addNewUser(YggdrasilUser yggdrasilUser){
        yggdrasilUserRepository.save(yggdrasilUser);
    }
    public List<YggdrasilUser> getListOfUser(){
        return yggdrasilUserRepository.findByOrderByUsername();
    }
}
