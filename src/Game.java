
public class Game {
	
	// attributes
	
	private int time = 0;
	private int homeGoals = 0;
	private int awayGoals = 0;
	private int half = 1;
	private String result;
	private String textOn;
	private boolean active;
	
	// methods
	// get methods
	public int getTime()
	{
		return time;
	}
	public int getHomeGoals()
	{
		return homeGoals;
	}
	public int getAwayGoals()
	{
		return awayGoals;
	}
	public int getHalf()
	{
		return half;
	}
	public String getResult()
	{
		return result;
	}
	public String getTextOn()
	{
		return textOn;
	}
	public boolean getActive()
	{
		return active;
	}
	
	// set methods
	public void setTime(int timeIN)
	{
		time = timeIN;
	}
	public void setHomeGoals(int homeGoalsIN)
	{
		homeGoals = homeGoalsIN;
	}
	public void setAwayGoals(int awayGoalsIN)
	{
		awayGoals = awayGoalsIN;
	}
	public void setHalf(int halfIN)
	{
		half = halfIN;
	}
	public void setResult(String resultIN)
	{
		result = resultIN;
	}
	public void setTextOn(String textOnIN)
	{
		textOn = textOnIN;
	}
	public void setActive(boolean activeIN)
	{
		active = activeIN;
	}
	// in game methods
	
	public void timer()
		
	{
		if (time < 45)
		{
			time += 5;
		}
		else if (time == 45 && half == 1)
		{
			setTextOn("It's half time, the second half will kick off now.");
			setHalf(2);
			System.out.println(textOn);
		}
		else if ( time >= 45 && time < 90)
		{
			time += 5;
		}
		else 
		{
			setTextOn("Full time.");
			System.out.println(textOn);
			if (homeGoals > awayGoals)
			{
				setTextOn("The home team has won");
			}
			else if (homeGoals < awayGoals)
			{
				setTextOn("The away team has won");
			}
			else
			{
				setTextOn("The away team has won");
			}
			System.out.println(textOn);
			setActive(false);
		}
	}
	public void startGame()
	{
		setActive(true);
	}
}
