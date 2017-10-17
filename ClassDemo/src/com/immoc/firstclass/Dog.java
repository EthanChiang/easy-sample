package com.immoc.firstclass;

public class Dog extends Animal {
	private int age = 10;
	public String a1 = "newstring";
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public void eat(){
		System.out.println("狗" + "吃東西");
		System.out.println(getAge());
	}
	public Dog(){
		System.out.println("constroctor Dog");
	}
	public void watchDog(){
		System.out.println("狗有看門能力");
	}

}
