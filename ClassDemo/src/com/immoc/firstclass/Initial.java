package com.immoc.firstclass;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal dog1 = new Animal();
//		Animal dog2 = new Dog();
//		Dog dog3 = new Dog();
//		dog1.eat();
//		dog2.eat();
//		dog3.watchDog();
		Dog dog = new Dog();
		Animal animal = dog;
		Dog dog2 = (Dog) animal;
		if(animal instanceof Cat){
			Cat cat = (Cat)animal;
		}else{
			System.out.println("不能轉換");
		}
	}

}
