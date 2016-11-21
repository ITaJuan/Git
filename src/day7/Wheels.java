package day7;

//ÎªÁËÉî¶È¿ËÂ¡
public class Wheels implements Cloneable {

	private String ÂÖÌ¥;

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
