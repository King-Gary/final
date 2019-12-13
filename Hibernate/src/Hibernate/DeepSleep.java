/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

/**
 *
 * @author Gary
 */
import Hibernate.AnnotationConfiguration;
import javax.imageio.spi.ServiceRegistry;
import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class DeepSleep {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration().configure();
            ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
            registry.applySettings(configuration.getProperties());
            ServiceRegistry serviceRegistry = registry.buildServiceRegistry();
             
            sessionFactory = buildSessionFactory(serviceRegistry);            
        }
         
        return sessionFactory;
    }
    
    public static void shutdown()
   {
      getSessionFactory().close();
   }

    private static SessionFactory buildSessionFactory(ServiceRegistry serviceRegistry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
