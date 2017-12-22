package com.example.demo.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Contact implements Serializable{
	@Id @GeneratedValue
	private Long id;
	private String nom;
	private String prenom;
	@Temporal(TemporalType.DATE)
	private Date dateNaisance;
	private String email;
	private Long tel;
	private String photo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaisance() {
		return dateNaisance;
	}
	public void setDateNaisance(Date dateNaisance) {
		this.dateNaisance = dateNaisance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getTel() {
		return tel;
	}
	public void setTel(Long tel) {
		this.tel = tel;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Contact(String nom, String prenom, Date dateNaisance, String email, Long tel, String photo) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaisance = dateNaisance;
		this.email = email;
		this.tel = tel;
		this.photo = photo;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
