package day11.biz;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.junit.Test;

public class Props {

	@Test
	// 实现读取console输入
	public void WaitInputFromConsole() {

		// InputStream in = System.in;
		// Scanner sc=new Scanner(in);

		// 带缓冲的字符流 -------------------------------//字符流 转 子节流
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("请输入姓名：");
		try {
			String uname = br.readLine();
			System.out.println("请输入密码：");
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
	// 属性文件：java的属性文件，常规的程序配置型数据
	public void testProp1() {
		// 在内存中生成一个属性文件
		Properties propFile1 = new Properties();
		propFile1.put("no", "12");
		propFile1.put("score", "90");
		try {
			// 去classpath下加载文件到propFile1
			propFile1.load(this.getClass().getClassLoader()
					.getResourceAsStream("run.properties"));
			System.out.println(propFile1.getProperty("class"));
			System.out.println(propFile1.getProperty("time"));
			System.out.println(propFile1.getProperty("city"));
			System.out.println(propFile1.getProperty("name"));
			System.out.println(propFile1.getProperty("no"));
			System.out.println(propFile1.getProperty("score"));

			// 存储
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
