package assignment;

public class Student {

	public void displayInfo(String name,int age) {
		
		
		System.out.println("Name: " +name);
		System.out.println("Age: "+age);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std=new Student();
		std.displayInfo("Swathi",25);

	}

}
