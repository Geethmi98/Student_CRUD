package com.studentcrud.student.service;

import com.studentcrud.student.entity.Student;
import com.studentcrud.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    //Save Student
    public Student addStudent(Student student){

        return studentRepository.save(student);
    }

    //get-by-id
    public Student getStudentById(Long StudentId){

        return studentRepository.findById(StudentId).orElse(null);
    }

    //get-all-Student
    public List<Student> getListStudent(){

        return studentRepository.findAll();
    }

    //update Student
    public Student updateStudent(Student student){

        Student oldStu=studentRepository.findById(student.getStudentId()).orElse(null);

        oldStu.setAddress(student.getAddress());
        oldStu.setName(student.getName());
        oldStu.setGender(student.getGender());

        return studentRepository.save(oldStu);
    }

    //delete Student
    public String deleteStudent(Long Id){

        studentRepository.deleteById(Id);
        return "Student Deleted";
    }
}
