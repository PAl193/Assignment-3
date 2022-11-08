import java.util.*;
class game{
	Scanner sc=new Scanner(System.in);
	int player1() {
		System.out.println("Enter the number for player 1");
		int p1=sc.nextInt();
		return p1;
	}
	int player2() {
		System.out.println("Enter the number for player 2");
		int p1=sc.nextInt();
		return p1;
	}
	int  guesser() {
		
		System.out.println("Enter the number for guesser");
		int p1=sc.nextInt();
		return p1;
		
	}
	void result() {
		
		int p1=player1();
		int p2=player2();
		int g=guesser();
		System.out.println("Result Announcement...................");
		if(p1==g && p2==g) {
			System.out.println("match is tie So repeating the game");
			result();
		}
		else if(p1==g) {
			System.out.println("Player 1 won the match");
		}
		else if(p2==g) {
			System.out.println("Player 2 won the match");
		}
		else {
			System.out.println("Both the player is failed So repeating the game");
			result();
		}
	}
}



public class guesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("For start the game press 1 else 0");
		Scanner sc=new Scanner(System.in);
		int g =sc.nextInt();
		switch(g) {
		case 1:game g1=new game();
		       g1.result();
		
		case 0: 
			break;
		}
		
	}

}
