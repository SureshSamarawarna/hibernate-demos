package lk.ijse.dep9.orm;

import lk.ijse.dep9.orm.entity.Customer;
import lk.ijse.dep9.orm.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SaveDemo2 {

    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();

        Customer c005Pasan = new Customer("C005", "Pasan", "Galle", "011-1234567");
        Object something = session.save(c005Pasan);
        System.out.println(something);

        session.getTransaction().commit();

        session.close();
        sf.close();
    }
}
