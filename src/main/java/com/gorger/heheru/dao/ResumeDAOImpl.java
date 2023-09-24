package com.gorger.heheru.dao;

import com.gorger.heheru.entity.Resume;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Component
@Repository
public class ResumeDAOImpl implements ResumeDAO {

    private final SessionFactory sessionFactory;

    @Autowired
    public ResumeDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Resume> getAllResumes() {
        Session session = sessionFactory.getCurrentSession();
        return session
                .createQuery("from Resume", Resume.class)
                .getResultList();
    }

    @Override
    public void saveResume(Resume resume) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(resume);
    }

    @Override
    public Resume getResume(int id) {
        Session session = sessionFactory.getCurrentSession();
        Resume resume = session.get(Resume.class, id);
        return resume;
    }


}
