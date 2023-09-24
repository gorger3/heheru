package com.gorger.heheru.service;

import com.gorger.heheru.entity.Resume;

import java.util.List;

public interface ResumeService {
    List<Resume> getAllResumes();

    void saveResume(Resume resume);

    Resume getResume(int id);
}
