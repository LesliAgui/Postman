package com.example.SpringBootNtt.service;

import com.example.SpringBootNtt.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentService {
    private List<Student> students = new ArrayList<>();

    //con esto se agrega un Alumno
    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudent(String nomStudent) {
        //El foreach va iterando hasta que se acabe la lista hasta que la condicion se corte
        for (Student s : students) {
            //Si un nombre conicide con el nombre del alumno buscado se retorna
            //Si ese nombre es null romperia el ciclo
            if (nomStudent.equals(s.getName())) {
                return s;
            }


        }
        // en caso de que no exista el alumna retorna un nul
        return new Student("Alumno no encontrado");
    }

    public List<Student> getLista() {
        return students;
    }
}

