package score;

import java.util.ArrayList;

public class Subject {

	int subjectId;
	String subjectName;
	int gradeType;
	ArrayList<Student> StudentList = new ArrayList<>();
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
