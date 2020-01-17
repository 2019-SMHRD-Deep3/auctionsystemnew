package model;

public class Payment {
	private int paynum;
	private int cardnum;
	private String cardown;
	private String expire;
	private String id;
	private int resnum;
	
	
	public Payment(int paynum, int cardnum, String cardown, String expire, String id, int resnum) {
		this.paynum = paynum;
		this.cardnum = cardnum;
		this.cardown = cardown;
		this.expire = expire;
		this.id = id;
		this.resnum = resnum;
	}
	public int getPaynum() {
		return paynum;
	}
	public void setPaynum(int paynum) {
		this.paynum = paynum;
	}
	public int getCardnum() {
		return cardnum;
	}
	public void setCardnum(int cardnum) {
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
