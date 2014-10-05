package org.tmsoft.movie.entity;

import javax.persistence.*;

/**
 * Created 05.10.14
 *
 * @author Tomas Marianek
 */

@Entity
@Table(name = "PERSON", schema = "MOVIE", catalog = "MOVIE-DEV")
public class PersonEntity {
	private long id;
	private String name;
	private String surname;
	private String mobil;
	private String phone;
	private String email;
	private String street;
	private String streetNum;
	private String city;
	private String country;
	private Long insUsers;
	private Long modifUsers;
	private short deleted;

	@Id
	@Column(name = "ID")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Basic
	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name = "SURNAME")
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Basic
	@Column(name = "MOBIL")
	public String getMobil() {
		return mobil;
	}

	public void setMobil(String mobil) {
		this.mobil = mobil;
	}

	@Basic
	@Column(name = "PHONE")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Basic
	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Basic
	@Column(name = "STREET")
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Basic
	@Column(name = "STREET_NUM")
	public String getStreetNum() {
		return streetNum;
	}

	public void setStreetNum(String streetNum) {
		this.streetNum = streetNum;
	}

	@Basic
	@Column(name = "CITY")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Basic
	@Column(name = "COUNTRY")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Basic
	@Column(name = "INS_USERS")
	public Long getInsUsers() {
		return insUsers;
	}

	public void setInsUsers(Long insUsers) {
		this.insUsers = insUsers;
	}

	@Basic
	@Column(name = "MODIF_USERS")
	public Long getModifUsers() {
		return modifUsers;
	}

	public void setModifUsers(Long modifUsers) {
		this.modifUsers = modifUsers;
	}

	@Basic
	@Column(name = "DELETED")
	public short getDeleted() {
		return deleted;
	}

	public void setDeleted(short deleted) {
		this.deleted = deleted;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		PersonEntity that = (PersonEntity) o;

		if (deleted != that.deleted) return false;
		if (id != that.id) return false;
		if (city != null ? !city.equals(that.city) : that.city != null) return false;
		if (country != null ? !country.equals(that.country) : that.country != null) return false;
		if (email != null ? !email.equals(that.email) : that.email != null) return false;
		if (insUsers != null ? !insUsers.equals(that.insUsers) : that.insUsers != null) return false;
		if (mobil != null ? !mobil.equals(that.mobil) : that.mobil != null) return false;
		if (modifUsers != null ? !modifUsers.equals(that.modifUsers) : that.modifUsers != null) return false;
		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
		if (street != null ? !street.equals(that.street) : that.street != null) return false;
		if (streetNum != null ? !streetNum.equals(that.streetNum) : that.streetNum != null) return false;
		if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (id ^ (id >>> 32));
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (surname != null ? surname.hashCode() : 0);
		result = 31 * result + (mobil != null ? mobil.hashCode() : 0);
		result = 31 * result + (phone != null ? phone.hashCode() : 0);
		result = 31 * result + (email != null ? email.hashCode() : 0);
		result = 31 * result + (street != null ? street.hashCode() : 0);
		result = 31 * result + (streetNum != null ? streetNum.hashCode() : 0);
		result = 31 * result + (city != null ? city.hashCode() : 0);
		result = 31 * result + (country != null ? country.hashCode() : 0);
		result = 31 * result + (insUsers != null ? insUsers.hashCode() : 0);
		result = 31 * result + (modifUsers != null ? modifUsers.hashCode() : 0);
		result = 31 * result + (int) deleted;
		return result;
	}
}
