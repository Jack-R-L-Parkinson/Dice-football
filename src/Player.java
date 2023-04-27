// class for players in the Dice Football game
public class Player {
	// attribute
	
	String position;
	boolean hasBall;
	int yellow;
	boolean red;
	int goals;
	String team;
	
	// constructor 1
	public Player ()
	{
		
	}
	// constructor 2
	public Player(String position,boolean hasBall, int yellow, boolean red, int goals) 
	{
		this.position = position;
		this.hasBall = hasBall;
		this.yellow = yellow;
		this.red = red;
		this.goals = goals;
	}
	
	// set methods
	public void setPosition(String posIN)
	{
		position = posIN;
	}
	public void setHasBall(boolean hasBallIN)
	{
		hasBall = hasBallIN;
	}
	public void setYellow(int yellowIN)
	{
		yellow = yellowIN;
	}
	public void setRed(boolean redIN)
	{
		red = redIN;
	}
	public void setGoals(int goalsIN)
	{
		goals = goalsIN;
	}
	public void setTeam(String teamIN)
	{
		team = teamIN;
	}
	
	// get methods
	public String getPosition()
	{
		return position;
	}
	public boolean getHasBall()
	{
		return hasBall;
	}
	public int getYellow()
	{
		return yellow;
	}
	public boolean getRed()
	{
		return red;
	}
	public int getGoals()
	{
		return goals;
	}
	public String getTeam()
	{
		return team;
	}
	
	// display details
	public void displayDetails()
	{
		System.out.println(getPosition()+ 
				"\n"+ getTeam()+ 
				"\n"+ getGoals()+
				"\n"+ getYellow()+
				"\n"+ getRed()+
				"\n"+ getHasBall());	
	}
	public String action() 
	{
		int rollNum;
		String output;
		DiceRoll r = new DiceRoll();
		rollNum = r.roll();
		if (rollNum > 3 ){
			output = "You rolled a number higher than 3";}
			else {
				output = "You rolled 3 or less";
			}
		return output;
	}

}

