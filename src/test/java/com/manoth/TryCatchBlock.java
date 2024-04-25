package com.manoth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchBlock {

	private void method1() throws InterruptedException{

		try {
			  
			System.out.println("try block entered succesfully");
			String name = "java";
			String ans = "";
//			Thread.sleep(300000);// wait
			for (int i = name.length()-1; i >= 0; i--) {
				char c = name.charAt(i);
				ans = ans + c;

			}
			System.out.println("reverse the string -->  " + ans);
			System.out.println("try block executed succesfully");
		 
			throw new Exception("Ganesh Exception"); 
					}
	

		catch (ArrayIndexOutOfBoundsException a) {

			System.out.println("ArrayIndexOutOfBoundsException entered succesfully");
			String name = "java";
			String ans = "";
			for (int i = name.length() - 1; i >= 0; i--) {
				char c = name.charAt(i);
				ans = ans + c;

			}
			System.out.println("reverse the string " + ans);
			System.out.println("ArrayIndexOutOfBoundsException executed succesfully");

		}

		catch (StringIndexOutOfBoundsException s) {

			System.out.println("StringIndexOutOfBoundsException entered succesfully");
			String name = "java";
			String ans = "";
			for (int i = name.length() - 1; i >= 0; i--) {
				char c = name.charAt(i);
				ans = ans + c;

			}
			System.out.println("reverse the string -->  " + ans);
			System.out.println("StringIndexOutOfBoundsException executed succesfully");

		} catch (Exception e) {

//			System.out.println("StringIndexOutOfBoundsException entered succesfully");
//			String name = "java";
//			String ans = "";
//			for (int i = name.length() - 1; i >= 0; i--) {
//				char c = name.charAt(i);
//				ans = ans + c;
//
//			}
//			System.out.println("reverse the string -->  " + ans);
//			System.out.println("StringIndexOutOfBoundsException executed succesfully");

			System.out.println("Exception entered succesfully");
			e.printStackTrace();
			System.out.println("Exception executed succesfully");
		}

		finally {
			System.out.println("finally executed succesfully");
		}

	}

	public static void main(String[] args) throws InterruptedException,FileNotFoundException,IOException {
		TryCatchBlock t = new TryCatchBlock();
		t.method1();
	}

}
