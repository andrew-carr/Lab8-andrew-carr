import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class BoardGameTest {

	@Test
	public void testAddPlayer()
	{
		BoardGame bg = new BoardGame();
		
		bg.addPlayer("Scott", GamePiece.RED_RACER, Location.KITCHEN);
		
		//adds same player; returns false
		Assert.assertEquals("BoardGame addPlayer incorrect", false,
				bg.addPlayer("Scott", GamePiece.RED_RACER, Location.KITCHEN));
		
		//adds different player; returns true
		Assert.assertEquals("BoardGame addPlayer incorrect", true,
				bg.addPlayer("Ramona", GamePiece.BLUE_RACER, Location.CONSERVATORY));
	}
	
	
	@Test
	public void testGetPlayerGamePiece()
	{
		BoardGame bg = new BoardGame();
		
		bg.addPlayer("Scott", GamePiece.RED_RACER, Location.KITCHEN);
		
		Assert.assertEquals("BoardGame getPlayerGamePiece incorrect", GamePiece.RED_RACER, bg.getPlayerGamePiece("Scott"));
	}
	
	@Test
	public void testGetPlayerWithGamePiece()
	{
		BoardGame bg = new BoardGame();
		
		bg.addPlayer("Ramona", GamePiece.BLUE_RACER, Location.CONSERVATORY);
		
		Assert.assertEquals("BoardGame getPlayerWithGamePiece incorrect", "Ramona",bg.getPlayerWithGamePiece(GamePiece.BLUE_RACER));
		
		//no player correlated with game piece; null is returned
		Assert.assertEquals("BoardGame getPlayerWithGamePiece incorrect", null, bg.getPlayerWithGamePiece(GamePiece.GREEN_BOOT));
	}
	
	@Test
	public void testMoveTwoPlayers()
	{
		BoardGame bg = new BoardGame();
		
		bg.addPlayer("Scott", GamePiece.RED_RACER, Location.KITCHEN);
		bg.addPlayer("Ramona", GamePiece.BLUE_RACER, Location.CONSERVATORY);
		
		String[] playerNames = new String[]{"Ramona", "Scott"};
		Location[] newLocations = new Location[]{Location.BALLROOM, Location.STUDY};
		String[] expecteds = new String[]{"Scott", "Ramona"};
		
		Assert.assertArrayEquals("BoardGame moveTwoPlayers incorrect", expecteds, bg.moveTwoPlayers(playerNames, newLocations));	
	}
	
	@Test
	public void testGetPlayersLocation()
	{
		BoardGame bg = new BoardGame();
		
		bg.addPlayer("Kim", GamePiece.YELLOW_BOOT, Location.DINING_ROOM);
		
		Assert.assertEquals("BoardGame getPlayersLocation incorrect", Location.DINING_ROOM, bg.getPlayersLocation("Kim"));
		
		//test after moves location
		bg.movePlayer("Kim", Location.HALL);
		Assert.assertEquals("BoardGame getPlayersLocation incorrect", Location.HALL, bg.getPlayersLocation("Kim"));
	}
	
	@Test
	public void testGetPlayersAtLocation()
	{
		BoardGame bg = new BoardGame();
		
		bg.addPlayer("Scott", GamePiece.RED_RACER, Location.DINING_ROOM);
		bg.addPlayer("Ramona", GamePiece.BLUE_RACER, Location.CONSERVATORY);
		bg.addPlayer("Kim", GamePiece.YELLOW_BOOT, Location.DINING_ROOM);
		
		//ArrayList of expected String items for players at DINING_ROOM
		ArrayList<String> expecteds = new ArrayList<String>();
		expecteds.add("Scott");
		expecteds.add("Kim");
		
		Assert.assertEquals("BoardGame getPlayersAtLocation incorrect", expecteds, bg.getPlayersAtLocation(Location.DINING_ROOM));
	}
	
	@Test
	public void testGetGamePiecesAtLocation()
	{
		BoardGame bg = new BoardGame();
		
		bg.addPlayer("Scott", GamePiece.RED_RACER, Location.DINING_ROOM);
		bg.addPlayer("Ramona", GamePiece.BLUE_RACER, Location.CONSERVATORY);
		bg.addPlayer("Kim", GamePiece.YELLOW_BOOT, Location.DINING_ROOM);
		
		//ArrayList of expected GamePiece items for players at DINING_ROOM
		ArrayList<GamePiece> expecteds = new ArrayList<GamePiece>();
		expecteds.add(GamePiece.RED_RACER);
		expecteds.add(GamePiece.YELLOW_BOOT);
		
		Assert.assertEquals("BoardGame getGamePiecesAtLocation incorrect", expecteds, bg.getPlayersAtLocation(Location.DINING_ROOM));
	}
	
	@Test
	public void testGetPlayers()
	{
		BoardGame bg = new BoardGame();
		
		bg.addPlayer("Scott", GamePiece.RED_RACER, Location.DINING_ROOM);
		bg.addPlayer("Ramona", GamePiece.BLUE_RACER, Location.CONSERVATORY);
		bg.addPlayer("Kim", GamePiece.YELLOW_BOOT, Location.DINING_ROOM);	
		
		//getPlayers returns List of players in BoardGame
		Set<String> dataSet = new HashSet<String>(bg.getPlayers());
		
		String[] expected = new String[] {"Scott", "Ramona", "Kim"};
		
		for(int index = 0; index < expected.length; ++index)
		{
			Assert.assertTrue(dataSet.contains(expected[index]));
		}
	}
	
	@Test
	public void testGetPlayerLocations()
	{
		BoardGame bg = new BoardGame();
		
		bg.addPlayer("Scott", GamePiece.RED_RACER, Location.DINING_ROOM);
		bg.addPlayer("Ramona", GamePiece.BLUE_RACER, Location.CONSERVATORY);
		bg.addPlayer("Kim", GamePiece.YELLOW_BOOT, Location.DINING_ROOM);	
		
		//getPlayers returns List of players in BoardGame
		Set<Location> dataSet = new HashSet<Location>(bg.getPlayerLocations());
		
		Location[] expected = new Location[] {Location.DINING_ROOM, Location.CONSERVATORY};
		
		for(int index = 0; index < expected.length; ++index)
		{
			Assert.assertTrue(dataSet.contains(expected[index]));
		}	
	}
	
	@Test
	public void testGetPlayePieces()
	{
		BoardGame bg = new BoardGame();
		
		bg.addPlayer("Scott", GamePiece.RED_RACER, Location.DINING_ROOM);
		bg.addPlayer("Ramona", GamePiece.BLUE_RACER, Location.CONSERVATORY);
		bg.addPlayer("Kim", GamePiece.YELLOW_BOOT, Location.DINING_ROOM);	
		
		//getPlayers returns List of players in BoardGame
		Set<GamePiece> dataSet = new HashSet<GamePiece>(bg.getPlayerPieces());
		
		String[] expected = new String[] {GamePiece.RED_RACER, GamePiece.BLUE_RACER, GamePiece.YELLOW_BOOT};
		
		for(int index = 0; index < expected.length; ++index)
		{
			Assert.assertTrue(dataSet.contains(expected[index]));
		}	
	}
}
