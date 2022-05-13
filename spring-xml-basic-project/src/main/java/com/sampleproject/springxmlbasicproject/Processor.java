package com.sampleproject.springxmlbasicproject;

public class Processor {

	String name;
	int noOfCOre;
	
	

	public Processor(String name) {
		super();
		this.name = name;
	}

	public int getNoOfCOre() {
		return noOfCOre;
	}

	public void setNoOfCOre(int noOfCOre) {
		this.noOfCOre = noOfCOre;
	}

	@Override
	public String toString() {
		return "Processor [name=" + name + ", noOfCOre=" + noOfCOre + "]";
	}
	
	
	
}
