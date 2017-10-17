package com.imooc;

public class Initialstatic {
    String name = "幕刻網";
    static String nameStatic = "幕刻網(靜態)";
    
    public static void print(){
    //	System.out.println(name);
    	System.out.println(nameStatic);
    }
    
    public static void main(String[] args){
    	Initialstatic demo = new Initialstatic();
    	print();
    }
}
