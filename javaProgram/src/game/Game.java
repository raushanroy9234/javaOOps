package game;

import java.util.Scanner;

public class Game {
	
	String gameName =  "PUBGG";
	Weapon pressButton()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter he score :: ");
		int score = sc.nextInt();
		if(score < 400)
		{
			System.out.println("you got the knife");
			Knife k = new Knife();
			return k;
		}
		else if(score >= 400 && score < 800)
		{
			System.out.println("you got gun");
			Gun g = new Gun();
			return g;
		}
		else
		{
			System.out.println("you got the bomb");
			Bomb b = new Bomb();
			return b;
		}
	}

}
