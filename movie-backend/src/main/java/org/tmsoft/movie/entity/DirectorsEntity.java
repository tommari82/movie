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
@Table(name = "DIRECTORS", schema = "MOVIE", catalog = "MOVIE-DEV")
public class DirectorsEntity implements Serializable{
	private static final long serialVersionUID = 8742002936218713205L;
	private long id;
	private Long insUsers;
	private Long modifUsers;
	private short deleted;
	private DirectorEntity directorEntity;
	private MovieEntity movieEntity;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DIRECTORSSQ")
	@SequenceGenerator(name = "DIRECTORSSQ", sequenceName = "movie.SQ_DIRECTORS", initialValue = 1, schema = "movie", allocationSize = 1)

	@Column(name = "ID", nullable = false, insertable = true, updatable = true)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	@ManyToOne
	@JoinColumn(referencedColumnName = "ID", name = "ID_DIRECTOR")
	public DirectorEntity getDirectorEntity() {
		return directorEntity;
	}

	public void setDirectorEntity(DirectorEntity directorEntity) {
		this.directorEntity = directorEntity;
	}

	@ManyToOne
	@JoinColumn(name = "ID_MOVIE", referencedColumnName = "ID")
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
		DirectorsEntity rhs = (DirectorsEntity) obj;
		return new EqualsBuilder()
				.append(this.id, rhs.id)
				.append(this.insUsers, rhs.insUsers)
				.append(this.modifUsers, rhs.modifUsers)
				.append(this.deleted, rhs.deleted)
				.append(this.directorEntity, rhs.directorEntity)
				.append(this.movieEntity, rhs.movieEntity)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(id)
				.append(insUsers)
				.append(modifUsers)
				.append(deleted)
				.append(directorEntity)
				.append(movieEntity)
				.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("insUsers", insUsers)
				.append("modifUsers", modifUsers)
				.append("deleted", deleted)
				.append("directorEntity", directorEntity)
				.append("movieEntity", movieEntity)
				.toString();
	}
}
