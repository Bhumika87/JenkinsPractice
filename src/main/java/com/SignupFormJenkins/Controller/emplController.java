package com.SignupFormJenkins.Controller;

import com.SignupFormJenkins.Entity.Employe;
import com.SignupFormJenkins.Service.EmpServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class emplController {
    @Autowired
    EmpServ empServ;
    @RequestMapping("/sign")
    public String form() {
        System.out.println("Checking after changing in repository my jenkins job is running or not ");

        return "form";
    }
    @PostMapping("/processForm")
    public String processForm(@ModelAttribute Employe employe, Model model)
    {
        String emName = employe.getName();

       model.addAttribute("emplname",emName);
       empServ.saveData(employe);
        System.out.println(model);
        return "res";
    }
}
