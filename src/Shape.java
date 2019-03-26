/**
 * This enum lists different shapes
 * @author andrew
 *
 */
public enum Shape {

	THIMBLE, BOOT, RACECAR;
	
	/**
	 * Returns the name of the shape in lowercase
	 */
	@Override
	public String toString()
	{
		return this.name().toLowerCase();
	}
}
