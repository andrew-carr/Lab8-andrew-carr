import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Class defines the operations of a BoardGame and returns information about the players on the Board.
 * @author andrew
 *
 */
public class BoardGame {

	//maps defining associated relationships between players and their pieces
	//as well as players and their locations
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;
	
	/**
	 * Instantiates maps defining associated relationships between players and their pieces
	 * as well as players and their locations
	 */
	public BoardGame()
	{
		 playerPieces = new LinkedHashMap<>();
		 playerLocations = new LinkedHashMap<>();
	}
	
	/**
	 * Organizes player information by organizing it into hash maps. Only one game piece can be
	 * played on the board at any one time.
	 * @param playerName
	 * @param gamePiece
	 * @param initialLocation
	 * @return True if no other player is already playing the passed-in GamePiece parameter, false otherwise.
	 */
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
	
	/**
	 * Gets the game piece being played by a specified player
	 * @param playerName
	 * @return The GamePiece object being played
	 */
	public GamePiece getPlayerGamePiece(String playerName)
	{
		return playerPieces.get(playerName);
	}
	
	/**
	 * Gets the name player playing a specified GamePiece
	 * @param gamePiece
	 * @return The player's name as a String, null if no player is playing the GamePiece param
	 */
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
	
	/**
	 * Reassigns the Location key associated with the specified player.
	 * @param playerName
	 * @param newLocation
	 */
	public void movePlayer(String playerName, Location newLocation)
	{
		playerLocations.put(playerName, newLocation);
	}
	
	/**
	 * Compares the priority of two given players and moves them piece by piece to
	 * a new location in the order of lowest priority
	 * @param playerNames
	 * @param newLocations
	 * @return String array of player names in priority-sorted order
	 */
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
	
	/**
	 * Gets the Location of a specified player
	 * @param player
	 * @return this Location object
	 */
	public Location getPlayersLocation(String player)
	{
		return playerLocations.get(player);
	}
	
	/**
	 * Gets the players at the specified Location
	 * @param loc
	 * @return ArrayList<String> of player names in this location
	 */
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		ArrayList<String> players = new ArrayList<>();
		
		for(String key: playerLocations.keySet())
		{
			//if players are in this location, add player to returned ArrayList
			if(playerLocations.get(key).equals(loc))
			{
				players.add(key);
			}
		}
		
		return players;
	}
	
	/**
	 * Gets the GamePieces at the specified Location
	 * @param loc
	 * @return ArrayList<GamePiece> of these pieces
	 */
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		ArrayList<GamePiece> pieces = new ArrayList<>();
		
		for(String key: playerLocations.keySet())
		{
			//if players are in this location, add their associateGamePiece to
			//returned ArrayList
			if(playerLocations.get(key).equals(loc))
			{
				pieces.add(getPlayerGamePiece(key));
			}
		} 
		
		return pieces;
	}
	
	/**
	 * Gets all the player names
	 * @return the Set<String> of the names
	 */
	public Set<String> getPlayers()
	{
		return playerPieces.keySet();
	}
	
	/**
	 * Gets all the player Locations
	 * @return the HashSet<Location> of the Locations
	 */
	public Set<Location> getPlayerLocations()
	{
		return new HashSet<Location>(playerLocations.values());
	}
	
	/**
	 * Gets all the GamePieces
	 * @return the HashSet<GamePiece> of the GamePieces
	 */
	public Set<GamePiece> getPlayerPieces()
	{
		return new HashSet<GamePiece>(playerPieces.values());
	}
}
