package com.imooc;
import java.util.*;

public class Demo1 {
	public static void main(String[] args) {
		   int[] scores = {89 , -23 , 64 , 91 , 119 , 52 , 73 };
	        System.out.print("前三名:");
	        Demo1 hello = new Demo1();
	        hello.showTop3(scores);
	    }
	    
	    //定义方法完成成绩排序并输出前三名的功能
	    public void showTop3(int[] scores){
	        Arrays.sort(scores);
	        int count =0;
	        for(int i=(scores.length-1);i>=0;i--){
	            if( scores[i] <0 || scores[i] > 100){
	                continue;
	            }
	            count++;
	            if(count > 3){
	                break;
	            }
	            System.out.println(scores[i]);
	        }
	    }
}
