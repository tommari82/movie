package org.tmsoft.movie.domain;

import java.io.Serializable;

/**
 * Created 26.10.15
 *
 * @author Tomas Marianek
 */

public class MovieDashbord implements Serializable {

	private static final long serialVersionUID = -2495208735041580363L;
	private Long id;
	private String number;
	private String czechName;
	private String originalName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCzechName() {
		return czechName;
	}

	public void setCzechName(String czechName) {
		this.czechName = czechName;
	}

	public String getOriginalName() {
		return originalName;
	}

	public void setOriginalName(String originalName) {
		this.originalName = originalName;
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
		MovieDashbord rhs = (MovieDashbord) obj;
		return new org.apache.commons.lang3.builder.EqualsBuilder()
				.append(this.id, rhs.id)
				.append(this.number, rhs.number)
				.append(this.czechName, rhs.czechName)
				.append(this.originalName, rhs.originalName)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new org.apache.commons.lang3.builder.HashCodeBuilder()
				.append(id)
				.append(number)
				.append(czechName)
				.append(originalName)
				.toHashCode();
	}

	@Override
	public String toString() {
		return new org.apache.commons.lang3.builder.ToStringBuilder(this)
				.append("id", id)
				.append("number", number)
				.append("czechName", czechName)
				.append("originalName", originalName)
				.toString();
	}
}
