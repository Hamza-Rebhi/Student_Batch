package com.hamza.Student.config;

import com.hamza.Student.student.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student,Student> {
    @Override
    public Student process(Student student) {
        return student;
    }
}
