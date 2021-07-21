package interfaceExcercise;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
	
	private String name;
	private String weapon;
	private int hitPoints;
	private int strength;
	
	
	public Player(String name, int hitPoints, int strength) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.weapon = "Sword";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	@Override
	public List<String> write() {
		List<String> listStr = new ArrayList<String>();
		listStr.add(name);
		listStr.add(String.valueOf(hitPoints));
		listStr.add(String.valueOf(strength));
		listStr.add(weapon);
		return listStr;
	}


	@Override
	public void read(List<String> var) {
		if (var != null && var.size() > 0)
			for (String s : var)
				System.out.println(s);
	}

	@Override
	public String toString() {
		return "Player {name= '" + name +"', hitPoints=" + hitPoints + ", strength=" + strength +  ", weapon=" + weapon +  "'}";
	}

}
