package p18io.p02quiz;

import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class Ex07 {


	public Map<Character, Integer> count(String fileName) throws Exception	{
		
		Reader rd = new FileReader(fileName);
		
		Map<Character, Integer> map = new HashMap<>();
		
		int c = 0;
		
		while((c = rd.read()) != -1) {
			if(map.containsKey((char) c)) {
				map.put((char) c, map.get((char)c) + 1);
			} else	{
				map.put((char) c, 1);
			}
			
		}
		rd.close();
		return map;
	}
}
