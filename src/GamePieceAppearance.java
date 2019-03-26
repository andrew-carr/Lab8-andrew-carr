/**
 * This class aggregates the Color and Shape enums to group together the info about the
 * appearance of a game piece
 * @author andrew
 *
 */
public class GamePieceAppearance {

	private Color color;
	private Shape shape;
	
	/**
	 * Items from the Color and Shape enums are passed in as parameters
	 * @param color Color specified in Color enum
	 * @param shape Shape specified in Shape enum
	 */
	public GamePieceAppearance(Color color, Shape shape)
	{
		this.color = color;
		this.shape = shape;
	}
	
	/**
	 * Returns the color of the game piece
	 * @return Color
	 */
	public Color getColor()
	{
		return color;
	}
	
	/**
	 * Returns the shape of the game piece
	 * @return Shape
	 */
	public Shape getShape()
	{
		return shape;
	}
}
