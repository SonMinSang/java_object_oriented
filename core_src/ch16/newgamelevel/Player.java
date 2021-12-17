package ch16.newgamelevel;

public class Player {
	
	PlayerLevel level;
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	public PlayerLevel getLevel() {
		return level;
	}
	public void upgrageLevel(PlayerLevel level)
	{
		this.level = level;
		level.showLevelMessage();
	}
	public void play(int count)
	{
		level.go(count);
	}
}
