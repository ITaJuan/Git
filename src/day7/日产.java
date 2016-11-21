package day7;

public class 日产 extends 东风汽车 {

	@Override
	public void run() {
		System.out.println("日产汽车:"+getName()+"run as "+getSpeed()+" mph");
	}

	@Override
	public void stop() {
		System.out.println("日产汽车:"+getName()+"stop");
	}

}
