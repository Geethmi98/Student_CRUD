package com.studentcrud.student.controller;

import com.studentcrud.student.entity.Student;
import com.studentcrud.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    //Save Student
    @PostMapping("/save")
    public Student addStudent(@RequestBody Student student){

        return studentService.addStudent(student);
    }

    //Find-By-ID
    @GetMapping(path="getbyid/{Id}")
    public Student getStudentByID(@PathVariable(value="Id") Long StudentId){

        return studentService.getStudentById(StudentId);
    }

    //Find-All-Student
    @GetMapping("/get-all")
    public List<Student> getListStudent(){

        return studentService.getListStudent();
    }

    //Update Student
    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){

        return studentService.updateStudent(student);
    }

    //Delete Student
    @DeleteMapping(path="delete-student/{id}")
    public String deleteStudent(@PathVariable(value="id") Long Id){

        return studentService.deleteStudent(Id);
    }
}
