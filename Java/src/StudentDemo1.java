class Student2{
	int rollno,mark1,mark2,mark3,totalmarks;
	String studname;
	
	Student2(int rollno,String studname, int mark1,int mark2, int mark3) {
		this.rollno=rollno;
		this.studname=studname;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	
	void calTotal() {
		totalmarks=mark1+mark2+mark3;
	}
	
	void disStuDetails() {
		System.out.println("Roll No: "+rollno+" Name: "+studname+" Total Marks: "+totalmarks);
	}
}
public class StudentDemo1 {

	public static void main(String[] args) {
		
		Student2 s1=new Student2(201,"Samhitha",25,26,30);
		s1.calTotal();
		s1.disStuDetails();

			}

}
