package Exception_Handling;

public class Book {

	private
	int bookNumber;
	String bookName;
	double price;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Book(int bookNumber, String bookName, double price) throws Exception{
		super();
		
		if(bookNumber <100 || bookNumber >1000) {
			throw new Exception("Value should be between 100 - 1000"); //only declaring Exception
		}
		
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.price = price;
	}


	/**
	 * @return the bookNumber
	 */
	public int getBookNumber() {
		return bookNumber;
	}


	/**
	 * @param bookNumber the bookNumber to set
	 */
	public void setBookNumber(int bookNumber) {
		
		if(bookNumber <100 || bookNumber >1000) { 
			
			//throw new RuntimeException("Book number should be 100- 1000");  // Only declaring Runtime  Exception
			
			try { //Handling Exception
			throw new Exception("Book number should be 100- 1000");
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("Book Number Error" + e.getMessage());
			}
		}
		this.bookNumber = bookNumber;
	}


	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}


	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.bookNumber;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(this == obj )
			return true;
		if(this == null)
			return false;
		if(getClass()!= obj.getClass())
			return false;

		Book bk = (Book)obj;
		return bk.bookNumber == this.bookNumber &&
				bk.price == this.price &&
				bk.bookName == this.bookName;
	}
	
	
	
	
}
