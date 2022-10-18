package com.Practice;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MainClass {
	public static void main(String[] args) {
		Player p1 = new Player("Rohit", 53);
		Player p2 = new Player("Rahul", 46);
		Player p3 = new Player("SKY", 35);
		Player p4 = new Player("Virat", 50);
		Player p5 = new Player("DK", 29);
		Set<Player> set = new TreeSet<>((x, y) -> (x.score - y.score));
		Set<Player> set1 = new TreeSet<>((x, y) -> (y.score - x.score));
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set1.add(p1);
		set1.add(p2);
		set1.add(p3);
		set1.add(p4);
		set1.add(p5);
		System.out.println(set);
		System.out.println(set1);

//		List<Player> set2 = set2.stream().sorted((x, y) -> (x.score - y.score)).collect(Collectors.toList());
//		List<Player> set3= set3.stream().sorted((x, y) -> (y.score - x.score)).collect(Collectors.toList());
//		System.out.println(set2);
//		System.out.println(set3);
		Player player = set1.stream().max((x, y) -> (x.score - y.score)).get();
		System.out.println("max score is " + player);
	}
}
