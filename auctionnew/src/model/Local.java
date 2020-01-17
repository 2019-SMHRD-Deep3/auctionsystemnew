package model;

public class Local {
	private int locnum;
	private String loccount;
	private String loccity;
	
	
	
	
	public Local(int locnum) {
		super();
		this.locnum = locnum;
	}
	public int getLocnum() {
		return locnum;
	}
	public void setLocnum(int locnum) {
		this.locnum = locnum;
	}
	public String getLoccount() {
		return loccount;
	}
	public void setLoccount(String loccount) {
		this.loccount = loccount;
	}
	public String getLoccity() {
		return loccity;
	}
	public void setLoccity(String loccity) {
		this.loccity = loccity;
	}
	
	
}
