package day8.biz;

//���� ��˫������  		���ϣ����������
public class List {

	private int maxSize;

	private int first = -1;// ��ͷ
	private int last = -1; // ��β
	private int pos = -1; // ��ǰλ��

	private Object[] datas;

	// ����֮������� datas[0]----->next[0]=1;
	private int next[];

	public List() {
		datas = new Object[maxSize];
		next = new int[maxSize];
	}

	public List(int maxSize) {
		this.maxSize = maxSize;
		datas = new Object[maxSize];
		next = new int[maxSize];
	}

	public int getMaxSize() {
		return maxSize;
	}

	public int size() {
		int x = 0;
		for (int i = 0; i < datas.length; i++) {
			if (datas[i] != null) {
				x++;
			}
		}
		return x;
	}

	public int canUse() {
		return maxSize - size();
	}

	// �ҵ���λ
	private int findFreePosi() {
		for (int i = 0; i < datas.length; i++) {
			if (datas[i] == null) {
				return i;
			}
		}
		// ����
		return -1;
	}

	/*
	 * �������� 1.��ͷ���������ݣ������ݶ�Ӧ��nextָ��ԭ����first 2.��β���������ݣ�lastָ�������� 3.���м���������ݣ�
	 * 3.1.����λ��ǰ������ݵ�nextָ�������ݵ�λ�� 3.2.������nextָ�����λ�ú�������ݵ�λ��
	 */

	// Ĭ��ֻ�ӱ�β��������
	public boolean add(Object obj) {

		// ����Ϊ��
		if (first == -1) {
			datas[++first] = obj;
			last = 0;

		} else {
			// �ҿ�λ
			pos = this.findFreePosi();
			if (pos != -1) {
				datas[pos] = obj;
				// �²��������
				next[last] = pos;// ԭ����������ָ���²��������
				last = pos;
			} else {
				System.err.println("��������");
				return false;
			}
		}

		return true;

	}

	// ��ָ��λ�ò�������
	public boolean add(int posi, Object obj) {

		// ��β���
		if (posi == (this.size() + 1)) {
			add(obj);
		} else if (posi == 0) {
			pos = findFreePosi();
			if (pos > -1) {
				next[pos] = first;
				first = pos;
				this.datas[pos] = obj;
			}
		} else {
			pos = findFreePosi();
			if (pos > -1) {
				this.datas[pos] = obj;
				int tmp = next[posi - 1];
				next[posi - 1] = pos;
				
				//������������next��������Ų
				for (int i = posi; i < size(); i++) {
					int tmp2=next[i];
					next[i]=tmp;
					tmp=tmp2;
				}
				//last����
				last++;
			} else {
				System.err.println("��������");
				return false;
			}
		}
		return true;

	}
	
	//ȡ������,Ĭ��first
	public Object get() {
		return datas[first];
	}
	
	public Object get(int posi) {
		int posx=-1;
		if (posi==0) {
			get();
		}else {
			for (int i = 0; i < posi; i++) {
				if (i==0) {
					posx=next[first];
				}else {
					posx=next[i];
				}
			}
		}
		return datas[posx];
	}
	
//	public boolean remove() ;
//	public boolean remove(int posi) ;
}
