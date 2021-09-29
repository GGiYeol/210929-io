package p18io.p02quiz;

import java.io.FileReader;
import java.io.Reader;

public class Ex06 {

	public static void main(String[] args) throws Exception {
		String filename = "C:\\Users\\nicek\\Desktop\\iotest\\test3.txt";
		Reader r = new FileReader(filename);
		int data = 0;
		while((data = r.read()) != -1) {
			System.out.println((char)data);
		}
	
	System.out.println("프로그램 종료");
	}
}