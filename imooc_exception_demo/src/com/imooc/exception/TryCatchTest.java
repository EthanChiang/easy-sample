package com.imooc.exception;

public class TryCatchTest {

	public static void main(String[] args) {
		TryCatchTest a = new TryCatchTest();
		System.out.println(a.test());
	}

	public int test(){
		int result = 100;
		int divider = 10;
		try{
			while(divider > -1){
				divider--;
				result = result + 100 / divider; 
			}
			return result;
		}catch(Exception e){
			e.printStackTrace();
		    System.out.println("出異常了");
		    return result = 999;
		}finally{
			System.out.println("finally:");
			System.out.println(result);
		}
	}
}
