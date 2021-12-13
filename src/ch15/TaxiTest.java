package ch15;

public class TaxiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Edward = new Student("Edward", 20000);
		Taxi deliver = new Taxi("잘 간다 운수택시");
		
		Edward.takeTaxi(deliver, 10000);
		Edward.showStudentInfo();
		deliver.showInfoTaxi();
	}

}
