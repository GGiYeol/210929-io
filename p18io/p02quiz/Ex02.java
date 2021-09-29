package p18io.p02quiz;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex02 {

	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\nicek\\Desktop\\iotest\\asd.jpg";
		InputStream is = new FileInputStream(name);
		
		byte[] data = new byte[100];
		int cnt = 0;
		int filesize = 0;
		
//		while((cnt = is.read()) != -1) {
//			filesize++;
//		}
		while((cnt = is.read(data)) != -1) {
			filesize +=cnt;
		}
		
		
		System.out.println("파일크기 : " + filesize + "bytes");
		System.out.println("프로그램 종료");
		is.close();
	}
}
