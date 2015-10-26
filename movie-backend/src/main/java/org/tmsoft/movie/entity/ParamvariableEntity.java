package org.tmsoft.movie.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created 05.10.14
 *
 * @author Tomas Marianek
 */

@Entity
@Table(name = "PARAMVARIABLE", schema = "MOVIE")
public class ParamvariableEntity implements Serializable {

	private static final long serialVersionUID = -4191592616920344981L;
	private long id;
	private String nameGroup;
	private String nameVar;
	private String cValue;
	private Timestamp dValue;
	private BigDecimal nValue;
	private Timestamp validFrom;
	private Timestamp validTo;
	private Long insUsers;
	private Long modifUsers;
	private short deleted;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PARAMVARIABLESQ")
	@SequenceGenerator(name = "PARAMVARIABLESQ", sequenceName = "movie.sq_paramvariable", initialValue = 1, schema = "movie", allocationSize = 1)
	@Column(name = "ID")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Basic
	@Column(name = "NAME_GROUP")
	public String getNameGroup() {
		return nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}

	@Basic
	@Column(name = "NAME_VAR")
	public String getNameVar() {
		return nameVar;
	}

	public void setNameVar(String nameVar) {
		this.nameVar = nameVar;
	}

	@Basic
	@Column(name = "C_VALUE")
	public String getcValue() {
		return cValue;
	}

	public void setcValue(String cValue) {
		this.cValue = cValue;
	}

	@Basic
	@Column(name = "D_VALUE")
	public Timestamp getdValue() {
		return dValue;
	}

	public void setdValue(Timestamp dValue) {
		this.dValue = dValue;
	}

	@Basic
	@Column(name = "N_VALUE")
	public BigDecimal getnValue() {
		return nValue;
	}

	public void setnValue(BigDecimal nValue) {
		this.nValue = nValue;
	}

	@Basic
	@Column(name = "VALID_FROM")
	public Timestamp getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Timestamp validFrom) {
		this.validFrom = validFrom;
	}

	@Basic
	@Column(name = "VALID_TO")
	public Timestamp getValidTo() {
		return validTo;
	}

	public void setValidTo(Timestamp validTo) {
		this.validTo = validTo;
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
		ParamvariableEntity rhs = (ParamvariableEntity) obj;
		return new EqualsBuilder()
				.append(this.id, rhs.id)
				.append(this.nameGroup, rhs.nameGroup)
				.append(this.nameVar, rhs.nameVar)
				.append(this.cValue, rhs.cValue)
				.append(this.dValue, rhs.dValue)
				.append(this.nValue, rhs.nValue)
				.append(this.validFrom, rhs.validFrom)
				.append(this.validTo, rhs.validTo)
				.append(this.insUsers, rhs.insUsers)
				.append(this.modifUsers, rhs.modifUsers)
				.append(this.deleted, rhs.deleted)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(id)
				.append(nameGroup)
				.append(nameVar)
				.append(cValue)
				.append(dValue)
				.append(nValue)
				.append(validFrom)
				.append(validTo)
				.append(insUsers)
				.append(modifUsers)
				.append(deleted)
				.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("nameGroup", nameGroup)
				.append("nameVar", nameVar)
				.append("cValue", cValue)
				.append("dValue", dValue)
				.append("nValue", nValue)
				.append("validFrom", validFrom)
				.append("validTo", validTo)
				.append("insUsers", insUsers)
				.append("modifUsers", modifUsers)
				.append("deleted", deleted)
				.toString();
	}

}
