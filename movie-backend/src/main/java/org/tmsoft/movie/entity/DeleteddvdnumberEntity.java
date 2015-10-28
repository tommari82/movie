package org.tmsoft.movie.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created 26.10.15
 *
 * @author Tomas Marianek
 */

@Entity
@Table(name = "DELETEDDVDNUMBER", schema = "MOVIE")
public class DeleteddvdnumberEntity implements Serializable {
	private static final long serialVersionUID = -245662131067772846L;
	private long id;
	private long dvdnumber;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DELETEDDVDNUMBERSQ")
	@SequenceGenerator(name = "DELETEDDVDNUMBERSQ", sequenceName = "SQ_DELETEDDVDNUMBER", initialValue = 1, schema = "MOVIE", allocationSize = 1)

	@Column(name = "ID", nullable = false, insertable = true, updatable = true)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Basic
	@Column(name = "DVDNUMBER", nullable = false, insertable = true, updatable = true)
	public long getDvdnumber() {
		return dvdnumber;
	}

	public void setDvdnumber(long dvdnumber) {
		this.dvdnumber = dvdnumber;
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
		DeleteddvdnumberEntity rhs = (DeleteddvdnumberEntity) obj;
		return new EqualsBuilder()
				.append(this.id, rhs.id)
				.append(this.dvdnumber, rhs.dvdnumber)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(id)
				.append(dvdnumber)
				.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("dvdnumber", dvdnumber)
				.toString();
	}
}
