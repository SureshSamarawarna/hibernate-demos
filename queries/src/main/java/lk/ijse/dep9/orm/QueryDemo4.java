package lk.ijse.dep9.orm;

import lk.ijse.dep9.orm.entity.Customer;
import lk.ijse.dep9.orm.entity.Item;
import lk.ijse.dep9.orm.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.StatelessSession;
import org.hibernate.query.NativeQuery;

public class QueryDemo4 {

    public static void main(String[] args) {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            NativeQuery<Object[]> query1 = session.getNamedNativeQuery("findAllCustomers");
            query1.stream().forEach(row -> {
                System.out.printf("%s, %s \n", row[0], row[1]);
            });
        }

//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            NativeQuery query2 = session.getNamedNativeQuery("findAllCustomers")
//                    .addEntity(Customer.class);
//            query2.list().forEach(System.out::println);
//        }

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            NativeQuery<Customer> query2 = session.getNamedNativeQuery("findAllCustomers2");
            query2.list().forEach(System.out::println);
        }
    }
}
