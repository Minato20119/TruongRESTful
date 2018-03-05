package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class Student_Tests_TakenId implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "registration_id")
	private int registration_id;

	private Student_Course_Enrolment studentCourseEnrolment;

	@ManyToOne(cascade = CascadeType.ALL)
	public Student_Course_Enrolment getStudentCourseEnrolment() {
		return studentCourseEnrolment;
	}

	public void setStudentCourseEnrolment(Student_Course_Enrolment studentCourseEnrolment) {
		this.studentCourseEnrolment = studentCourseEnrolment;
	}

	public int getRegistration_id() {
		return registration_id;
	}

	public void setRegistration_id(int registration_id) {
		this.registration_id = registration_id;
	}

}
