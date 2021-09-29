package p18io.p02quiz;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws Exception {
		String aa = "C:\\Users\\nicek\\Desktop\\iotest\\outtest2.txt";
		OutputStream aaa = new FileOutputStream(aa);
		
		for(int i = 0; i<1024; i++) {
			
			aaa.write(65);
		}
		
	
		aaa.close();
	}
}
