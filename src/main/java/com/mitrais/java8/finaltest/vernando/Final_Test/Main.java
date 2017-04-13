package com.mitrais.java8.finaltest.vernando.Final_Test;

import java.util.Scanner;

public class Main {

	private static Scanner in;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		boolean done = false;
		in = new Scanner(System.in);
		String answer = "";
		while (!done) {
			System.out.println("========== MAIN MENU =========");
			System.out.println();
			System.out.println("1. GENERATE NEW RANDOM WORDS");
			System.out.println("2. SHOW ALL WORDS");
			System.out.println("3. MOST LONG WORD");
			System.out.println("4. MOST SHORT WORD");
			System.out.println("5. FIND TOTAL WORD BY CONTAINS");
			System.out.println("6. MAKE WORD EXCITED!");
			System.out.println("7. REMOVE SOME WORD");
			System.out.println("                DEFAULT : EXIT");
			System.out.println("==============================");
			System.out.print("ENTER YOUR CHOICE: ");
			try {
				answer = in.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
				done = true;
			}
			switch (answer) {
			case "1":
				int n = 0;
				try {
					System.out.print("ENTER TOTAL WORDS: ");
					answer = in.nextLine();
					n = Integer.parseInt(answer);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("YOUR INPUT IS NOT NUMBER, APPLICATION CLOSED!");
					done = true;
				}
				
				System.out.println( WordUtils.generateRandomNames(n) + " Random names has been generated!");
				break;
			case "2":
				System.out.println( "Total: " + WordUtils.showAllRandomNames() + " Names.");
				break;
			case "3":
				System.out.println("Most Long name is '" + WordUtils.mostLongName() + "'");
				break;
			case "4":
				System.out.println("Most Short name is " + WordUtils.mostShortName());
				break;
			case "5":
				try {
					System.out.print("ENTER A CONTAIN LETTER: ");
					answer = in.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
					done = true;
				}
				System.out.println("Total name that contains '"+answer+"' is: " + WordUtils.nameContains(answer) + " Names.");
				break;
			case "6":
				System.out.println("All "+ WordUtils.makeExcited() + " name edited to be excited");
				break;
			case "7":
				try {
					System.out.print("ENTER A CONTAIN LETTER: ");
					answer = in.nextLine();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				System.out.println(WordUtils.removeContains(answer) + " Names deleted!");
				break;
			default:
				done = true;
				break;
			}
			if(!done){
				System.out.print("WANT DO OTHER THING? (Y)");
				answer = in.nextLine();
				if(!answer.toLowerCase().equals("y")){
					done = true;
				}
			}
		}
		System.out.println("APPLICATION CLOSED!");
	}
}
