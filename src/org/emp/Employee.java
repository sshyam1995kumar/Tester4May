package org.emp;

public class Employee {
	public void empId() {
		System.out.println("Employee Id is: 1234");
	}

	public void empName() {
		System.out.println("Employee name is: Shyam Kumar");
	}

	public void empDob() {
		System.out.println("Employee DOB is : 5/7/1995");
	}

	public void empPhone() {
		System.out.println("Employee Phone no is: 9087238836");
	}

	private void empEmail() {
		// TODO Auto-generated method stub
		System.out.println("Employee Email is: sshyam@gamil.com");
	}

	public void empAddress() {
		System.out.println("Address is: Medavakkam,chennai");
	}

	public static void main(String[] args) {
		System.out.println("Employee Details:");
		Employee e = new Employee();
		e.empId();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empEmail();
		e.empAddress();
	}
}