package Main;

public class Magazine extends Item {
	
	String mCategory;

	public Magazine(int iId, String iName, String iCode, int iIssueNum, boolean iCheckedOut, String mCategory) {
		super(iId, iName, iCode, iIssueNum, iCheckedOut);
		this.mCategory = mCategory;
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{
		String s =  super.toString() + " Category = " + this.mCategory;
		return s;
	}

	public String getmCategory() {
		return mCategory;
	}

	public void setmCategory(String mCategory) {
		this.mCategory = mCategory;
	}
	
	
	
	

}
