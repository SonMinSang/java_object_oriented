package ch15;

public class Taxi {
	String companyName;
	int income;
	
	public Taxi (String companyName)
	{
		this.companyName = companyName;
	}
	public void take(int money)
	{
		this.income += money;
	}
	public void showInfoTaxi() {
		System.out.println(companyName + "회사의 수입은" + income + "입니다.");
	}
}
