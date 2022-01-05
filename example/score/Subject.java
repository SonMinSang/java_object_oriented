package score;

import java.util.ArrayList;

import util.Define;

public class Subject {

	int subjectId;
	String subjectName;
	int gradeType;
	ArrayList<Student> StudentList = new ArrayList<>();
	public Subject(String subjectName, int subjectId){
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYPE;   //기본적으로 A, B 타입
	}
	
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getGradeType() {
		return gradeType;
	}
	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}
	public ArrayList<Student> getStudentList() {
		return StudentList;
	}
	public void setStudentList(ArrayList<Student> studentList) {
		StudentList = studentList;
	}

	public void register(Student student) {
		StudentList.add(student);
	}


}
