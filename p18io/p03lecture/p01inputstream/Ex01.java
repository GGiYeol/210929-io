package p18io.p03lecture.p01inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Ex01 {//read

	public static void main(String[] args) throws Exception {
		
		String fileName = "src/p18io/p03lecture/p01inputstream/Ex01.java";
		
		File file = new File(fileName);
		System.out.println(file.exists());
		
		//바탕화면의 파일 불러오는 방법
		//바탕화면에 파일을 만든 뒤, 속성에 들어가서 위치를 알아낸다.
		String fileName2 = "C:\\Users\\nicek\\Desktop\\iotest\\test1.txt";
		File file2 = new File(fileName2);
		System.out.println(file2.exists());
		
		InputStream is = new FileInputStream(file2);
		//checked exception을 발생시키는생성자이기 때문에, try-catch
		//코드를 간단히 하기 위해서 throws를 씀
		
		int byte1 = is.read(); //read 메소드는 1byte를 읽고 리턴해줌
		//byte를 쓸 수 없음. 리턴타입이 int라 크기가 다르기 때문
		int byte2 = is.read();							
		int byte3 = is.read(); //더이상 읽을 내용이 없으면 -1 리턴
		int byte4 = is.read(); //더이상 읽을 내용이 없으면 -1 리턴
		
		System.out.println(byte1);
		System.out.println(byte2);
		System.out.println(byte3);
		System.out.println(byte4);
	}
}

