package com.gorger.heheru.controller;

import com.gorger.heheru.entity.Contact;
import com.gorger.heheru.entity.Resume;
import com.gorger.heheru.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/resume-info")
    public String addResume(Model model) {
        Resume resume = new Resume();
        Contact contact = new Contact();
        resume.setContact(contact);
        model.addAttribute("res", resume);
        return "resume-info";
    }


    @RequestMapping("/save-resume")
    public String saveResume(@ModelAttribute("res") Resume resume) {
        resumeService.saveResume(resume);
        return "redirect:/";
    }

    @RequestMapping("/update-info")
    public String updateResume(@RequestParam("resId") int id, Model model){
        Resume resume = resumeService.getResume(id);
        model.addAttribute("res", resume);
        return "resume-info";
    }
}
