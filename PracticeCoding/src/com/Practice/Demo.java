package com.Practice;

import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		Player p1 = new Player("Rohit", 53);
		Player p2 = new Player("Rahul", 46);
		Player p3 = new Player("SKY", 35);
		Player p4 = new Player("Virat", 50);
		Player p5 = new Player("DK", 29);	
		TreeSet<Player> treeSet=new TreeSet<>();
		treeSet.add(p1);
		treeSet.add(p2);
		treeSet.add(p3);
		treeSet.add(p4);
		treeSet.add(p5);
		
		
	}

}
