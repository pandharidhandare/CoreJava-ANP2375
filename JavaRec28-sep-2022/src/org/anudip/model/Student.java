package org.anudip.model;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
	
 int studentId;
 String studentName;
 Gender gender;
 LocalDate dob;
public Student(int studentId, String studentName, Gender gender, LocalDate dob) {
	
	this.studentId = studentId;
	this.studentName = studentName;
	this.gender = gender;
	this.dob = dob;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", gender=" + gender + ", dob=" + dob
			+ "]";
}
@Override
public int hashCode() {
	return Objects.hash(dob, gender, studentId, studentName);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return Objects.equals(dob, other.dob) && gender == other.gender && studentId == other.studentId
			&& Objects.equals(studentName, other.studentName);
}

 
}
