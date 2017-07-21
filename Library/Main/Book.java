package Main;

public class Book extends Item {

	String bAuthor;
	String bPublication;
	boolean bHardBack;

	public Book(int iId, String iName, String iCode, int iIssueNum, boolean iCheckedOut, String bAuthor,
			String bPublication, boolean bHardBack) {

		super(iId, iName, iCode, iIssueNum, iCheckedOut);
		this.bAuthor = bAuthor;
		this.bPublication = bPublication;
		this.bHardBack = bHardBack;

		// TODO Auto-generated constructor stub
	}
	
	
	public String toString()
	{
		String s =  super.toString() + " Author = " + this.bAuthor + " Publication = " + this.bPublication + " Hardback = " + this.bHardBack;
		return s;
	}
	
	

	public String getbAuthor() {
		return bAuthor;
	}

	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}

	public String getbPublication() {
		return bPublication;
	}

	public void setbPublication(String bPublication) {
		this.bPublication = bPublication;
	}

	public boolean getisbHardBack() {
		return bHardBack;
	}

	public void setbHardBack(boolean bHardBack) {
		this.bHardBack = bHardBack;
	}

	
	
	
	
}
