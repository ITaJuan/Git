package day8;

public class TsStack {

	/*
	 * public void test递归() { System.out.println("递归"); test递归();
	 * 
	 * }
	 */

	// 栈的容量
	private int maxSize = 16;
	// 栈顶的位置
	private int top = -1; // 栈为空
	// 对象的容器
	private Object[] dataStore;

	public TsStack() {
		dataStore = new Object[maxSize];
	}

	public TsStack(int maxSize) {
		this.maxSize = maxSize;
		dataStore = new Object[maxSize];
	}

	public int getMaxSize() {
		return maxSize;
	}

	// 取得栈的可用数
	public int aviSize() {
		return maxSize - top - 1;

	}

	// 当前使用量
	public int useSize() {
		return top + 1;
	}

	// 压入栈
	public void push(Object obj) throws MyStackFullEx {
		if ((top + 1) == maxSize) {// 栈满，抛出月常
			throw new MyStackFullEx();

		} else {
			dataStore[++top] = obj;
		}
	}

	// 出栈
	public Object pop() {
		if (top == -1) {// 没有数据
			System.err.println("no data");
			return null;
		} else {
			return dataStore[top--];
		}
	}

	public class MyStackFullEx extends Exception {
		@Override
		public String getMessage() {
			return "栈已满，入栈失败";
		}
	}

	public static void main(String[] args) {
		// new TsStack().test递归();

	}

}
