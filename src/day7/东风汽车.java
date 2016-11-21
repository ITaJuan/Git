package day7;

public abstract class ¶«·çÆû³µ implements ICar {

	private int speed;
	private String name;

	public abstract void run();

	public abstract void stop();

	@Override
	public void setSpeed(int speed) {
		this.speed=speed;
	}

	@Override
	public int getSpeed() {
		return speed;
	}

	@Override
	public void setName(String name) {
		this.name=name;
	}

	@Override
	public String getName() {
		return name;
	}

}
