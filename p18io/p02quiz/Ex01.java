package p18io.p02quiz;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex01 {
public static void main(String[] args) throws Exception {
	String file = "C:\\Users\\nicek\\Desktop\\iotest\\asd.jpg";
	InputStream is = new FileInputStream(file);
	int size = 0;
//	int sy = 0;
//	
//	while((size = is.read()) != -1) {
//		System.out.println(size);
//		sy ++;
//	}
//	
//	
//	System.out.println("파일크기:" + sy);
	
	while(is.read() != -1) {
		size ++;
	}
	System.out.println("파일크기:" + size);
	System.out.println("프로그램 종료");
	is.close();
	}
}
