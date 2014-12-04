package app.model;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static SessionFactory sessionAnnotationFactory;
	private static SessionFactory sessionJavaConfigFactory;
	
	
	private static SessionFactory buildSessionAnnotationFactory() {
		try{
			Configuration configuration = new Configuration();
            /// @see http://www.journaldev.com/2882/hibernate-tutorial-for-beginners-using-xml-annotations-and-property-configurations
			//configuration.configure("hibernate-annotation.cfg.xml");
			//Create Properties, can be read from property files too
	        Properties props = new Properties();
	        props.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
	        props.put("hibernate.connection.url", "jdbc:mysql://localhost/TestDB");
	        props.put("hibernate.connection.username", "pankaj");
	        props.put("hibernate.connection.password", "pankaj123");
	        props.put("hibernate.current_session_context_class", "thread");
	         
	        configuration.setProperties(props);
	         
			configuration.addAnnotatedClass(Person.class);
			configuration.addAnnotatedClass(Admin.class);
			configuration.addAnnotatedClass(Costumer.class);
			configuration.addAnnotatedClass(Hostess.class);
			configuration.addAnnotatedClass(Room.class);
			configuration.addAnnotatedClass(Schedule.class);
			
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
			return sessionFactory;
		}
		catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
	}
	
	public static SessionFactory getSession(){
		return new AnnotationConfiguration().configure().buildSessionFactory();
	}
}
