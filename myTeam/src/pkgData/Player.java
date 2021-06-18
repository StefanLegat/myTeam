package pkgData;

public class Player {
	
	private int number;
	private String name,pos;
	
	
	public Player(int number, String name, String pos) {
		super();
		this.number = number;
		this.name = name;
		this.pos = pos;
	}
	
	
	@Override
	public String toString() {
		return "Player [number=" + number + ", name=" + name + ", pos=" + pos + "]";
	}
	
	
	

}
