package com.gorger.heheru.service;

import com.gorger.heheru.dao.ResumeDAO;
import com.gorger.heheru.entity.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ResumeServiceImpl implements ResumeService {

    private final ResumeDAO resumeDAO;

    @Autowired
    public ResumeServiceImpl(ResumeDAO resumeDAO) {
        this.resumeDAO = resumeDAO;
    }

    @Override
    @Transactional
    public List<Resume> getAllResumes() {
        return resumeDAO.getAllResumes();

    }
}
