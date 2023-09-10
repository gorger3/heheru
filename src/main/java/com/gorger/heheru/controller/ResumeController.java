package com.gorger.heheru.controller;

import com.gorger.heheru.dao.ResumeDAO;
import com.gorger.heheru.entity.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ResumeController {
    private final ResumeDAO resumeDAO;

    @Autowired
    public ResumeController(ResumeDAO resumeDAO) {
        this.resumeDAO = resumeDAO;
    }

    @RequestMapping("/")
    public String showAllResumes(Model model) {
        List<Resume> allResumes = resumeDAO.getAllResumes();
        model.addAttribute("allRes", allResumes);
        return "all-resumes";
    }


}
