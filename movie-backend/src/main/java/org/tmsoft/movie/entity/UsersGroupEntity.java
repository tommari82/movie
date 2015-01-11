package org.tmsoft.movie.entity;

import javax.persistence.*;

/**
 * Created 05.10.14
 *
 * @author Tomas Marianek
 */

@Entity
@Table(name = "USERS_GROUP", schema = "MOVIE", catalog = "MOVIE-DEV")
public class UsersGroupEntity {
	private long id;
	private Long insUsers;
	private Long modifUsers;
	private short deleted;
	private UsersEntity usersEntity;
	private GroupsEntity groupsEntity;

	@Id
	@Column(name = "ID")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
	@ManyToOne
	@JoinColumn(name = "id_users", nullable = false)
	public UsersEntity getUsersEntity() {
		return usersEntity;
	}

	public void setUsersEntity(UsersEntity usersEntity) {
		this.usersEntity = usersEntity;
	}

	@ManyToOne
	@JoinColumn(name = "id_groups", nullable = false)
	public GroupsEntity getGroupsEntity() {
		return groupsEntity;
	}

	public void setGroupsEntity(GroupsEntity groupsEntity) {
		this.groupsEntity = groupsEntity;
	}

	@ManyToOne
	@JoinColumn(name = "id_groups", nullable = false)

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		UsersGroupEntity that = (UsersGroupEntity) o;

		if (deleted != that.deleted) return false;
		if (id != that.id) return false;
		if (insUsers != null ? !insUsers.equals(that.insUsers) : that.insUsers != null) return false;
		if (modifUsers != null ? !modifUsers.equals(that.modifUsers) : that.modifUsers != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) (id ^ (id >>> 32));
		result = 31 * result + (insUsers != null ? insUsers.hashCode() : 0);
		result = 31 * result + (modifUsers != null ? modifUsers.hashCode() : 0);
		result = 31 * result + (int) deleted;
		return result;
	}
}
