package Practice;

public class Armstrong {

	public static void main(String[] args) {
	int num = 370, a, b, c=0;
	b=num;
	while(num>0) {
		a=num%10;
		num= num/10;
		c= c+ (a*a*a);
	}
	if(b==c) {
		System.out.println(b +" is an Armstrong");
	} else {
		System.out.println(b + "  is not an Armstrong");
	}

}
}