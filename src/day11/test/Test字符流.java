package day11.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class Test字符流 {

	@Test
	public void test01() {
		// file类型
		File file1 = new File("C:/temp2/test01.txt");

		// 输出的字符（Write）流
		try {
			FileWriter fw = new FileWriter(file1);

			fw.write("Hello World!\n");
			fw.write("Hello World!\n");
			fw.write("Hello World!\n");

			fw.flush();// 刷新
			fw.close();// 关闭流
			System.out.println(file1.length());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	// copy文件
	public void test02() {

		try {// 字符输入流
			FileReader fr = new FileReader("C:/temp2/test01.txt");

			// 字符输出流

			FileWriter fw = new FileWriter("C:\\temp2\\tst01\\test02.txt");

			int 勺子 = 0; // 32bit
			while ((勺子 = fr.read()) != -1) {

				// 写入
				fw.write(勺子);
			}

			// 释放资源
			fw.flush();
			fw.close();
			fr.close();

			System.out.println("数据操作结束");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test
	// copy非文本文件------>字符流不能用于操作非文本文件
	public void test03() {

		try {// 字符输入流
			FileReader fr = new FileReader("C:/temp2/test01.txt");

			// 字符输出流

			FileWriter fw = new FileWriter("C:\\temp2\\tst01\\test02.txt");

			int 勺子 = 0; // 32bit
			long begin = System.currentTimeMillis();
			System.out.println("开始读取。。。。");
			while ((勺子 = fr.read()) != -1) {

				// 写入
				fw.write(勺子);
			}
			long end = System.currentTimeMillis();
			System.out.println((end - begin) + "毫秒");
			/*
			 * //换大勺子 byte[] b=new byte[2]; //相当于int,一次读32位 while (( fr.read(b))
			 * != -1) { // 写入 fw.write(b); }
			 */
			// 释放资源
			fw.flush();
			fw.close();
			fr.close();

			System.out.println("数据操作结束");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test
	// 字节流可用于操作非文本文件
	public void test04() {

		try {// 输入子节流
			FileInputStream fin = new FileInputStream("C:/temp2/FeiQ .exe");

			// File newFile = new File("C:\\temp2\\tst01\\test02.txt");
			// if (newFile.exists()) {
			// newFile.delete();
			// }
			// 输出子节流
			FileOutputStream fout = new FileOutputStream(
					"C:\\temp2\\tst01\\FeiQ .exe");
			System.out.println("正在读取。。。");
			long begin = System.currentTimeMillis();
			// int tmp = 0;
			byte[] b = new byte[16];
			while ((fin.read(b)) != -1) {
				fout.write(b);
			}
			long end = System.currentTimeMillis();
			System.out.println("操作成功" + (end - begin));

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
