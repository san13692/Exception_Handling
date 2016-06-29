package Exception_Handling;

public class Application2 {

	public static void main(String[] args) { 
		
		int n =23;
		
		try{
			 int nu= Integer.parseInt(args[0]);
			 
			 System.out.println(n/nu);
		}
		
		/* either use seperate exception or use new java feature by placing all exceptions by pipelining
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Divide by zero");
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Pass command line argument");
		}
		*/
		
		catch (ArithmeticException  | ArrayIndexOutOfBoundsException e) {
			System.out.println("Pass command line argument");
			// TODO: handle exception
		}
	}
}
