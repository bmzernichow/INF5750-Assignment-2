package no.uio.inf5750.assignment2.dao.hibernate;

import org.hibernate.SessionFactory;

/**
 * Created by bmzett on 12.09.2016.
 */
public class HibernateCourseDAO {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
