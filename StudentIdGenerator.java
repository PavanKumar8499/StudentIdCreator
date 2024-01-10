package newAssign;

import java.util.Scanner;

public class StudentIdGenerator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//inputs
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Enter bg");
		String bg=sc.nextLine();
		System.out.println("Enter Age");
		int age=sc.nextInt();
		System.out.println("Wait");
		String grade="";
		
		
		if(age>=20) {
			grade="RED";
		}else if(age>=15 && age<20) {
			grade="BLUE";
		}else if(age>=10 && age<15) {
			grade="YELLOW";
		}else {
			grade="invalid. please try above age of 10";
		}
		
		System.out.println("---------------------\n"+"Name: "+name+"\n"+"Age: "+age+"\n"+"Blood Group: "+bg+"\n"+"---------------------"+"\n"+"Your group is "+grade+"\n---------------------");
	}

}
