package lk.ijse.dep9.orm.util;

import lk.ijse.dep9.orm.entity.Actor;
import lk.ijse.dep9.orm.entity.Movie;
import lk.ijse.dep9.orm.entity.MovieActor;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                .loadProperties("/application.properties")
                .build();

        Metadata metadata = new MetadataSources(standardRegistry)
//                .addAnnotatedClasses(Customer.class)
//                .addAnnotatedClasses(Employee.class, Spouse.class)
//                .addAnnotatedClasses(Student.class, Mobile.class)
//                .addAnnotatedClasses(Manager2.class, Car2.class, Car2Manager2.class)
//                .addAnnotatedClasses(Customer.class, Order.class)
//                .addAnnotatedClasses(Guradian.class, Kid.class)
//                .addAnnotatedClasses(Member.class, Department.class)
//                .addAnnotatedClasses(Client.class, Invoice.class, ClientInvoice2.class)
                .addAnnotatedClasses(Actor.class, Movie.class, MovieActor.class)
                .getMetadataBuilder()
                .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE)
                .build();

        return metadata.getSessionFactoryBuilder().build();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
