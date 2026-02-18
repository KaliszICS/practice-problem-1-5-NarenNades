/**
	* File: Lesson 1.5: Characters
	* Author: Naren Nades
	* Date Created: February 10, 2023
	* Date Last Modified: February 18, 2026
	*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
		char a = 'a';
		System.out.println(a);
	}

	public static void q2() {
		//Write question 2 code here
		char c;
		Scanner input = new Scanner(System.in);
		String word;
		System.out.print("Input a word: ");
		word = input.nextLine();
		c = word.charAt(2);
		System.out.println(c);
	}

	public static void q3() {
		//Write question 3 code here
		char c;
		Scanner input = new Scanner(System.in);
		String word;
		System.out.print("Input a word: ");
		word = input.nextLine();
		c = word.charAt(1);
		System.out.println("The second character user entered was: "+c);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("Input a number: ");
		num = input.nextInt();
		System.out.println("Your number plus 1 is: "+(num+1));
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a letter: ");
		String l = input.nextLine();
		char c = l.charAt(0);
		System.out.print("Input another letter: ");
		String l2 = input.nextLine();
		char c2 = l2.charAt(0);
		System.out.println(c+c2);
	}

}
