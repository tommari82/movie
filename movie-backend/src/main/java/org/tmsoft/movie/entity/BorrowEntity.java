package org.tmsoft.movie.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created 26.10.15
 *
 * @author Tomas Marianek
 */

@Entity
@Table(name = "BORROW", schema = "MOVIE")
public class BorrowEntity implements Serializable {
	private static final long serialVersionUID = -9124274831161414392L;
	private long id;

	private Date dateBorrow;
	private Date dateReturn;
	private Long insUsers;
	private Long modifUsers;
	private short deleted;
	private DvdEntity dvdEntity;
	private PersonEntity personEntity;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BORROWSQ")
	@SequenceGenerator(name = "BORROWSQ", sequenceName = "SQ_BORROW", initialValue = 1, schema = "MOVIE", allocationSize = 1)

	@Column(name = "ID", nullable = false, insertable = true, updatable = true)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	@Basic
	@Column(name = "DATE_BORROW", nullable = true, insertable = true, updatable = true)
	public Date getDateBorrow() {
		return dateBorrow;
	}

	public void setDateBorrow(Date dateBorrow) {
		this.dateBorrow = dateBorrow;
	}

	@Basic
	@Column(name = "DATE_RETURN", nullable = true, insertable = true, updatable = true)
	public Date getDateReturn() {
		return dateReturn;
	}

	public void setDateReturn(Date dateReturn) {
		this.dateReturn = dateReturn;
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
	@Column(name = "DELETED", nullable = false, insertable = true, updatable = true)
	public short getDeleted() {
		return deleted;
	}

	public void setDeleted(short deleted) {
		this.deleted = deleted;
	}

	@ManyToOne
	@JoinColumn(name = "ID_DVD", referencedColumnName = "ID")
	public DvdEntity getDvdEntity() {
		return dvdEntity;
	}

	public void setDvdEntity(DvdEntity dvdEntity) {
		this.dvdEntity = dvdEntity;
	}

	@ManyToOne
	@JoinColumn(name = "ID_PERSON", referencedColumnName = "ID")
	public PersonEntity getPersonEntity() {
		return personEntity;
	}

	public void setPersonEntity(PersonEntity personEntity) {
		this.personEntity = personEntity;
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
		BorrowEntity rhs = (BorrowEntity) obj;
		return new EqualsBuilder()
				.append(this.id, rhs.id)
				.append(this.dateBorrow, rhs.dateBorrow)
				.append(this.dateReturn, rhs.dateReturn)
				.append(this.insUsers, rhs.insUsers)
				.append(this.modifUsers, rhs.modifUsers)
				.append(this.deleted, rhs.deleted)
				.append(this.dvdEntity, rhs.dvdEntity)
				.append(this.personEntity, rhs.personEntity)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(id)
				.append(dateBorrow)
				.append(dateReturn)
				.append(insUsers)
				.append(modifUsers)
				.append(deleted)
				.append(dvdEntity)
				.append(personEntity)
				.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("dateBorrow", dateBorrow)
				.append("dateReturn", dateReturn)
				.append("insUsers", insUsers)
				.append("modifUsers", modifUsers)
				.append("deleted", deleted)
				.append("dvdEntity", dvdEntity)
				.append("personEntity", personEntity)
				.toString();
	}
}
