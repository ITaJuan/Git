package day7;

//Ϊ����ȿ�¡
public class Wheels implements Cloneable {

	private String ��̥;

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
