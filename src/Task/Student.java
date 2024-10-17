package Task;

public class Student {
	
	int rollno;
	String name;
	String branch;
	
	public Student(int rollno, String name,String branch) {
		this.rollno = rollno;
		this.name= name;
		this.branch= branch;
		
	}
	
	public int getRollno() 
    { 
        return rollno; 
    } 
	public String getName() 
    { 
        return name; 
    } 
	public String getBranch() 
    { 
        return name; 
    } 
	
	
	public static void main(String[] args) 
    { 

		Student student1= new Student(10,"Rohit","CS");
		Student student2=new Student(12,"Abhishek","IT");
	
	System.out.println("RollNo: "+student1.getRollno()+ " Name :" +student1.getName()+" Branch :"+student1.getBranch());
	System.out.println("RollNo: "+student2.getRollno()+ " Name :" +student2.getName()+" Branch :"+student2.getBranch());
	
    }	    	

}
