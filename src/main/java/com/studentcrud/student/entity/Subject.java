package com.studentcrud.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Subject {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private int subjectId;
    private String subName;
}
