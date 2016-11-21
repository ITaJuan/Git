package day8.pojo;

//ÎªÁË½øĞĞÉî¶È¿ËÂ¡
public class Wheels implements Cloneable {

	private String ÂÖÌ¥;

	public Wheels() {

	}

	public Wheels(String ÂÖÌ¥) {
		super();
		this.ÂÖÌ¥ = ÂÖÌ¥;
	}

	@Override
	protected Wheels clone() throws CloneNotSupportedException {
		return (Wheels) super.clone();
	}

	public String getÂÖÌ¥() {
		return ÂÖÌ¥;
	}

	public void setÂÖÌ¥(String ÂÖÌ¥) {
		this.ÂÖÌ¥ = ÂÖÌ¥;
	}

}
