package day7;

public class ���� implements ICar {
	private int speed;
	private String name;

	public ����() {
		this.setName("����");
		this.setSpeed(210);
	}

	@Override
	public void run() {
		System.out.println(getName() + "run as " + this.getSpeed() + " mph");

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void stop() {
		System.out.println(getName() + "stop");

	}
}
