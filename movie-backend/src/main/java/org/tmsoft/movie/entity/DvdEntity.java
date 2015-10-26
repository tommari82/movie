package org.tmsoft.movie.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * Created 26.10.15
 *
 * @author Tomas Marianek
 */

@Entity
@Table(name = "DVD", schema = "MOVIE", catalog = "MOVIE-DEV")
public class DvdEntity implements Serializable{
	private static final long serialVersionUID = -8839117451912667347L;
	private long id;
	private Long number;
	private Long insUsers;
	private Long modifUsers;
	private short deleted;
	private List<BorrowEntity>  borrowEntities;
	private MovieEntity movieEntity;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DVDSQ")
	@SequenceGenerator(name = "DVDSQ", sequenceName = "movie.SQ_DVD", initialValue = 1, schema = "movie", allocationSize = 1)

	@Column(name = "ID", nullable = false, insertable = true, updatable = true)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Basic
	@Column(name = "NUMBER", nullable = true, insertable = true, updatable = true)
	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	@Basic
	@Column(name = "INS_USERS", nullable = true, insertable = true, updatable = true)
	public Long getInsUsers() {
		return insUsers;
	}

	public void setInsUsers(Long insUsers) {
		this.insUsers = insUsers;
	}

	@Basic
	@Column(name = "MODIF_USERS", nullable = true, insertable = true, updatable = true)
	public Long getModifUsers() {
		return modifUsers;
	}

	public void setModifUsers(Long modifUsers) {
		this.modifUsers = modifUsers;
	}

	@Basic
	@Column(name = "DELETED", nullable = false, insertable = true, updatable = true)
	public short getDeleted() {
		return deleted;
	}

	public void setDeleted(short deleted) {
		this.deleted = deleted;
	}

	@OneToMany(mappedBy = "dvdEntity")
	public List<BorrowEntity> getBorrowEntities() {
		return borrowEntities;
	}

	public void setBorrowEntities(List<BorrowEntity> borrowEntities) {
		this.borrowEntities = borrowEntities;
	}


	@OneToOne
	@JoinColumn(name = "ID_MOVIE")
	public MovieEntity getMovieEntity() {
		return movieEntity;
	}

	public void setMovieEntity(MovieEntity movieEntity) {
		this.movieEntity = movieEntity;
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
		DvdEntity rhs = (DvdEntity) obj;
		return new EqualsBuilder()
				.append(this.id, rhs.id)
				.append(this.number, rhs.number)
				.append(this.insUsers, rhs.insUsers)
				.append(this.modifUsers, rhs.modifUsers)
				.append(this.deleted, rhs.deleted)
				.append(this.borrowEntities, rhs.borrowEntities)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(id)
				.append(number)
				.append(insUsers)
				.append(modifUsers)
				.append(deleted)
				.append(borrowEntities)
				.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("number", number)
				.append("insUsers", insUsers)
				.append("modifUsers", modifUsers)
				.append("deleted", deleted)
				.append("borrowEntities", borrowEntities)
				.toString();
	}
}
