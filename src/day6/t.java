package day6;

class Employee {
	String name;
	int age;
	double wage;
	static int No = 0;

	Employee(String a1, int a2, double a3) {
		name = a1;
		age = a2;
		wage = a3;
		No++;
	}
}
