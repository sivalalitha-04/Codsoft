package projects;
import java.util.*;

public class Randomnumber {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in); 
		int tries=0;
		int score=100;
		int num=0;
		boolean guess=true;
		int rand_num=introduction();
		while(guess) {
			System.out.print
			("Enter your guess(Range:1 to 100):");
			num=in.nextInt();
			tries++;
			if(num<0) {
				System.out.println("----------------Game ended successfully----------------");
				break;
			}
			int x=rand_num-num;
			if(x==0) {
				System.out.println("Congratulations!!! You guessed the Number "+num);
				System.out.println("Attempts: "+tries);
				System.out.println("Overall score: "+score);
				guess=false;
			}
			else if(x>0) {
				if(x<=20)
					System.out.println("Low!!! Try again");
				else
					System.out.println("Too low!!! Try again");
			}
			else {
				if(x<=-20)
					System.out.println("Too high!!! Try again");
				else
					System.out.println("High!!! Try again");
			}
			score-=10;
			if(tries>10) {
				System.out.println("You attempted more than 10, Game ended");
				System.out.println("-------------------------------------------");
				guess=false;
			}
			if(!guess) {
				System.out.println("Do you want to play again again? (Yes/No)");
				String s=in.next();
				in.nextLine();
				if(s.equals("Yes")) {
					rand_num=introduction();
					tries=0;
					score=100;
					guess=true;
				}
				else {
					System.out.println("-x-x-x-x-x-Thankyou-x-x-x-x-x-");
				}
			}
		}
	}
	public static int introduction() {
		System.out.println("----------------NUMBER GAME----------------");
		System.out.println("Guidelines:-");
		System.out.println("-> Your have only 10 tries to guess your number");
		System.out.println("-> If you wants to quit the game, enter a negative number");
		System.out.println("-------------------------------------------");
		Random random = new Random();  
		return random.nextInt(100);
	}
}
