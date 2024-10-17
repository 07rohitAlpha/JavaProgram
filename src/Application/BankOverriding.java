package Application;

class BankOverriding {
	int getRateOfInterest() {return 0;}
}

class SBI extends BankOverriding {
	
	int getRateOfInterest() {return 8;}
	
}
	
class ICICI extends BankOverriding {

	int getRateOfInterest() { return 7 ;}
	
}
		
class AXIS extends BankOverriding {
	
	int getRateOfInterest() { return 9; }
	
}
class Test2{
	public static void main (String[] args ){
		SBI s= new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		
		System.out.println("SBI RateOfInterest:"+s.getRateOfInterest());
		System.out.println("ICIC RateOfInterest:"+i.getRateOfInterest());
		System.out.println("AXIS RateOfInterest:"+a.getRateOfInterest());
		
		
	}
}

	


