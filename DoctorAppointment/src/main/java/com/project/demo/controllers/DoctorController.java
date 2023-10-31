package com.project.demo.controllers;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.demo.model.Doctor;
import com.project.demo.repositories.DoctorRepository;

import jakarta.servlet.http.HttpSession;
 
@Controller
public class DoctorController {
    @Autowired
    private DoctorRepository DoctorRepository;
 
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
    @GetMapping("/dashboard")
    public String dashboardPage() {
    	return "dashboard";
    }
 
    @PostMapping("/login")
    public String login(@RequestParam String user, @RequestParam String pass, HttpSession session) {
        Doctor doctorFromDB = DoctorRepository.findByUsernameAndPassword(user, pass);
        if (doctorFromDB != null) {
            // Authentication successful
            session.setAttribute("loggedInUser", doctorFromDB);
            return "redirect:/dashboard"; // Redirect to a dashboard page
        } else {
            // Authentication failed
            return "redirect:/error"; // Return to the login page with an error message
        }
    }
}