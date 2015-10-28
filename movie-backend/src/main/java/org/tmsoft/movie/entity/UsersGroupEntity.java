package org.tmsoft.movie.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created 05.10.14
 *
 * @author Tomas Marianek
 */

@Entity
@Table(name = "USERS_GROUP", schema = "MOVIE")
public class UsersGroupEntity implements Serializable{

	private static final long serialVersionUID = 2799435702795325078L;
	private long id;
	private Long insUsers;
	private Long modifUsers;
	private short deleted;
	private UsersEntity usersEntity;
	private GroupsEntity groupsEntity;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USERSGROUPSQ")
	@SequenceGenerator(name = "USERSGROUPSQ", sequenceName = "SQ_USERS_GROUP", initialValue = 1, schema = "MOVIE", allocationSize = 1)

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
	@JoinColumn(name = "id_users",referencedColumnName = "id", nullable = true)
	public UsersEntity getUsersEntity() {
		return usersEntity;
	}

	public void setUsersEntity(UsersEntity usersEntity) {
		this.usersEntity = usersEntity;
	}
	@ManyToOne
	@JoinColumn(name = "id_group",referencedColumnName = "id", nullable = true)
	public GroupsEntity getGroupsEntity() {
		return groupsEntity;
	}

	public void setGroupsEntity(GroupsEntity groupsEntity) {
		this.groupsEntity = groupsEntity;
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
		UsersGroupEntity rhs = (UsersGroupEntity) obj;
		return new EqualsBuilder()
				.append(this.id, rhs.id)
				.append(this.insUsers, rhs.insUsers)
				.append(this.modifUsers, rhs.modifUsers)
				.append(this.deleted, rhs.deleted)
				.append(this.usersEntity, rhs.usersEntity)
				.append(this.groupsEntity, rhs.groupsEntity)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(id)
				.append(insUsers)
				.append(modifUsers)
				.append(deleted)
				.append(usersEntity)
				.append(groupsEntity)
				.toHashCode();
	}


	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("insUsers", insUsers)
				.append("modifUsers", modifUsers)
				.append("deleted", deleted)
				.append("usersEntity", usersEntity)
				.append("groupsEntity", groupsEntity)
				.toString();
	}
}
