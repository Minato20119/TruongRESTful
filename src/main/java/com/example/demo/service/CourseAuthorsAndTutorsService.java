/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Course_Authors_and_TutorRepository;
import com.example.demo.entity.Course_Authors_and_Tutor;

/**
 * @author Minato
 *
 */
@Service
public class CourseAuthorsAndTutorsService {

	@Autowired
	private Course_Authors_and_TutorRepository course_Authors_and_TutorRepository;

	public List<Course_Authors_and_Tutor> getAllCourseAuthor() {
		return course_Authors_and_TutorRepository.findAll();
	}

	public Course_Authors_and_Tutor getCourseAuthorById(int id) {
		Course_Authors_and_Tutor c = course_Authors_and_TutorRepository.findOne(id);
		return c;
	}

	public void addCourseAuthor(Course_Authors_and_Tutor course_Authors_and_Tutor) {
		course_Authors_and_TutorRepository.save(course_Authors_and_Tutor);
	}

	public void updateCourseAuthor(Course_Authors_and_Tutor course_Authors_and_Tutor) {
		Course_Authors_and_Tutor c = getCourseAuthorById(course_Authors_and_Tutor.getAuthorId());
		c.setAddressLine1(course_Authors_and_Tutor.getAddressLine1());
		c.setAddressLine2(course_Authors_and_Tutor.getAddressLine2());
		c.setAddressLine3(course_Authors_and_Tutor.getAddressLine3());
		c.setAuthor_tutor_ATB(course_Authors_and_Tutor.getAuthor_tutor_ATB());
		c.setFamilyName(course_Authors_and_Tutor.getFamilyName());
		c.setGenderMf(course_Authors_and_Tutor.getGenderMf());
		c.setLoginName(course_Authors_and_Tutor.getLoginName());
		c.setMiddleName(course_Authors_and_Tutor.getMiddleName());
		c.setOtherDetails(course_Authors_and_Tutor.getOtherDetails());
		c.setPassword(course_Authors_and_Tutor.getPassword());
		c.setPersonalName(course_Authors_and_Tutor.getPersonalName());
		course_Authors_and_TutorRepository.flush();
	}

	public void deleteCourseAuthorById(int id) {
		course_Authors_and_TutorRepository.delete(id);
	}
}
