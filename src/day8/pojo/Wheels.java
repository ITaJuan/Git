package day8.pojo;

//Ϊ�˽�����ȿ�¡
public class Wheels implements Cloneable {

	private String ��̥;

	public Wheels() {

	}

	public Wheels(String ��̥) {
		super();
		this.��̥ = ��̥;
	}

	@Override
	protected Wheels clone() throws CloneNotSupportedException {
		return (Wheels) super.clone();
	}

	public String get��̥() {
		return ��̥;
	}

	public void set��̥(String ��̥) {
		this.��̥ = ��̥;
	}

}
