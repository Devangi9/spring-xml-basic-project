package com.sampleproject.springxmlbasicproject;

//Laptop- POJO class Implementation of Computer interface with getters setters and constructor

public class Laptop implements Computer{
	
	String ramSize;
	Processor processor;
	
	
	public Laptop(String ramSize, Processor processor) {
		super();
		this.ramSize = ramSize;
		this.processor = processor;
	}
	
	public String getRamSize() {
		return ramSize;
	}
	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}
	public Processor getProcessor() {
		return processor;
	}
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}


	public void calculateEfficiency() {
		System.out.println( "Laptop [ramSize=" + ramSize + ", processor=" + processor + "]");
	}
	
	

}
