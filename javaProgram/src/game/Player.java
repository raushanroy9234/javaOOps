package game;

public class Player {
	String playerName = "john";
	public static void main(String [] args)
	{
		Game g = new Game();
		Weapon w = g.pressButton();
		w.use();
	}

}
