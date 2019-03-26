/**
 * This enum lists colors with different rgb values
 * @author andrew
 *
 */
public enum Color {
	
	RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
	YELLOW(255, 255, 0), CYAN(0, 255, 255), MAGENTA(255, 0, 255);
	
	private int r;
	private int g;
	private int b;
	
	private Color(int r, int g, int b)
	{
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	/**
	 * Returns integer red value
	 * @return int
	 */
	public int getR()
	{
		return r;
	}
	
	/**
	 * Returns integer green value
	 * @return int
	 */
	public int getG()
	{
		return g;
	}
	
	/**
	 * Returns integer blue value
	 * @return int
	 */
	public int getB()
	{
		return b;
	}
}
