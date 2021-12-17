package ch16.newgamelevel;

public class SuperLevel extends PlayerLevel {

	@Override
	protected void run() {
		// TODO Auto-generated method stub
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	protected void jump() {
		// TODO Auto-generated method stub
		System.out.println("아주 높이 jump 합니다.");
	}

	@Override
	protected void turn() {
		// TODO Auto-generated method stub
		System.out.println("turn 합니다");
	}

	@Override
	protected void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("****** 고급자 레벨입니다. ********");
	}
}
