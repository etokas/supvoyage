package com.supinfo.suptrip.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="user")
public class Users implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String firstName;
	private String lastName;
	private String emailAdress;
	private String password;
	private String idbooster;
	private String campus;
	
	/**
	 * @return the campus
	 */
	public String getCampus() {
		return campus;
	}
	/**
	 * @param campus the campus to set
	 */
	public void setCampus(String campus) {
		this.campus = campus;
	}
	/**
	 * @return the idbooster
	 */
	public String getIdbooster() {
		return idbooster;
	}
	/**
	 * @param idbooster the idbooster to set
	 */
	public void setIdbooster(String idbooster) {
		this.idbooster = idbooster;
	}
	@ManyToOne
	@JoinColumn(name="id_campus")
	private Campus idCampus;
	
	@ManyToMany
	@JoinTable(name="user_trip")
	private List<Trip> trip;
	
	
	public Campus getIdCampus() {
		return idCampus;
	}
	public void setIdCampus(Campus idCampus) {
		this.idCampus = idCampus;
	}
	
	public List<Trip> getTrip() {
		return trip;
	}
	public void setTrip(List<Trip> trip) {
		this.trip = trip;
	}
	public long getId() {
		return id;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailAdress() {
		return emailAdress;
	}
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	public String getPassword() {
		return password;
	}
	public Campus getIdcampus() {
		return idCampus;
	}
	public void setIdcampus(Campus idcampus) {
		this.idCampus = idcampus;
	}
	
	
	
}

