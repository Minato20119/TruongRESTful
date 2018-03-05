/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SubjectRepository;
import com.example.demo.entity.Subject;

/**
 * @author Minato
 *
 */
@Service
public class SubjectService {

	@Autowired
	private SubjectRepository subjectRepository;

	public List<Subject> getAllSubject() {
		return subjectRepository.findAll();
	}

	public Subject getSubjectById(int id) {
		Subject subject = subjectRepository.findOne(id);
		return subject;
	}

	public void addSubject(Subject subject) {
		subjectRepository.save(subject);
	}

	public void updateSubject(Subject subject) {
		Subject subject2 = getSubjectById(subject.getSubjectId());
		subject2.setSubjectName(subject.getSubjectName());
		subject2.setEg_Database_Design(subject.getEg_Database_Design());
		subjectRepository.flush();
	}
	
	public void deleteSubjectById(int id) {
		subjectRepository.delete(id);
	}
}
