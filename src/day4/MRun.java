package day4;


//ҵ���߼���
public class MRun {

	public static void main(String[] args) {
		 ����Ա_�˿�();
		
		����Ա.idCode="1234567890";

		//�������η�
		����Ա syy=new  ����Ա();
		syy.����="Kate";	//�ڱ�Ķ����з���public����
		syy.����=19;	//ͬһ���������кõ�
		// syy.set����(21);
		// System.out.println("�����ǣ�"+syy.get����());
	}

	public static void ����Ա_�˿�() {
		�˿� cstm1 = new �˿�();
		cstm1.set����("tony");
		�˿� cstm2 = new �˿�("Mark", true, "1234567890");

		����Ա ita = new ����Ա();
		ita.set����("jeeny");

		ita.�տ�(cstm1, 200);
		ita.�տ�(cstm2, 200);
	}

}

