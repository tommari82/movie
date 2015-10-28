package org.tmsoft.movie.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by tomasmrianek on 05.10.14.
 */
@Entity
@Table(name = "REGISTER", schema = "MOVIE")
public class RegisterEntity implements Serializable {
	private static final long serialVersionUID = -4862107102137896735L;
	private Long id;
	private String code;
	private String name;
	private String description;
	private Long insUsers;
	private Long modifUsers;
	private Short deleted;
	private List<RegisterItemEntity> registerItemEntities;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REISTERSQ")
	@SequenceGenerator(name = "REISTERSQ", sequenceName = "SQ_REGISTER", initialValue = 1, schema = "MOVIE", allocationSize = 1)
	@Column(name = "ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
	public Short getDeleted() {
		return deleted;
	}

	public void setDeleted(Short deleted) {
		this.deleted = deleted;
	}

	@OneToMany(mappedBy = "registerEntity")
	public List<RegisterItemEntity> getRegisterItemEntities() {
		return registerItemEntities;
	}

	public void setRegisterItemEntities(List<RegisterItemEntity> registerItemEntities) {
		this.registerItemEntities = registerItemEntities;
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
		RegisterEntity rhs = (RegisterEntity) obj;
		return new EqualsBuilder()
				.append(this.id, rhs.id)
				.append(this.code, rhs.code)
				.append(this.name, rhs.name)
				.append(this.description, rhs.description)
				.append(this.insUsers, rhs.insUsers)
				.append(this.modifUsers, rhs.modifUsers)
				.append(this.deleted, rhs.deleted)
				.append(this.registerItemEntities, rhs.registerItemEntities)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(id)
				.append(code)
				.append(name)
				.append(description)
				.append(insUsers)
				.append(modifUsers)
				.append(deleted)
				.append(registerItemEntities)
				.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("code", code)
				.append("name", name)
				.append("description", description)
				.append("insUsers", insUsers)
				.append("modifUsers", modifUsers)
				.append("deleted", deleted)
				.append("registerItemEntities", registerItemEntities)
				.toString();
	}
}
