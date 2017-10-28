package model;

public class MonsterAttack {
	private String monsterName;
	private String attackLocation;
	private double damages;
	public MonsterAttack(String monsterName, String attackLocation, double damages) {
		super();
		this.monsterName = monsterName;
		this.attackLocation = attackLocation;
		this.damages = damages;
	}
	
	public String toString(){
		return "Attack by " + monsterName + " on " + attackLocation + " caused damages of $" + damages + "million.";
		
				
	}
} 