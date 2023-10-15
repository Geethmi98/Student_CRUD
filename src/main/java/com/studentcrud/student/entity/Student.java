package com.studentcrud.student.entity;

import com.studentcrud.student.entity.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="student")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long StudentId;

    @OneToOne(cascade=CascadeType.ALL)
    private Address address;

    private String name;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Subject> subjects;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Hobby> hobbies=new HashSet<>();
}
