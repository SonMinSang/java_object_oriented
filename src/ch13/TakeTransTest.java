package ch13;

public class TakeTransTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("James", 10000);
	
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		studentJ.takeBus(bus100);
		
		Subway greenSubway = new Subway(2);
		studentT.takeSubway(greenSubway);
		
		studentJ.showInfo();
		studentT.showInfo();
		
		bus100.showBusinfo();
		greenSubway.showSubwayinfo();
		
		bus500.showBusinfo();
	}

}
