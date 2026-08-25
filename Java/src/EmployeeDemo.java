class Employee{
	int empnum;
	String empname;
	double empsalary;
	Employee(){ }
	Employee(int empnum,String empname)
	{
		this.empnum=empnum;
		this.empname=empname;
	}
	Employee(int empnum,String empname,double empsalary){
		this(empnum,empname);
		this.empsalary=empsalary;
	}
	void dispEmpDetails() {
		System.out.println("Employee No: "+empnum+" Employee Name: "+empname+" Salary: "+empsalary);
	}
}
public class EmployeeDemo {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.dispEmpDetails();
		Employee e2=new Employee(101,"Bob",500000);
		e2.dispEmpDetails();
		Employee e3=new Employee(102,"Alice");
		e3.dispEmpDetails();
	}
}
