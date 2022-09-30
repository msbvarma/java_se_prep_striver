package Test;

public class CiscoTest {

	CiscoTest(){
		System.out.println("1");
	}
	public void CiscoTest() {
		System.out.println("2");
		
	}
	static {
		System.out.println("Block");
	}
	
	{
		System.out.println("NS Block");
	}
	
	public static void main(String... strings ) {
		CiscoTest test = new CiscoTest();
		test.CiscoTest();
		
	}
}
