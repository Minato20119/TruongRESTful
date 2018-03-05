package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Student_Course_EnrolmentRepository;

@RestController
@RequestMapping("/api")
public class Student_Course_EnrolmentController {
	public static final Logger logger = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	Student_Course_EnrolmentRepository studentCourseEnrolmentRepository;

}
