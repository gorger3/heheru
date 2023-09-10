package com.gorger.heheru.controller;

import com.gorger.heheru.dao.ResumeDAO;
import com.gorger.heheru.entity.Resume;
import com.gorger.heheru.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ResumeController {
    private final ResumeService resumeService;

    @Autowired
    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @RequestMapping("/")
    public String showAllResumes(Model model) {
        List<Resume> allResumes = resumeService.getAllResumes();
        model.addAttribute("allRes", allResumes);
        return "all-resumes";
    }


}
