package test3;

public class EmployeeSalary {
	static void salaryOfEmployee(Secretary1 clerk) {
		clerk.salary();
	}

	static void salaryOfEmployee(Manager1 clerk) {
		clerk.salary();
	}

	public static void main(String[] args) {
		Secretary1 s = new Secretary1();
		Manager1 m = new Manager1();
		EmployeeSalary.salaryOfEmployee(s);
		EmployeeSalary.salaryOfEmployee(m);
	}

}

abstract class Employee1 {
	abstract void salary();
}

class Secretary1 extends Employee1 {
	void salary() {
		System.out.println(" Secretary salary");
	}
}

class Manager1 extends Employee1 {
	void salary() {
		System.out.println(" Manager salary");
	}
}
