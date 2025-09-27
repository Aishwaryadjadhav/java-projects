package com.projects.day14;

public class Item {
	
	 String name;
	 double price;

	    Item(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    @Override
	    public String toString() {
	        return name + " - Rs." + price;
	    }

}
