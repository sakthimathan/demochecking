package Selenium_Topics;


import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class Logic_Practice {

	@Test
	void swappingTwoStringWithThirdString() {
		String name1 = "Mannargudi";
		String name2 = "Thiruvarur";
		
		String name3 = name1 + name2;//MannargudiThiruvarur
		
		name1=name2;
		System.out.println("Name1 "+name1);
		
		name2=name3.substring(0,name3.length()-name1.length());
		System.out.println("Name2 "+name2);

		
	}
	
	@Test
	void swappingTwoStringWithoutThirdString() {
		String name1 = "Mannargudi";
		String name2 = "Thiruvarur";
		
		name2=name1+name2;//MannargudiThiruvarur
		
		name1=name2.substring(10);
		System.out.println("Name1 "+name1);
		
		name2=name2.substring(0,name2.length()-name1.length());
		System.out.println("Name2 "+name2);

		
	}
	@Test
	void ReverseString() {
		String given="Mannargudi-Thiruvarur";
		String ans="";
		
		for(int i=given.length()-1;i>=0;i--) {
			char charAt = given.charAt(i);
			ans=ans+charAt;
		}
		System.out.println(ans);
	}
	
	@Test
	void OccuranceOfString() {
		String given="Mannargudi-Thiruvarur";
		
		Map<Character , Integer> map= new LinkedHashMap<>();
		for(int i=0;i<=given.length()-1 ;i++) {
			char c = given.charAt(i);
			if (map.containsKey(c)) {
				Integer integer = map.get(c);
				map.put(c, integer +1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
	
	

}
