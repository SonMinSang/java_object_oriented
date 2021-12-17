package ch16.newgamelevel;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player = new Player();
		
		player.play(1);
		
		PlayerLevel advancedLevel = new AdvancedLevel();
		player.upgrageLevel(advancedLevel);
		player.play(2);
		
		PlayerLevel superLevel = new SuperLevel();
		player.upgrageLevel(superLevel);
		player.play(3);
	}

}
