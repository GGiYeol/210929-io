package p18io.p02quiz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex04 {

	public static void main(String[] args) throws Exception{
		//각자 가진 그림 파일을 내용으로 채워진 새 파일 만들기
		//파일명 : outtest2.jpg
		String oneFile = "C:\\Users\\nicek\\Desktop\\iotest\\asd.jpg";
		String file = "C:\\Users\\nicek\\Desktop\\iotest\\outtest2.jpg";
		InputStream is = new FileInputStream(oneFile);
		OutputStream os = new FileOutputStream(file);
		
		
		int copy = 0;
		while((copy = is.read()) != -1) {
			os.write(copy);
			
		}
		System.out.println("프로그램 종료");
		is.close();
		os.close();
		
	}
}
