/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepository;
import com.example.demo.entity.Student;

/**
 * @author Minato
 *
 */
@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Student getStudentById(int id) {
		Student s = studentRepository.findOne(id);
		return s;
	}

	public void addStudent(Student student) {
		studentRepository.save(student);
	}

	public void updateStudent(Student student) {
		Student s = getStudentById(student.getStudentId());
		s.setDateOfLatestLogon(student.getDateOfLatestLogon());
		s.setDateOfRegistration(student.getDateOfRegistration());
		s.setFamilyName(student.getFamilyName());
		s.setLoginName(student.getLoginName());
		s.setMiddleName(student.getMiddleName());
		s.setOtherDetails(student.getOtherDetails());
		s.setPassword(student.getPassword());
		s.setPersonalName(student.getPersonalName());
		studentRepository.flush();
	}

	public void deleteStudentById(int id) {
		studentRepository.delete(id);
	}
}
