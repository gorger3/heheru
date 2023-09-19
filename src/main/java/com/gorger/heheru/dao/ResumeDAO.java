package com.gorger.heheru.dao;

import com.gorger.heheru.entity.Resume;

import java.util.List;

public interface ResumeDAO {
    List<Resume> getAllResumes();

    void saveResume(Resume resume);
}
