package day8;

public class TsStack {

	/*
	 * public void test�ݹ�() { System.out.println("�ݹ�"); test�ݹ�();
	 * 
	 * }
	 */

	// ջ������
	private int maxSize = 16;
	// ջ����λ��
	private int top = -1; // ջΪ��
	// ���������
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

	// ȡ��ջ�Ŀ�����
	public int aviSize() {
		return maxSize - top - 1;

	}

	// ��ǰʹ����
	public int useSize() {
		return top + 1;
	}

	// ѹ��ջ
	public void push(Object obj) throws MyStackFullEx {
		if ((top + 1) == maxSize) {// ջ�����׳��³�
			throw new MyStackFullEx();

		} else {
			dataStore[++top] = obj;
		}
	}

	// ��ջ
	public Object pop() {
		if (top == -1) {// û������
			System.err.println("no data");
			return null;
		} else {
			return dataStore[top--];
		}
	}

	public class MyStackFullEx extends Exception {
		@Override
		public String getMessage() {
			return "ջ��������ջʧ��";
		}
	}

	public static void main(String[] args) {
		// new TsStack().test�ݹ�();

	}

}
