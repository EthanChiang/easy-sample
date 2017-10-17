package com.immoc.firstclass;

public class Animal {
	
	private int age = 3;
	private String name;
	
	public void eat(){
		System.out.println(name + "吃東西");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal(){
		System.out.println("constructor Animal");
		
	}
	public Animal(int age){
		this.age = age;
	}
	
}
