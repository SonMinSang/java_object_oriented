package ch16.scheduler;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("고객 등급에 따라 다른 상담원을 연결합니다.");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		System.out.println("고객님의 고객등급 맞춤의 상담원을 연결합니다.");
	}

}
