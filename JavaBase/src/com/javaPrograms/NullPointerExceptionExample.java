public class NullPointerExceptionExample {

	// Reference variable defined and initialized
	public static NullPointerExceptionExample np1= new NullPointerExceptionExample();
	
	// Reference Variable only initialized
	public static NullPointerExceptionExample np2 = new NullPointerExceptionExample();
			
			
	public void print()
	{
		System.out.println("Print message \n");
	}
	
	public static void main(String[] args) {
		
		np1.print();
		np2.print();
		
	}
}