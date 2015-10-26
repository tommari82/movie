package org.tmsoft.movie.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created 05.10.14
 *
 * @author Tomas Marianek
 */

@Entity
@Table(name = "PERSON", schema = "MOVIE")
public class PersonEntity implements Serializable {
	private static final long serialVersionUID = -523951858540020932L;
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
	private List<BorrowEntity> borrowEntityList;

	public void setDeleted(Short deleted) {
		this.deleted = deleted;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERSONSQ")
	@SequenceGenerator(name = "PERSONSQ", sequenceName = "movie.sq_person", initialValue = 1, schema = "movie", allocationSize = 1)

	@Column(name = "ID", nullable = false, insertable = true, updatable = true)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Basic
	@Column(name = "NAME", nullable = true, insertable = true, updatable = true, length = 255)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name = "SURNAME", nullable = true, insertable = true, updatable = true, length = 255)
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Basic
	@Column(name = "MOBIL", nullable = true, insertable = true, updatable = true, length = 255)
	public String getMobil() {
		return mobil;
	}

	public void setMobil(String mobil) {
		this.mobil = mobil;
	}

	@Basic
	@Column(name = "PHONE", nullable = true, insertable = true, updatable = true, length = 255)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Basic
	@Column(name = "EMAIL", nullable = true, insertable = true, updatable = true, length = 255)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Basic
	@Column(name = "STREET", nullable = true, insertable = true, updatable = true, length = 255)
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Basic
	@Column(name = "STREET_NUM", nullable = true, insertable = true, updatable = true, length = 255)
	public String getStreetNum() {
		return streetNum;
	}

	public void setStreetNum(String streetNum) {
		this.streetNum = streetNum;
	}

	@Basic
	@Column(name = "CITY", nullable = true, insertable = true, updatable = true, length = 255)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Basic
	@Column(name = "COUNTRY", nullable = true, insertable = true, updatable = true, length = 255)
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Basic
	@Column(name = "INS_USERS", nullable = true, insertable = true, updatable = true)
	public Long getInsUsers() {
		return insUsers;
	}

	public void setInsUsers(Long insUsers) {
		this.insUsers = insUsers;
	}

	@Basic
	@Column(name = "MODIF_USERS", nullable = true, insertable = true, updatable = true)
	public Long getModifUsers() {
		return modifUsers;
	}

	public void setModifUsers(Long modifUsers) {
		this.modifUsers = modifUsers;
	}

	@Basic
	@Column(name = "DELETED", nullable = true, insertable = true, updatable = true)
	public short getDeleted() {
		return deleted;
	}

	public void setDeleted(short deleted) {
		this.deleted = deleted;
	}

	@OneToMany(mappedBy = "personEntity")
	public List<BorrowEntity> getBorrowEntityList() {
		return borrowEntityList;
	}

	public void setBorrowEntityList(List<BorrowEntity> borrowEntityList) {
		this.borrowEntityList = borrowEntityList;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj.getClass() != getClass()) {
			return false;
		}
		PersonEntity rhs = (PersonEntity) obj;
		return new EqualsBuilder()
				.append(this.id, rhs.id)
				.append(this.name, rhs.name)
				.append(this.surname, rhs.surname)
				.append(this.mobil, rhs.mobil)
				.append(this.phone, rhs.phone)
				.append(this.email, rhs.email)
				.append(this.street, rhs.street)
				.append(this.streetNum, rhs.streetNum)
				.append(this.city, rhs.city)
				.append(this.country, rhs.country)
				.append(this.insUsers, rhs.insUsers)
				.append(this.modifUsers, rhs.modifUsers)
				.append(this.deleted, rhs.deleted)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(id)
				.append(name)
				.append(surname)
				.append(mobil)
				.append(phone)
				.append(email)
				.append(street)
				.append(streetNum)
				.append(city)
				.append(country)
				.append(insUsers)
				.append(modifUsers)
				.append(deleted)
				.toHashCode();
	}


	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("name", name)
				.append("surname", surname)
				.append("mobil", mobil)
				.append("phone", phone)
				.append("email", email)
				.append("street", street)
				.append("streetNum", streetNum)
				.append("city", city)
				.append("country", country)
				.append("insUsers", insUsers)
				.append("modifUsers", modifUsers)
				.append("deleted", deleted)
				.toString();
	}
}
