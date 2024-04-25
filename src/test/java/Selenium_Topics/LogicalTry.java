package Selenium_Topics;

import org.testng.annotations.Test;

public class LogicalTry {

	@Test
	private void reverseTheGivenString() {

		String given = "tamilnadu";// udanlimat
		int lengthGiven = given.length();
		System.out.println(lengthGiven);
		String result = "";
		for (int i = lengthGiven - 1; i >= 0; i--) {
			char charAt = given.charAt(i);
			result = result + charAt;
		}

		System.out.println(result);
	}

	@Test
	private void reverseTheGivenStringByEachWord() {

		String given = "tamilnadu chennai thoraipakkam"; // udanlimat iannehc makkapiaroht
		String result = "";
		String[] split = given.split(" ");
		for (String single : split) {
			for (int i = single.length() - 1; i >= 0; i--) {
				char charAt = single.charAt(i);
				result = result + charAt;

			}
			result = result + " ";
		}
		System.out.println(result);
	}

	@Test
	private void swapping() {

		String given = "tamilnadu chennai"; // chennai tamilnadu
		String result = "";

		String[] split = given.split(" ");

//		result = split[1]+" "+split[0];
//		System.out.println(result);

		for (int i = split.length - 1; i >= 0; i--) {

			result = result + split[i] + " ";

		}

		System.out.println(result);

	}

	@Test
	private void findtherepeatedcountOfspecificCharacter() {

		String given = "tamilnaduchennai";// given character n count 3
		char search = 'n';
		int count = 0;
		for (int i = 0; i < given.length(); i++) {
			char charAt = given.charAt(i);

			if (search == charAt) {
				count++;
			}

		}

		System.out.println("given character " + search + " count " + count);
	}

	@Test
	private void dummy() {

		String name = "chennai tamilnadu";// iannehc udanlimat
		String result = "";
		String ans = "";

		String[] split = name.split(" ");
		for (String string : split) {

			for (int i = string.length() - 1; i >= 0; i--) {

				char charAt = string.charAt(i);

				result = result + charAt;

			}
			result = result + " ";
		}

		System.out.println(result);

		for (int i = split.length - 1; i >= 0; i--) {

			ans = ans + split[i] + " ";

		}

		System.out.println(ans);// tamilnadu chennai
	}

	@Test
	private void dummy2() {

//		String name = "ganesh";
//		System.out.println("name "+ System.identityHashCode(name));
//		
//		name = name.concat("kumar");
//		
//		System.out.println("name "+ System.identityHashCode(name));
//		
//		
//		StringBuilder sb = new StringBuilder("ganesh");
//		System.out.println("sb "+ System.identityHashCode(sb));
//		
//	     sb.append("kumar");
//	     System.out.println("sb "+ System.identityHashCode(sb));

		String voice = "ganesh";
		System.out.println("voice " + System.identityHashCode(voice));

		String voice1 = "ganesh";
		System.out.println("voice1 " + System.identityHashCode(voice1));

		String voice3 = new String("ganesh");
		System.out.println("voice3 " + System.identityHashCode(voice3));

		String voice4 = new String("ganesh");
		System.out.println("voice4 " + System.identityHashCode(voice4));

	}

	@Test
	private void checkTheGivenStringPalidrom() {
		String name = "malayalam";

		String ans = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			char charAt = name.charAt(i);
			ans = ans + charAt;

		}

		if (name.equals(ans)) {
			System.out.println(name + "  is palindrom");
		} else {
			System.out.println(name + "  is not palindrom");
		}
	}

	@Test
	private void swappingTheTwoStringwithThirdString() {
		String name1 = "chennai";
		String name2 = "Tamil";
		String name3 = name1 + name2;// chennaitamil
		name1 = name2;
		System.out.println("name1 "+name1);
		name2 = name3.substring(0, 7);
		System.out.println("name2 "+name2);

	}
	

	@Test
	private void swappingTheTwoStringwithoutThirdString() {
		String name1 = "chennai";
		String name2 = "Tamil";
		
		name2 = name1+name2;// chennaitamil
		name1=name2.substring(7);
		System.out.println("name1 "+name1);
		name2=name2.substring(0, name2.length()-name1.length());
		System.out.println("name2 "+name2);

	}

}
