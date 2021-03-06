package org.tmsoft.movie.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created 26.10.15
 *
 * @author Tomas Marianek
 */

@Entity
@Table(name = "DIRECTOR", schema = "MOVIE")
public class DirectorEntity implements Serializable{
	private static final long serialVersionUID = 2698999955641044124L;
	private long id;
	private String name;
	private String surname;
	private Long insUsers;
	private Long modifUsers;
	private short deleted;
	private List<DirectorsEntity> directorsEntities;


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DIRECTORSQ")
	@SequenceGenerator(name = "DIRECTORSQ", sequenceName = "SQ_DIRECTOR", initialValue = 1, schema = "MOVIE", allocationSize = 1)

	@Column(name = "ID", nullable = false, insertable = true, updatable = true)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Basic
	@Column(name = "NAME", nullable = true, insertable = true, updatable = true, length = 30)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name = "SURNAME", nullable = true, insertable = true, updatable = true, length = 30)
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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

	@OneToMany(mappedBy = "directorEntity")
	public List<DirectorsEntity> getDirectorsEntities() {
		return directorsEntities;
	}

	public void setDirectorsEntities(List<DirectorsEntity> directorsEntities) {
		this.directorsEntities = directorsEntities;
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
		DirectorEntity rhs = (DirectorEntity) obj;
		return new EqualsBuilder()
				.append(this.id, rhs.id)
				.append(this.name, rhs.name)
				.append(this.surname, rhs.surname)
				.append(this.insUsers, rhs.insUsers)
				.append(this.modifUsers, rhs.modifUsers)
				.append(this.deleted, rhs.deleted)
				.append(this.directorsEntities, rhs.directorsEntities)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(id)
				.append(name)
				.append(surname)
				.append(insUsers)
				.append(modifUsers)
				.append(deleted)
				.append(directorsEntities)
				.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("name", name)
				.append("surname", surname)
				.append("insUsers", insUsers)
				.append("modifUsers", modifUsers)
				.append("deleted", deleted)
				.append("directorsEntities", directorsEntities)
				.toString();
	}
}
