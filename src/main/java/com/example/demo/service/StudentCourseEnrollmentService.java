/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Student_Course_EnrolmentRepository;
import com.example.demo.entity.Student_Course_Enrolment;

/**
 * @author Minato
 *
 */
@Service
public class StudentCourseEnrollmentService {

	@Autowired
	private Student_Course_EnrolmentRepository student_Course_EnrolmentRepository;

	public List<Student_Course_Enrolment> getAllStudentCourseEnrolment() {
		return student_Course_EnrolmentRepository.findAll();
	}

	public Student_Course_Enrolment getStudentCourseEnrolmentById(int id) {
		Student_Course_Enrolment s = student_Course_EnrolmentRepository.findOne(id);
		return s;
	}

	public void addStudentCourseEnrolment(Student_Course_Enrolment student_Course_Enrolment) {
		student_Course_EnrolmentRepository.save(student_Course_Enrolment);
	}

	public void updateStudentCourseEnrolment(Student_Course_Enrolment student_Course_Enrolment) {
		Student_Course_Enrolment s = getStudentCourseEnrolmentById(student_Course_Enrolment.getRegistrationId());
		s.setDateOfCompletion(student_Course_Enrolment.getDateOfCompletion());
		s.setDateOfEnrolment(student_Course_Enrolment.getDateOfEnrolment());
		s.setOtherDetails(student_Course_Enrolment.getOtherDetails());
		student_Course_EnrolmentRepository.flush();
	}

	public void deleteStudentCourseEnrolmentById(int id) {
		student_Course_EnrolmentRepository.delete(id);
	}
}
