package model;

public class Payment {

	private int paynum;
	private int cardnum;
	private String cardown;
	private String expire;
	private String id;
	private int resnum;
	private String passport;
	private String type;
	
	public Payment(int cardnum, String cardown, String expire, String passport) {
		this(cardnum, cardown, expire, passport, null, 0, 0);
	}
	
	public Payment(int cardnum, String cardown, String expire, String passport, String id, int resnum,int paynum) {
		this.paynum = paynum;
		this.cardnum = cardnum;
		this.cardown = cardown;
		this.expire = expire;
		this.id = id;
		this.resnum = resnum;
		this.passport = passport;
		this.type = "AIR";
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public int getCardnum() {
		return cardnum;
	}

	public void setCardnum(int cardnum) {
		this.cardnum = cardnum;
	}
	
	public String getPassport() {
		return passport;
	}
	
	public void setPassport(String passport) {
		this.passport = passport;
	}
	
	public int getPaynum() {
		return paynum;
	}
	
	public void setPaynum(int paynum) {
		this.paynum = paynum;
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
