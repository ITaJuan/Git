package day11.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class Test�ַ��� {

	@Test
	public void test01() {
		// file����
		File file1 = new File("C:/temp2/test01.txt");

		// ������ַ���Write����
		try {
			FileWriter fw = new FileWriter(file1);

			fw.write("Hello World!\n");
			fw.write("Hello World!\n");
			fw.write("Hello World!\n");

			fw.flush();// ˢ��
			fw.close();// �ر���
			System.out.println(file1.length());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	// copy�ļ�
	public void test02() {

		try {// �ַ�������
			FileReader fr = new FileReader("C:/temp2/test01.txt");

			// �ַ������

			FileWriter fw = new FileWriter("C:\\temp2\\tst01\\test02.txt");

			int ���� = 0; // 32bit
			while ((���� = fr.read()) != -1) {

				// д��
				fw.write(����);
			}

			// �ͷ���Դ
			fw.flush();
			fw.close();
			fr.close();

			System.out.println("���ݲ�������");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test
	// copy���ı��ļ�------>�ַ����������ڲ������ı��ļ�
	public void test03() {

		try {// �ַ�������
			FileReader fr = new FileReader("C:/temp2/test01.txt");

			// �ַ������

			FileWriter fw = new FileWriter("C:\\temp2\\tst01\\test02.txt");

			int ���� = 0; // 32bit
			long begin = System.currentTimeMillis();
			System.out.println("��ʼ��ȡ��������");
			while ((���� = fr.read()) != -1) {

				// д��
				fw.write(����);
			}
			long end = System.currentTimeMillis();
			System.out.println((end - begin) + "����");
			/*
			 * //�������� byte[] b=new byte[2]; //�൱��int,һ�ζ�32λ while (( fr.read(b))
			 * != -1) { // д�� fw.write(b); }
			 */
			// �ͷ���Դ
			fw.flush();
			fw.close();
			fr.close();

			System.out.println("���ݲ�������");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test
	// �ֽ��������ڲ������ı��ļ�
	public void test04() {

		try {// �����ӽ���
			FileInputStream fin = new FileInputStream("C:/temp2/FeiQ .exe");

			// File newFile = new File("C:\\temp2\\tst01\\test02.txt");
			// if (newFile.exists()) {
			// newFile.delete();
			// }
			// ����ӽ���
			FileOutputStream fout = new FileOutputStream(
					"C:\\temp2\\tst01\\FeiQ .exe");
			System.out.println("���ڶ�ȡ������");
			long begin = System.currentTimeMillis();
			// int tmp = 0;
			byte[] b = new byte[16];
			while ((fin.read(b)) != -1) {
				fout.write(b);
			}
			long end = System.currentTimeMillis();
			System.out.println("�����ɹ�" + (end - begin));

			fout.flush();
			fout.close();
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
