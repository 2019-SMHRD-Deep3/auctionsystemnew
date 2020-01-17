package model;

public class Product {
	private int proid ;
	private String proname;
	private int proprice;
	private int procount;
	private int prolocal;
	private int procate;
	private int prosold;
	
	
	public Product(int proid) {
		super();
		this.proid = proid;
	}
	public Product(int proid, String proname) {
		super();
		this.proid = proid;
		this.proname = proname;
	}
	public Product(int proid, String proname, int proprice) {
		super();
		this.proid = proid;
		this.proname = proname;
		this.proprice = proprice;
	}
	public Product(int proid, String proname, int proprice, int procount) {
		super();
		this.proid = proid;
		this.proname = proname;
		this.proprice = proprice;
		this.procount = procount;
	}
	public Product(int proid, String proname, int proprice, int procount, int prolocal) {
		super();
		this.proid = proid;
		this.proname = proname;
		this.proprice = proprice;
		this.procount = procount;
		this.prolocal = prolocal;
	}
	public Product(int proid, String proname, int proprice, int procount, int prolocal, int procate) {
		super();
		this.proid = proid;
		this.proname = proname;
		this.proprice = proprice;
		this.procount = procount;
		this.prolocal = prolocal;
		this.procate = procate;
	}
	public Product(int proid, String proname, int proprice, int procount, int prolocal, int procate, int prosold) {
		super();
		this.proid = proid;
		this.proname = proname;
		this.proprice = proprice;
		this.procount = procount;
		this.prolocal = prolocal;
		this.procate = procate;
		this.prosold = prosold;
	}
	public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public int getProprice() {
		return proprice;
	}
	public void setProprice(int proprice) {
		this.proprice = proprice;
	}
	public int getProcount() {
		return procount;
	}
	public void setProcount(int procount) {
		this.procount = procount;
	}
	public int getProlocal() {
		return prolocal;
	}
	public void setProlocal(int prolocal) {
		this.prolocal = prolocal;
	}
	public int getProcate() {
		return procate;
	}
	public void setProcate(int procate) {
		this.procate = procate;
	}
	public int getProsold() {
		return prosold;
	}
	public void setProsold(int prosold) {
		this.prosold = prosold;
	}
	
}
