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
@Table(name = "USERS", schema = "MOVIE")
public class UsersEntity implements Serializable{

	private static final long serialVersionUID = 8005442524631051689L;
	private long id;
	private Long idPerson;
	private String username;
	private String pass;
	private Long insUsers;
	private Long modifUsers;
	private short deleted;
	private List<UsersGroupEntity> usersGroupEntities;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USERSSQ")
	@SequenceGenerator(name = "USERSSQ", sequenceName = "movie.sq_users", initialValue = 1, schema = "movie", allocationSize = 1)

	@Column(name = "ID")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Basic
	@Column(name = "ID_PERSON")
	public Long getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}

	@Basic
	@Column(name = "USERNAME")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Basic
	@Column(name = "PASS")
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
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

	@OneToMany(mappedBy = "usersEntity")
	public List<UsersGroupEntity> getUsersGroupEntities() {
		return usersGroupEntities;
	}

	public void setUsersGroupEntities(List<UsersGroupEntity> usersGroupEntities) {
		this.usersGroupEntities = usersGroupEntities;
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
		UsersEntity rhs = (UsersEntity) obj;
		return new EqualsBuilder()
				.append(this.id, rhs.id)
				.append(this.idPerson, rhs.idPerson)
				.append(this.username, rhs.username)
				.append(this.pass, rhs.pass)
				.append(this.insUsers, rhs.insUsers)
				.append(this.modifUsers, rhs.modifUsers)
				.append(this.deleted, rhs.deleted)
				.append(this.usersGroupEntities, rhs.usersGroupEntities)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(id)
				.append(idPerson)
				.append(username)
				.append(pass)
				.append(insUsers)
				.append(modifUsers)
				.append(deleted)
				.append(usersGroupEntities)
				.toHashCode();
	}


	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("idPerson", idPerson)
				.append("username", username)
				.append("pass", pass)
				.append("insUsers", insUsers)
				.append("modifUsers", modifUsers)
				.append("deleted", deleted)
				.append("usersGroupEntities", usersGroupEntities)
				.toString();
	}
}
