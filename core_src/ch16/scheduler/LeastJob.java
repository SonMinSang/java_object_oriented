package ch16.scheduler;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("할당된 통화수가 가장 적은 상담원에게 배분합니다.");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("제일 여유로운 상담원에게 연결합니다.");
	}

}
