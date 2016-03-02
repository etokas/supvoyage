package com.supinfo.suptrip.models;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="trip")
public class Trip {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idTrip;
	
	@Column
	private Date date;
	@Column
	private String description;
	@Column
	private float price;
	

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	public long getIdTrip() {
		return idTrip;
	}
	public void setIdTrip(long idTrip) {
		this.idTrip = idTrip;
	}
		
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}