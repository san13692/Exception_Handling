package Exception_Handling;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {

		Book bk = new Book(11, "head first " , 300.00);
		}
		
		catch(Exception e) { 
			System.out.println("Exception cause " + e.getMessage());
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Inside finally block ");
		}
		
		Book bk2 = new Book();
		bk2.setBookName("Effective java");
		bk2.setBookNumber(12);
		bk2.setPrice(100.00);
		
	}

}
