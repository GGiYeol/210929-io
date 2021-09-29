package p18io.p03lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex03 {

	public static void main(String[] args) throws Exception{
		String file = "C:\\Users\\nicek\\Desktop\\iotest\\test2.txt";
		InputStream is = new FileInputStream(file); 
		
		byte[] data = new byte[10];
		
		//읽은 개수 - 10개씩 읽는다.
		//읽은 데이터를 data에 저장되고, 몇개씩 읽었는지 저장된다.
		int dataSize1 = is.read(data);
		int dataSize2 = is.read(data);
		int dataSize3 = is.read(data);
		int dataSize4 = is.read(data);
		int dataSize5 = is.read(data);//남은 크기만 읽고 리턴
		int dataSize6 = is.read(data);//더 이상 읽을 데이터가 없을 때는 -1리턴	
		
		System.out.println(dataSize1);
		System.out.println(dataSize2);
		System.out.println(dataSize3);
		System.out.println(dataSize4);
		System.out.println(dataSize5);
		System.out.println(dataSize6);
		
		is.close();
	}
}
