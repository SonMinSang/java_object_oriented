package ch16.newgamelevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	protected void run() {
		// TODO Auto-generated method stub
		System.out.println("천천히 달립니다.");
	}

	@Override
	protected void jump() {
		// TODO Auto-generated method stub
		System.out.println("jump 못하지롱");
	}

	@Override
	protected void turn() {
		// TODO Auto-generated method stub
		System.out.println("turn 못하지롱");
	}

	@Override
	protected void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("****** 초급자 레벨입니다. ********");
	}

}
