package com.example.SpringBootNtt.controller;

import com.example.SpringBootNtt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Htmlcontroller {

    @Autowired
    private StudentService service;

    @GetMapping("/homepage")
    public String homepage(Model model){

        model.addAttribute("yoSoy", "leslie");
        return "home";
        // model.addAllAttributes("students");
    }

    //Mostrar los usuarios
    @GetMapping("/listStudent")
    public String listStudent(Model model){

        model.addAttribute("students", service.getLista());
        return "alumnos";
        // model.addAllAttributes("students");
    }

}
