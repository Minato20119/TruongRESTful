/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Student_Tests_TakenRepository;
import com.example.demo.entity.Student_Tests_Taken;

/**
 * @author Minato
 *
 */
@Service
public class StudentTestTakenService {

	@Autowired
	private Student_Tests_TakenRepository student_Tests_TakenRepository;

	public List<Student_Tests_Taken> getAllStudentTestTaken() {
		return student_Tests_TakenRepository.findAll();
	}

	public Student_Tests_Taken getStudentTestTakenById(int id) {
		Student_Tests_Taken s = student_Tests_TakenRepository.findByPrimaryKeyStudentCourseEnrolmentRegistrationId(id);
		return s;
	}

	public void addStudentTestTaken(Student_Tests_Taken student_Tests_Taken) {
		student_Tests_TakenRepository.save(student_Tests_Taken);
	}

	public void updateStudentTestTaken(Student_Tests_Taken student_Tests_Taken) {
		Student_Tests_Taken s = getStudentTestTakenById(student_Tests_Taken.getPrimaryKey().getRegistration_id());
		s.setDateTestTaken(student_Tests_Taken.getDateTestTaken());
		s.setOtherDetails(student_Tests_Taken.getOtherDetails());
		s.setTestResult(student_Tests_Taken.getTestResult());
		student_Tests_TakenRepository.flush();
	}

	public void deleteStudentTestTakenById(int id) {
		student_Tests_TakenRepository.delete(id);
	}
}
