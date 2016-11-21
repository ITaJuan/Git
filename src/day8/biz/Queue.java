package day8.biz;

//����	FIFO
public class Queue<T> {

	private int maxSize = 16; // Ĭ�ϵ�����
	private int first = -1; // ��ͷ
	private int last = -1; // ��β

	private Object[] datas; // ���ݵ�������װ����


	public Queue() {
		datas = new Object[maxSize];
	}

	public Queue(int maxSize) {
		this.maxSize = maxSize;
		datas = new Object[maxSize];
	}

	// ȡ�õ�ǰ���������
	public int size() {
		int s = 0;
		for (int i = 0; i < datas.length; i++) {
			if (datas[i] != null) {
				s++;
			}
		}
		return s;
	}

	// ���õ�����
	public int canUse() {
		return maxSize - size();
	}

	// ������� ������ֻ���ڶ�β�������
	public boolean add(T obj) {
		// �ն���
		if (size() == 0) {
			this.first = 0;
			this.last = 0;
			datas[0] = obj;
		} else {
			// ����û��
			if (size() == maxSize) {
				System.err.println("��������");
				return false;
			} else {// ���п�λ
				if ((last + 1) == maxSize) {// ������п�λ����last�Ѿ��ڶ�β�����������Ҫ��0����ͷŶ��
					last = 0;
					datas[last] = obj;
				} else {
					datas[++last] = obj;
				}
			}
		}
		return true;
	}

	// ����
	public T get() {

		Object rtVal = null;
		// ������
		if (size() > 0) {
			rtVal = datas[first];
			datas[first] = null;

			// ��lastС��first(last�Ѿ���ͷ���ˣ�����first�ڶ�β����������firstҲҪ��ͷ
			if (last < first && (first + 1) == maxSize) {
				first = 0;

			} else {
				first++;
			}
		}
		return (T) rtVal;

	}

}
