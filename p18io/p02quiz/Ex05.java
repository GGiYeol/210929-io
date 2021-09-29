package p18io.p02quiz;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex05 {

	public static void main(String[] args) throws Exception{
		
		// 파일명:outtest4.txt
		// 파일크기:1Mbytes = 1024*1024bytes
		// 내용은 상관없음
		// 파일 만들어보기
		// OutputStream.write(byte[]) 사용해보기
		byte[] da = new byte[] {65,65,65,65};
		OutputStream file = new FileOutputStream("C:\\Users\\nicek\\Desktop\\iotest\\outtest4.txt");
		
		for(int i = 0; i<256*1024; i++) {
			file.write(da);
		}
		System.out.println("프로그램 종료");
	}
}
