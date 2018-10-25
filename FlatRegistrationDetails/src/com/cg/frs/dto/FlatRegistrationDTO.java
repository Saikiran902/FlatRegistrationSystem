package com.cg.frs.dto;

public class FlatRegistrationDTO {
   
   private String flattype;
   private int flatarea;
   private double rent;
   private double deposit;
   private int ownid;
   private int id;

public int getOwnid() {
	return ownid;
}
public void setOwnid(int ownid) {
	this.ownid = ownid;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFlattype() {
	return flattype;
}
public void setFlattype(String flattype) {
	this.flattype = flattype;
}
public int getFlatarea() {
	return flatarea;
}
public void setFlatarea(int flatarea) {
	this.flatarea = flatarea;
}
public double getRent() {
	return rent;
}
public void setRent(double rent) {
	this.rent = rent;
}
public double getDeposit() {
	return deposit;
}
public void setDeposit(double deposit) {
	this.deposit = deposit;
}

@Override
public String toString() {
	return "FlatRegistrationDTO [flattype=" + flattype + ", flatarea="
			+ flatarea + ", rent=" + rent + ", deposit=" + deposit + ", ownid="
			+ ownid + ", id=" + id + "]";
}
public FlatRegistrationDTO(int id, int ownid, String flattype, int flatarea,
		double rent, double deposit) {
	super();
	
	this.flattype = flattype;
	this.flatarea = flatarea;
	this.rent = rent;
	this.deposit = deposit;
	this.id = id;
	this.ownid = ownid;
}
   public FlatRegistrationDTO(){
	   
   }
   
}

