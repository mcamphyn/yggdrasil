package be.lesgoblins.yggdrasil.common.persistance.interceptor;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManagerFactory;
import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.hibernate.event.service.spi.EventListenerRegistry;
import org.hibernate.event.spi.EventType;
import org.hibernate.internal.SessionFactoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

@Service
@RequiredArgsConstructor
public class InitInterceptorService {
    Logger logger = LoggerFactory.getLogger(InitInterceptorService.class);
    private final EntityManagerFactory entityManagerFactory;

    @PostConstruct
    private void init(){

        System.out.println("Adding save and load entity interceptor ");
        logger.info("Adding save and load entity interceptor ");
        SessionFactoryImpl  sessionFactory = entityManagerFactory.unwrap(SessionFactoryImpl.class);


    }
}
