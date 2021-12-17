package ch16.newgamelevel;

public class AdvancedLevel extends PlayerLevel {

	@Override
	protected void run() {
		// TODO Auto-generated method stub
		System.out.println("빨리 달립니다.");
	}

	@Override
	protected void jump() {
		// TODO Auto-generated method stub
		System.out.println("높이 jump 합니다.");
	}

	@Override
	protected void turn() {
		// TODO Auto-generated method stub
		System.out.println("turn 못하지롱");
	}

	@Override
	protected void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("****** 중급자 레벨입니다. ********");
	}
}
