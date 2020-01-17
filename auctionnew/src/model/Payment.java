package model;

public class Payment {
	private int paynum;
	private String cardnum;
	private String cardown;
	private String expire;
	private String id;
	private int resnum;
	private String passport;
	
	
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	
	public Payment(String cardnum, String cardown, String expire, String passport) {
		this.cardnum = cardnum;
		this.cardown = cardown;
		this.expire = expire;
		this.passport = passport;
	}
	public Payment(int paynum, String cardnum, String cardown, String expire, String id, int resnum,String passport) {
		this.paynum = paynum;
		this.cardnum = cardnum;
		this.cardown = cardown;
		this.expire = expire;
		this.id = id;
		this.resnum = resnum;
		this.passport = passport;
	}
	public int getPaynum() {
		return paynum;
	}
	public void setPaynum(int paynum) {
		this.paynum = paynum;
	}
	public String getCardnum() {
		return cardnum;
	}
	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}
	public String getCardown() {
		return cardown;
	}
	public void setCardown(String cardown) {
		this.cardown = cardown;
	}
	public String getExpire() {
		return expire;
	}
	public void setExpire(String expire) {
		this.expire = expire;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getResnum() {
		return resnum;
	}
	public void setResnum(int resnum) {
		this.resnum = resnum;
	}
	
	
	
}
