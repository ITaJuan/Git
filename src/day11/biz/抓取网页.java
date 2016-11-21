package day11.biz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ץȡ��ҳ {

	List<String> imgUrls = new ArrayList<>();

	// ץȡͼƬ
	public void getWeb(String url) {

		try {
			// ͨ����Դ��λ����������������
			InputStream in = new URL(url).openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			String str = null;
			while ((str = br.readLine()) != null) {
				// System.out.println(str);//��ӡ��ҳ

				// ��ȡͼƬ��ַ�����Ϊ<img
				// src="http://ns2.bdstatic.com/static/fisp_static/common/img/show_top_qrcode/img/1014720j_63c8044.png">
				if (str.indexOf("<img ") > 0) {

					str = str.substring(str.indexOf("<img "));
					str = str.substring(str.indexOf("src=\"") + 5);
					if ("http:".equals(str.substring(0, 5))) {
						str = str.substring(0, str.indexOf("\""));
						// System.out.println(str);
						// ���ص�ͼƬ��ַ����
						imgUrls.add(str);
					}
				}
			}
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void ͼƬ����() {
		if (imgUrls.size() > 0) {// ��ͼƬ

			File imgs = new File("c:/temp2/imgs");
			if (imgs.exists()) {
				imgs.delete();
			}
			imgs.mkdir();

			// ������ӽ���
			BufferedInputStream bin = null;
			BufferedOutputStream bout = null;

			int index = 0;
			for (String urlStr : imgUrls) {// ������ַ��ʼ����
				try {
					bin = new BufferedInputStream(new URL(urlStr).openStream());
					bout = new BufferedOutputStream(new FileOutputStream(
							new File(imgs, "imgs" + (index++) + ".jpg")));

					byte[] b = new byte[1024];
					while ((bin.read(b)) != -1) {
						bout.write(b);
					}
					bout.flush();
					bout.close();
					bin.close();
					System.out.println("����" + index + "��ͼƬsucces1");

				} catch (MalformedURLException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}

		}
	}

	public static void main(String[] args) {
		ץȡ��ҳ t = new ץȡ��ҳ();
		t.getWeb("http://tech.baidu.com/");
		t.ͼƬ����();
	}
}
