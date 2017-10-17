
public class throwsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throwsTest a = new throwsTest();
		try{
			a.divide(5,0);
		}catch(exception e){
			
		}
		
	}
	
	
	
	public void divide(int one, int two) throws Exception{
		if(two == 0){
			throw new Exception("ZERO");
		}else{
			System.out.println("兩數相除 結果:" + one/two);
		}
	}

}
