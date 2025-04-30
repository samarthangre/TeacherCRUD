package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Teacher;
import com.example.demo.respositary.TeacherRepository;
import com.example.demo.service.TeacherService;
import com.example.demo.service.TeacherServiceImpl;

@SpringBootApplication
public class TeacherCrudApplication {

    private final TeacherRepository teacherRepository;

    TeacherCrudApplication(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TeacherCrudApplication.class, args);
		
		TeacherService ts=context.getBean(TeacherServiceImpl.class);
		ts.add(new Teacher(111, "Pallavi", "CS", "JAVA", 5000));
		ts.add(new Teacher(112, "Samarth", "tech", "python", 5000));
		ts.add(new Teacher(113, "Ravi", "fhf", "c", 5000));
		ts.add(new Teacher(114, "raj", "ehr", "node", 5000));
		
		System.out.println(ts.display());
	}

}
