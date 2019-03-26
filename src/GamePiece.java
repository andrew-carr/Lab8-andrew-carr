/**
 * This enum defines specific game pieces and returns information about them
 * @author andrew
 *
 */
public enum GamePiece {

	BLUE_BOOT(new GamePieceAppearance(Color.BLUE, Shape.BOOT), 5),
	BLUE_RACER(new GamePieceAppearance(Color.BLUE, Shape.RACECAR), 2),
	GREEN_BOOT(new GamePieceAppearance(Color.GREEN, Shape.BOOT), 8),
	MAGENTA_RACER(new GamePieceAppearance(Color.MAGENTA, Shape.RACECAR), 1),
	RED_RACER(new GamePieceAppearance(Color.RED, Shape.RACECAR), 0),
	RED_THIMBLE(new GamePieceAppearance(Color.RED, Shape.THIMBLE), 10),
	YELLOW_BOOT(new GamePieceAppearance(Color.YELLOW, Shape.BOOT), 7);
	
	private GamePieceAppearance appearance;
	private int priority;
	
	private GamePiece(GamePieceAppearance appearance, int priority)
	{
		this.appearance = appearance;
		this.priority = priority;
	}
	
	/**
	 * Gets the color of a GamePiece object
	 * @return This color
	 */
	public Color getColor()
	{
		return appearance.getColor();
	}
	
	/**
	 * Gets the shape of a GamePiece object
	 * @return This shape
	 */
	public Shape getShape() 
	{
		return appearance.getShape();
	}
	
	/**
	 * Compares the priority of two gamePieces and gets the piece with
	 * the lowest priority
	 * @param a
	 * @param b
	 * @return The GamePiece with the lowest priority
	 */
	public static GamePiece movesFirst(GamePiece a, GamePiece b)
	{
		if(a.priority < b.priority)
		{
			return a;
		}
		//priority will never be equal
		else
		{
			return b;
		}
	}
	
	/**
	 * Formats the information of a GamePiece object: player name, color, shape, and priority
	 */
	@Override
	public String toString()
	{
		return String.format("%s: a %s %s with priority %d", this.name(),
				appearance.getColor().name(), appearance.getShape().name(), priority);
	}
}
