package practiceJava;

public class Addition {
	
	int a ;
	int b ;
	
	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.a = 2;
		obj.b = 4;
		int c = obj.a + obj.b;
		System.out.println("sum: " + c);
		
	}

}
