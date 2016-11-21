package day7;

public class 雪铁龙工厂 extends IBuildCarFactory {

	@Override
	public ICar buyCar(String 车名) {
		if ("世嘉".equals(车名)) {
			return new 世嘉();
		} else {
			return null;
		}
	}

}
