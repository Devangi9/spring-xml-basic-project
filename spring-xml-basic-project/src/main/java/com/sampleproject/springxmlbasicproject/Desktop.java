package com.sampleproject.springxmlbasicproject;

//Desktop- POJO class Implementation of Computer interface with getters setters and constructor  
public class Desktop implements Computer{
	
	String ramSize;
	
	//Here we are creating objects of other classes inside this class to practice dependency injection.
	Processor processor;
	
	
	public Desktop(String ramSize) {
		super();
		this.ramSize = ramSize;
		
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
		System.out.println( "Desktop [ramSize=" + ramSize + "," + processor+  "]");
	}
	

}
