package be.lesgoblins.yggdrasil.common.persistance.interceptor;

import org.hibernate.CallbackException;
import org.hibernate.HibernateException;
import org.hibernate.Interceptor;
import org.hibernate.event.spi.LoadEvent;
import org.hibernate.event.spi.LoadEventListener;
import org.hibernate.type.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

public class LoadListener implements LoadEventListener, Serializable {

    Logger logger = LoggerFactory.getLogger(LoadListener.class);


    @Override
    public void onLoad(LoadEvent loadEvent, LoadType loadType) throws HibernateException {

    }
}
