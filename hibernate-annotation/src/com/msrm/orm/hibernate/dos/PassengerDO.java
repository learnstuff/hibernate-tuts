package com.msrm.orm.hibernate.dos;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "passenger")
public class PassengerDO {

	@Id
	@Column(name = "id")
	private int id;

	private String name;

	private Date dob;

	private String mail;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "PassengerDO [id=" + id + ", name=" + name + ", dob=" + dob + ", mail=" + mail + "]";
	}

}
