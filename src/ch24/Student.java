package ch24;

import java.util.ArrayList;

public class Student {

	private int studentId;
	private String studentName;
	private ArrayList<Subject> subJectList;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		subJectList = new ArrayList<>();
	}
	public void addSubject(String subjectName, int score) {
		// TODO Auto-generated method stub
		Subject subject = new Subject();
		subject.setScore(score);
		subject.setSubjectName(subjectName);
		subJectList.add(subject);
		
	}
	public void showStudentInfo() {
		int totalScore = 0;
		System.out.println(studentId + "번 학생" + studentName +"의 점수는");
		for (Subject subject: subJectList) {
		
			subject.showInfo();
			totalScore += subject.getScore();
		}
		System.out.println("총점은 "+ totalScore +"입니다.");
	}

}
