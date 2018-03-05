/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CourseRepository;
import com.example.demo.entity.Cours;

/**
 * @author Minato
 *
 */
@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Cours> getAllCours() {
		return courseRepository.findAll();
	}

	public Cours getCoursById(int id) {
		Cours cours = courseRepository.findOne(id);
		return cours;
	}

	public void addCourse(Cours cours) {
		courseRepository.save(cours);
	}

	public void updateCourse(Cours cours) {
		Cours c = getCoursById(cours.getCourseId());
		c.setCourseDescription(cours.getCourseDescription());
		c.setCourseName(cours.getCourseName());
		c.setOtherDetails(cours.getOtherDetails());
		courseRepository.flush();
	}

	public void deleteCourseById(int id) {
		courseRepository.delete(id);
	}
}
