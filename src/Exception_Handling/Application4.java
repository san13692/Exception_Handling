package Exception_Handling;

public class Application4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			
			Book bk1 = new Book(101 , "Java" , 345.00);
			Book bk2 = new Book(101 , "Java" , 345.00);
			System.out.println(bk1.equals(bk2));
			//Overridden .equals() method in Book class
			
			String st = new String("addsd");
			System.out.println(bk1.equals(st));

		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
