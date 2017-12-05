package oop_dome;

import java.util.ArrayList;

public class Database {
	private ArrayList<Item> listItem = new ArrayList<Item>();

	public void add(Item item) {
		listItem.add(item);
	}
	
	
	public void list() {
		for (Item item : listItem ) {
			item.print();
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Database db = new Database();
		db.add(new CD("abc", "abct", 4, 60 , "..."));
		db.add(new CD("def", "deft", 4, 60 , "..."));
		db.add(new DVD("xxx", "aaa", 60, "..."));
		db.add(new VideoGame("ddd", 10, true, "...", 4));
		db.list();
	}

}
