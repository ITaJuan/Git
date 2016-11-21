package day11.biz;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.junit.Test;

public class Props {

	@Test
	// ʵ�ֶ�ȡconsole����
	public void WaitInputFromConsole() {

		// InputStream in = System.in;
		// Scanner sc=new Scanner(in);

		// ��������ַ��� -------------------------------//�ַ��� ת �ӽ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("������������");
		try {
			String uname = br.readLine();
			System.out.println("���������룺");
			String upwd = br.readLine();
			System.out.println(uname + upwd);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Test
	// �����ļ���java�������ļ�������ĳ�������������
	public void testProp1() {
		// ���ڴ�������һ�������ļ�
		Properties propFile1 = new Properties();
		propFile1.put("no", "12");
		propFile1.put("score", "90");
		try {
			// ȥclasspath�¼����ļ���propFile1
			propFile1.load(this.getClass().getClassLoader()
					.getResourceAsStream("run.properties"));
			System.out.println(propFile1.getProperty("class"));
			System.out.println(propFile1.getProperty("time"));
			System.out.println(propFile1.getProperty("city"));
			System.out.println(propFile1.getProperty("name"));
			System.out.println(propFile1.getProperty("no"));
			System.out.println(propFile1.getProperty("score"));

			// �洢
			// FileWriter fr=new FileWriter("c:/temp2/my.prop");
			propFile1.store(new FileWriter("c:/temp2/my.prop"), "df");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// public static void mian(String[] args) {
	// Process process=new Props();
	// }

}
