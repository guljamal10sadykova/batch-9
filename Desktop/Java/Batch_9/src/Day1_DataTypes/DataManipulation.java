package Day1_DataTypes;

import java.util.Scanner;

public class DataManipulation {
        public static void main(String[] args) {
			Scanner scan = new Scanner (System.in);
			System.out.println("Enter your name");
			String name = scan.nextLine();//keyword
			System.out.println("Enter your age");
			int age=scan.nextInt();
			System.out.println(age);
			
			if(name.equals("James Bond")) {
				System.out.println("Name is james,James Bond");
			}else if(name.equals("james bond")) {
				System.out.println("Name is james,James Bond");
			}
			else {
				System.out.println("Fake Bond");
			
			}
		}
}
