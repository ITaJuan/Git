package day6;

/*import java.text.DateFormat;
 import java.util.Date;

 public class Run {

 public static void main(String[] args) {

 //		Student student = new Student();
 //		System.out.println(student);
 //		System.out.println(Integer.toHexString(student.hashCode()));
 //		System.out.println(student.toString());
 //		System.out.println(System.nanoTime());
 //		Date date=new Date();
 //		date.getTime();
 //		String date2=DateFormat.getDateTimeInstance().format(date);
 //		System.out.println(date2);
 Employee.No=0;

 }

 }*/
class A {
	String s = "class A";
}

class B extends A {
	String s = "class B";
}

public class TypeConvert {
	public static void main(String args[]) {
		B b1, b2 = new B();
		A a1, a2;
		a1 = (A) b2;
		a2 = b2;
		System.out.println(a1.s);
		System.out.println(a2.s);
		b1 = (B) a1;
		System.out.println(b1.s);
		System.out.println(b2.s);
	}
}
