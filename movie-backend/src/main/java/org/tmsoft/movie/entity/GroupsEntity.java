package org.tmsoft.movie.entity;

import javax.persistence.*;

/**
 * Created 05.10.14
 *
 * @author Tomas Marianek
 */

@Entity
@Table(name = "GROUPS", schema = "MOVIE", catalog = "MOVIE-DEV")
public class GroupsEntity {
	private long id;
	private String code;
	private String name;
	private String description;
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
	@Column(name = "CODE")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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
	@Column(name = "DESCRIPTION")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

		GroupsEntity that = (GroupsEntity) o;

		if (deleted != that.deleted) return false;
		if (id != that.id) return false;
		if (code != null ? !code.equals(that.code) : that.code != null) return false;
		if (description != null ? !description.equals(that.description) : that.description != null) return false;
		if (insUsers != null ? !insUsers.equals(that.insUsers) : that.insUsers != null) return false;
		if (modifUsers != null ? !modifUsers.equals(that.modifUsers) : that.modifUsers != null) return false;
		if (name != null ? !name.equals(that.name) : that.name != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (id ^ (id >>> 32));
		result = 31 * result + (code != null ? code.hashCode() : 0);
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (insUsers != null ? insUsers.hashCode() : 0);
		result = 31 * result + (modifUsers != null ? modifUsers.hashCode() : 0);
		result = 31 * result + (int) deleted;
		return result;
	}
}
