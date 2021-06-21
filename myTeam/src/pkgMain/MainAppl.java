package pkgMain;

import pkgData.Player;

public class MainAppl {

	public static void main(String[] args) {
		Player p = new Player(1,"Dragovic","Defensive");
		System.out.println(" == " + " " + p);
		p = new Player(2,"Spieler 2", "Attack");
		p = new Player(3,"Alaba","Defense");
		p = new Player(4,"Kaladizic","Striker");
		p = new Player(11,"Arnautovic","Striker");
		
		
	}

}
