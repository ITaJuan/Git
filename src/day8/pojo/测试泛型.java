package day8.pojo;

public class ���Է���<T,V> {

	String name;
	
	Student  stu;
	
	T    some;    //���������� ��������ָ��
	
	V    some2;
	

	public T getSome() {      //����ֵ���� ��������ָ��
		return some;
	}

	public void setSome(T some) {    //������� ��������ָ��
		this.some = some;
	}

	public V getSome2() {
		return some2;
	}

	public void setSome2(V some2) {
		this.some2 = some2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}
	
	
	
	
	
}
