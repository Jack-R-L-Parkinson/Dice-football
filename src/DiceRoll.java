
public class DiceRoll {
	// attributes
	
	private int di;
	
	// methods
	
	public int roll()
	{
		di  = (int) (Math.random() * 6) + 1;
		return di;
	}
}
