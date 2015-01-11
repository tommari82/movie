package org.tmsoft.movie.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created 05.10.14
 *
 * @author Tomas Marianek
 */

@Entity
@Table(name = "USERS", schema = "MOVIE", catalog = "MOVIE-DEV")
public class UsersEntity {
	private long id;
	private Long idPerson;
	private String username;
	private String pass;
	private Long insUsers;
	private Long modifUsers;
	private short deleted;
	private List<UsersGroupEntity> usersGroupEntities;

	@Id
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
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		UsersEntity that = (UsersEntity) o;

		if (deleted != that.deleted) return false;
		if (id != that.id) return false;
		if (idPerson != null ? !idPerson.equals(that.idPerson) : that.idPerson != null) return false;
		if (insUsers != null ? !insUsers.equals(that.insUsers) : that.insUsers != null) return false;
		if (modifUsers != null ? !modifUsers.equals(that.modifUsers) : that.modifUsers != null) return false;
		if (pass != null ? !pass.equals(that.pass) : that.pass != null) return false;
		if (username != null ? !username.equals(that.username) : that.username != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (id ^ (id >>> 32));
		result = 31 * result + (idPerson != null ? idPerson.hashCode() : 0);
		result = 31 * result + (username != null ? username.hashCode() : 0);
		result = 31 * result + (pass != null ? pass.hashCode() : 0);
		result = 31 * result + (insUsers != null ? insUsers.hashCode() : 0);
		result = 31 * result + (modifUsers != null ? modifUsers.hashCode() : 0);
		result = 31 * result + (int) deleted;
		return result;
	}
}
