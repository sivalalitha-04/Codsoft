package projects;
import java.util.*;

public class Gradecalculator {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("--------------------GRADE CALCULATOR--------------------\n Note:-");
		System.out.println(" Avg | Grade ");
		System.out.println(" >90 |  A ");
		System.out.println(" >80 |  B ");
		System.out.println(" >60 |  C ");
		System.out.println(" >50 |  D ");
		System.out.println(" <50 |  E ");
		while(true) {
			System.out.println("----------------------------------------------------");
			System.out.print("Enter the number of subjects: ");
			int n=in.nextInt();
			int sum=0,avg=0;
			char grade='E';
			for (int i=0;i<n;) {
				System.out.print("\nEnter subject "+(i+1)+" mark (out of 100): ");
				int mark=in.nextInt();
				if(mark<0 || mark>100) {
					System.out.println("Invalid mark!!!");
					continue;
				}
				else {
					i++;
				}
				sum+=mark;
			}
			avg=(int)(sum/n);
			if(avg>90) {
				grade='A';
			}
			else if(avg>80) {
				grade='B';
			}
			else if(avg>60) {
				grade='C';
			}
			else if(avg>50) {
				grade='D';
			}
			System.out.println("Total Mark: "+sum);
			System.out.println("Average percentage: "+avg);
			System.out.println("Grade: "+grade);
			System.out.println("If you want to find grade for another student?");
			String s=in.next();
			if(s.equals("No")) {
				System.out.println("--------------------THANK YOU--------------------");
				break;
			}
			in.nextLine();
		}
	}
}
