package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CourseRepository;
import com.example.demo.service.CourseService;

@RestController
@RequestMapping("/api")
public class CourseController {
	@Autowired
	private CourseService courseService;

	@Autowired
	private CourseRepository courseRepository;

}
