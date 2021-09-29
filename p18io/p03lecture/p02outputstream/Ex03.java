package p18io.p03lecture.p02outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\Users\\nicek\\Desktop\\iotest\\asd.jpg");
		OutputStream os = new FileOutputStream("C:\\Users\\nicek\\Desktop\\iotest\\outtest5.jpg");
		
		byte[] datas = new byte[100];
		for( int i = 0; i<117; i++) {
			if(i == 116) {
				is.read(datas);
				os.write(datas,0,39);
			} else {
				is.read(datas);
				os.write(datas);
			}
				
		}
		System.out.println("프로그램 종료");
		is.close();
		os.close();
	}
}
