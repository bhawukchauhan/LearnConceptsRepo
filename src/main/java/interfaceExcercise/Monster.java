package interfaceExcercise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Monster implements ISaveable{
	private String name;
	private int hitPoints;
	private int strength;
	
	public Monster(String name, int hitPoints, int strength) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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
		List<String> listStr = new LinkedList<String>();
		listStr.add(name);
		listStr.add(String.valueOf(hitPoints));
		listStr.add(String.valueOf(strength));
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
		return "Monster [name=" + name + ", hitPoints=" + hitPoints + ", strength=" + strength + "]";
	}



}
