import java.util.*;
public class Lab2_bt4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Department> departments = new ArrayList<>();
		Department depal, depa2, depa3;
		depal= new Department (1, "Quan ly");
		depal.addEmployee (new Employee (1, "Van A", 5000));
		depal.addEmployee (new Employee (2, "Van b", 7000));
		depa2 = new Department (2, "Thu ngan");
		depa2.addEmployee (new Employee (3, "Lap C", 10000));
		depa2.addEmployee (new Employee (4, "Truong D", 12000));
		depa3 = new Department (3, "Nhan vien");
		depa3.addEmployee (new Employee (5, "Le E", 6000));
		departments.add(depal);
		departments.add(depa2);
		departments.add(depa3);
		for (Department department:departments) { 
			System.out.println("\n" + department);
			for (Employee b:department.getEmployee())
				System.out.println(b);
		}
	}
}
class Department{
	private int id;
	private String name;
	public Department() {}
	public Department(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "Department("+"id="+id+", name="+name+')';
	}
	
	private List<Employee> employees = new ArrayList<>();
	public List<Employee> getEmployee () {
		return employees;
	}
	public void setEmployee (List<Employee> employee) {
		this.employees=employee;
	}
	public void addEmployee (Employee b) {
		employees.add(b);
		b.setDepartment (this);
	}
	public void removeEmployee (Employee b) {
		employees.remove (b);
		b.setDepartment (null);
	}
}
class Employee{
	private int id;
	private String name;
	private double salary;
	public Employee() {}
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee("+"id="+id+", Name="+name+", salary="+salary+')';
	}
	private Department department;
	public Department getDepartment(){
		return department;
	}
	public void setDepartment(Department department) {
		this.department=department;
	}
}
