package ch10;

public class AICar extends Car{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("자율 주행을 합니다.");
		System.out.println("자동차가 자동으로 방향을 바꿉니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("장애물 앞에서 스스로 멈춥니다.");
	}

	
}
