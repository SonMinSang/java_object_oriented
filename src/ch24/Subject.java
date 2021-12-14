package ch24;

public class Subject {

	private String subjectName;
	private int score;
	
	public Subject() {

	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public void showInfo() {
		System.out.println(subjectName + ":" + score);
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
