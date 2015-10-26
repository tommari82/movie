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
@Table(name = "GROUP_RIGHTS", schema = "MOVIE")
public class GroupRightsEntity implements Serializable{

	private static final long serialVersionUID = -3222886813386928493L;
	private long id;
	private Long insUsers;
	private Long modifUsers;
	private short deleted;
	private RightsEntity rightsEntity;
	private GroupsEntity groupsEntity;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GROUPRIGHTSSQ")
	@SequenceGenerator(name = "GROUPRIGHTSSQ", sequenceName = "movie.SQ_GROUP_RIGHTS", initialValue = 1, schema = "movie", allocationSize = 1)
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
	@JoinColumn(name = "ID_RIGHT", referencedColumnName = "ID", nullable = true)
	public RightsEntity getRightsEntity() {
		return rightsEntity;
	}

	public void setRightsEntity(RightsEntity rightsEntity) {
		this.rightsEntity = rightsEntity;
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
		GroupRightsEntity rhs = (GroupRightsEntity) obj;
		return new EqualsBuilder()
				.append(this.id, rhs.id)
				.append(this.insUsers, rhs.insUsers)
				.append(this.modifUsers, rhs.modifUsers)
				.append(this.deleted, rhs.deleted)
				.append(this.rightsEntity, rhs.rightsEntity)
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
				.append(rightsEntity)
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
				.append("rightsEntity", rightsEntity)
				.append("groupsEntity", groupsEntity)
				.toString();
	}
}
