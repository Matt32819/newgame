public class Player{
	private int Health;
	private int PDamage;
	private int pLevel;
	private int Mana;
	private int Gold;
	private double pAttkS;
	
	public Player(){
		Health = 650;
		PDamage = 46;
		pLevel = 1;
		Mana = 400;
		Gold = 600;
		pAttkS = 1.3;
	}
	public Player(int a, int b, int c, int d, int e, int f){
		Health = a;
		PDamage = b;
		pLevel = c;
		Mana = d;
		Gold = e;
		pAttkS = f;
		
	}
}
