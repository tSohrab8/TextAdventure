import java.util.*;

public class TextAdventure {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int choice;
		int state = 0;
		
		while (true){
			
			switch (state){
				case 0: System.out.println("Hello. Would you like to go to 1) kitchen or 2)living room"); break;
				case 1: System.out.println("you are in kitchen. Next 1)bedroom or 2)outside"); break;
				case 2: System.out.println("you are in living room. next 1)car or 2)mcdonalds"); break;
				case 3: System.out.println("You are in bedroom. Next 1)work or 2)park"); break;
				case 4: System.out.println("You are outside. Next 1)golfing or 2)movies"); break;
				case 5: System.out.println("You went to your car. It is broken. Next 1)Bowling or 2)Skydiving"); break;
				case 6: System.out.println("You went to mcdonalds and got a burger. Next 1)Pizza Hut or 2)The Gym"); break;
				case 7: System.out.println("You went to work. You got money. You win"); break;
				case 8: System.out.println("You went to the park and enjoyed the breeze. Good work."); break;
				case 9: System.out.println("You went golfing and relaxed all day, congrats."); break;
				case 10: System.out.println("You went to the movies and saw the latest film, it was great"); break;
				case 11: System.out.println("You went bowling and bowled a perfect 300 game, you are awesome"); break;
				case 12: System.out.println("You went skydiving, you are so hardcore"); break;
				case 13: System.out.println("You went to pizza hut... right after mcdonalds... you were really hungry"); break;
				case 14: System.out.println("You hit the gym to work off those calories, good going"); break;
			}
			
			choice = scan.nextInt();
			
			if (state >= 7){
				break;
			}
			
			switch(choice){
				case 1: state = (state*2) + 1;
						break;
				case 2:	state = (state*2) + 2; 
						break;
			}

			
		}
	}

}
