//the point of this class confuses me; my code is tested in the unit tests

/*
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		//new BoardGame instance for class operations
		BoardGame bg = new BoardGame();
		
		//instance of scanner for standard user input
		Scanner scnr = new Scanner(System.in);
		
		//display choices for BoardGame operations while user wants
		do 
		{
			//calls optionMenu until user quits out
		}while(optionMenu(bg, scnr));
	}
	
	public static boolean optionMenu(BoardGame bg, Scanner scnr)
	{
		System.out.println("1: Add a player\n2: Get a player's game piece\n3:Get the name of a player with game piece"
				+ "\n4: Move a player\n5: Move two players\n6: Get a player's location\n7: Get players at a location"
				+ "\n8: Get game pieces at a location\n9: Get all players\n10: Get all player locations"
				+ "\n11: Get all player locations\nQUIT\nEnter Key:");
		
		String key = scnr.next();
		
		if(key.equalsIgnoreCase("quit"))
		{
			return false;
		}
		//defines actions for each menu key
		switch(key)
		{
			case "1": System.out.println("Enter Player Name: ");
				String name = scnr.next();
				System.out.println(enter);
						
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				break;
			case "6":
				break;
			case "7":
				break;
			case "8":
				break;
			case "9":
				break;
			case "10":
				break;
			case "11":
				break;
			default: System.out.println("Invalid Key.");
				break;
		}
		
		//if quit not entered for key
		return true;
	}
	
	public static String listGamePieces()
	{
		return "RED_RACER\n" + "BLUE_RACER\n" + "MAGENTA_RACER\n" + 
				"RED_THIMBLE\n" + "BLUE_BOOT\n" + "GREEN_BOOT\n" + 
				"YELLOW_BOOT";
	}
	
	public static String listLocations()
	{
		return "KITCHEN\n" + "CONSERVATORY\n" + "DINING_ROOM\n" + 
				"BALLROOM\n" + "STUDY\n" + "HALL\n" + 
				"LOUNGE\n" + "LIBRARY\n" + "BILLIARD_ROOM";
	}

}
*/