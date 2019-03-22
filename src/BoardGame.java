import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame {

	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;
	
	public BoardGame()
	{
		 playerPieces = new LinkedHashMap<>();
		 playerLocations = new LinkedHashMap<>();
	}
	
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation)
	{
		if(playerPieces.containsValue(gamePiece))
		{
			return false;
		}
		
		playerPieces.put(playerName, gamePiece);
		playerLocations.put(playerName, initialLocation);
		
		return true;
	}
	
	public GamePiece getPlayerGamePiece(String playerName)
	{
		return playerPieces.get(playerName);
	}
	
	public String getPlayerWithGamePiece(GamePiece gamePiece)
	{
		for(String key: playerPieces.keySet())
		{
			if(playerPieces.get(key).equals(gamePiece))
			{
				return key;
			}
		}
			
		return null;
	}
	
	public void movePlayer(String playerName, Location newLocation)
	{
		playerLocations.put(playerName, newLocation);
	}
	
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		String[] sortedPlayers = new String[2];
		
		//assigns result to reference to keep operation simple
		GamePiece first = GamePiece.movesFirst(getPlayerGamePiece(playerNames[0]), getPlayerGamePiece(playerNames[1]));
		
		if(getPlayerGamePiece(playerNames[0]).equals(first))
		{
			movePlayer(playerNames[0], newLocations[0]);
			movePlayer(playerNames[1], newLocations[1]);
			//array already sorted
			sortedPlayers = playerNames;
		}
		else
		{
			movePlayer(playerNames[1], newLocations[1]);
			movePlayer(playerNames[0], newLocations[0]);
			
			//"sorting"
			sortedPlayers[0] = playerNames[1];
			sortedPlayers[1] = playerNames[0];
		}
		
		return sortedPlayers;
	}
	
	public Location getPlayersLocation(String player)
	{
		return playerLocations.get(player);
	}
	
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		ArrayList<String> players = new ArrayList<>();
		
		for(String key: playerLocations.keySet())
		{
			if(playerLocations.get(key).equals(loc))
			{
				players.add(key);
			}
		}
		
		return players;
	}
	
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		ArrayList<GamePiece> pieces = new ArrayList<>();
		
		for(String key: playerLocations.keySet())
		{
			if(playerLocations.get(key).equals(loc))
			{
				pieces.add(getPlayerGamePiece(key));
			}
		} 
		
		return pieces;
	}
	
	public Set<String> getPlayers()
	{
		return playerPieces.keySet();
	}
	
	public Set<Location> getPlayerLocations()
	{
		return new HashSet<Location>(playerLocations.values());
	}
	
	public Set<GamePiece> getPlayerPieces()
	{
		return new HashSet<GamePiece>(playerPieces.values());
	}
}
