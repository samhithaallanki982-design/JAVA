class Person{
	String name,addr;
	int age;
	Person(String name,int age,String addr){
		this.name=name;
		this.age=age;
		this.addr=addr;
	}
	public String toString() {
		return "Name: "+name+" Addr: "+addr;
	}
}

class Employee1 extends Person{
	int empid;
	String dept;
	Employee1(Person p,int empid,String dept){
		super(p.name,p.age,p.addr);
		this.empid=empid;
		this.dept=dept;
	}
	void getDetails() {
		System.out.println("Emp id: "+empid+" Dept: "+dept);
	}
}
public class InheritDemo {

	public static void main(String[] args) {
		Person p=new Person("ABC",25,"Wgl");
		Employee1 e=new Employee1(p,123,"Sales");
		System.out.println(p);
		e.getDetails();
	}

}
