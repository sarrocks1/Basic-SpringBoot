package com.project.EmptySpace.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Property {
	

	private int user_id;
	private int width;
	private int area;
	private int length;
	private int pincode;
	@Override
	public String toString() {
		return "Property [user_id=" + user_id + ", width=" + width + ", area=" + area + ", length=" + length
				+ ", pincode=" + pincode + ", address=" + address + ", price=" + price + ", ph_num=" + ph_num
				+ ", status=" + status + ", property_id=" + property_id + "]";
	}
	private String address;
	private int price;
	private int ph_num;
	private int status;
	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Property(int user_id, int width, int area, int length, int pincode, String address, int price, int ph_num,
			int status, int property_id) {
		super();
		this.user_id = user_id;
		this.width = width;
		this.area = area;
		this.length = length;
		this.pincode = pincode;
		this.address = address;
		this.price = price;
		this.ph_num = ph_num;
		this.status = status;
		this.property_id = property_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPh_num() {
		return ph_num;
	}
	public void setPh_num(int ph_num) {
		this.ph_num = ph_num;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getProperty_id() {
		return property_id;
	}
	public void setProperty_id(int property_id) {
		this.property_id = property_id;
	}
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int property_id;
}
