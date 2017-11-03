package contract.wyt;

public class Test {

	public static void main(String[] args) {
		new Isay() {
			
			@Override
			public void say() {
				System.out.println("saysaysay");
				System.out.println("nonono");
			}
			
			public void say2() {
				System.out.println("yyyyy");
			}
		}.say2();
		System.out.println("11111111");
		
	}
	
}
