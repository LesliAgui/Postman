package com.example.SpringBootNtt.controller;

import com.example.SpringBootNtt.entity.Student;
import com.example.SpringBootNtt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/{nombre}")
    public String holaMundo(@PathVariable String nombre) {
        return "Hola Mundo" + nombre;

    }

    //Creacion del alumno
    @PostMapping
    public void addStudent(@RequestBody Student student) {
        service.addStudent(student);

    }

    //se quiere devolver un objeto student
    @GetMapping("/{pornombre}/{nombrevariable}")
    public Student getStudentByName(@PathVariable("nombrevariable") String name) {
        return service.getStudent(name);
    }

   /* @GetMapping("/homepage")
    public String homepage(Model model){

        model.addAttribute("yoSoy", "leslie");
        return "home";
        // mode*/
}