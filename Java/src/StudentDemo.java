class Student{
	String name;
	int age;
	
	//default constructor
	Student() {
		name="Unknown";
		age=0;
	}
	
	//Parameterized constructor
	Student(String n, int a){
		name=n;
		age=a;
	}
	
	//Copy constructor
	Student(Student other ) {
		name = other.name;
		age= other.age;
	}
	
	void getDetails() {
		System.out.println("Hi " + name + " your " + age+ " years old");
	}
}
public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Alice",20);
		Student s3 = new Student(s2);
		s1.getDetails();
		s2.getDetails();
		s3.getDetails();
	}
}
