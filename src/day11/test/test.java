package day11.test;

import java.io.File;

import org.junit.Test;

public class test {

	@Test
	public void test01() {

		// 取得一个目录
		File dic = new File("c:/tmp1");
		System.out.println(dic.exists());
		// 实际构建目录
		if (!dic.exists()) {
			dic.mkdir();
		}
		System.out.println("目录创建后是否存在" + dic.exists());
		//Directory: 目录
		if (dic.exists() && dic.isDirectory() && dic.canWrite()) {
			System.out.println(dic.delete() ? "删除成功" : "删除失败");
		}

	}

	// 相对路径和绝对路径
	@Test
	public void test02() {
		File dic = new File("c:/temp2");
		File dic2 = new File(dic, "tst01");
		File dic3 = new File(dic2, "tst02");

		System.out.println(dic3.mkdirs());

		// windows分界符
		File dic4 = new File("c:\\temp2\\tst01\\tst02\\tst03");
		System.out.println(dic4.mkdir());

	}

	@Test
	public void test03() {
		File files = new File("c:/temp2");
		if (files.isDirectory()) {
			File[] temp2 = files.listFiles();
			System.out.println(files.getName());
			for (File file1 : temp2) {
				System.out.println(" |_" + file1.getName());
				if (file1.isDirectory()) {
					File[] tst02 = file1.listFiles();
					for (File file2 : tst02) {
						System.out.println("  |_" + file2.getName());
						if (file2.isDirectory()) {
							File[] tst03 = file2.listFiles();
							for (File file3 : tst03) {
								System.out.println("   |_" + file3.getName());
							}
						}
					}
				}
			}
		}
	}

	
}
