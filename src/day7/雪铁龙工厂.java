package day7;

public class ѩ�������� extends IBuildCarFactory {

	@Override
	public ICar buyCar(String ����) {
		if ("����".equals(����)) {
			return new ����();
		} else {
			return null;
		}
	}

}
