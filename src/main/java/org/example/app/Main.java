package org.example.app;



import org.example.app.model.User;
import org.example.app.unit.HibernateUtil;
import org.example.app.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {

    private static Object HibernateUtil;

    public static void main(String[] args) {

        User user = new User("John Doe", "john.doe@example.com");


        HibernateUtil HibernateUtil;
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory()) {

            try (Session session = sessionFactory.openSession()) {

                Transaction transaction = session.beginTransaction();


                session.save(user);


                transaction.commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
