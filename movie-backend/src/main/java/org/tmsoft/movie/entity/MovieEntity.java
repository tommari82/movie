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
@Table(name = "MOVIE", schema = "MOVIE", catalog = "MOVIE-DEV")
public class MovieEntity implements Serializable{
	private static final long serialVersionUID = 6522567966847484245L;
	private long id;
	private String czechName;
	private String origName;
	private Long genre;
	private String description;
	private Long country;
	private String image;
	private String length;
	private String year;
	private Long insUsers;
	private Long modifUsers;
	private short deleted;
	private String csfd;
	private String imdb;
	private List<ActorsEntity> actorsEntities;
	private List<DirectorsEntity> directorsEntities;
	private DvdEntity dvdEntity;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MOVIESQ")
	@SequenceGenerator(name = "MOVIESQ", sequenceName = "movie.SQ_MOVIE", initialValue = 1, schema = "movie", allocationSize = 1)
	@Column(name = "ID", nullable = false, insertable = true, updatable = true)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Basic
	@Column(name = "CZECH_NAME", nullable = true, insertable = true, updatable = true, length = 250)
	public String getCzechName() {
		return czechName;
	}

	public void setCzechName(String czechName) {
		this.czechName = czechName;
	}

	@Basic
	@Column(name = "ORIG_NAME", nullable = true, insertable = true, updatable = true, length = 250)
	public String getOrigName() {
		return origName;
	}

	public void setOrigName(String origName) {
		this.origName = origName;
	}

	@Basic
	@Column(name = "GENRE", nullable = true, insertable = true, updatable = true)
	public Long getGenre() {
		return genre;
	}

	public void setGenre(Long genre) {
		this.genre = genre;
	}

	@Basic
	@Column(name = "DESCRIPTION", nullable = true, insertable = true, updatable = true, length = 4096)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(name = "COUNTRY", nullable = true, insertable = true, updatable = true)
	public Long getCountry() {
		return country;
	}

	public void setCountry(Long country) {
		this.country = country;
	}

	@Basic
	@Column(name = "IMAGE", nullable = true, insertable = true, updatable = true, length = 250)
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Basic
	@Column(name = "LENGTH", nullable = true, insertable = true, updatable = true, length = 5)
	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	@Basic
	@Column(name = "YEAR", nullable = true, insertable = true, updatable = true, length = 5)
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
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

	@Basic
	@Column(name = "CSFD", nullable = true, insertable = true, updatable = true, length = 1024)
	public String getCsfd() {
		return csfd;
	}

	public void setCsfd(String csfd) {
		this.csfd = csfd;
	}

	@Basic
	@Column(name = "IMDB", nullable = true, insertable = true, updatable = true, length = 1024)
	public String getImdb() {
		return imdb;
	}

	public void setImdb(String imdb) {
		this.imdb = imdb;
	}

	@OneToMany(mappedBy = "movieEntity")
	public List<ActorsEntity> getActorsEntities() {
		return actorsEntities;
	}

	public void setActorsEntities(List<ActorsEntity> actorsEntities) {
		this.actorsEntities = actorsEntities;
	}

	@OneToMany(mappedBy = "directorEntity")
	public List<DirectorsEntity> getDirectorsEntities() {
		return directorsEntities;
	}

	public void setDirectorsEntities(List<DirectorsEntity> directorsEntities) {
		this.directorsEntities = directorsEntities;
	}

	@OneToOne(mappedBy = "movieEntity")
	public DvdEntity getDvdEntity() {
		return dvdEntity;
	}

	public void setDvdEntity(DvdEntity dvdEntity) {
		this.dvdEntity = dvdEntity;
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
		MovieEntity rhs = (MovieEntity) obj;
		return new EqualsBuilder()
				.append(this.id, rhs.id)
				.append(this.czechName, rhs.czechName)
				.append(this.origName, rhs.origName)
				.append(this.genre, rhs.genre)
				.append(this.description, rhs.description)
				.append(this.country, rhs.country)
				.append(this.image, rhs.image)
				.append(this.length, rhs.length)
				.append(this.year, rhs.year)
				.append(this.insUsers, rhs.insUsers)
				.append(this.modifUsers, rhs.modifUsers)
				.append(this.deleted, rhs.deleted)
				.append(this.csfd, rhs.csfd)
				.append(this.imdb, rhs.imdb)
				.append(this.actorsEntities, rhs.actorsEntities)
				.append(this.directorsEntities, rhs.directorsEntities)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(id)
				.append(czechName)
				.append(origName)
				.append(genre)
				.append(description)
				.append(country)
				.append(image)
				.append(length)
				.append(year)
				.append(insUsers)
				.append(modifUsers)
				.append(deleted)
				.append(csfd)
				.append(imdb)
				.append(actorsEntities)
				.append(directorsEntities)
				.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("czechName", czechName)
				.append("origName", origName)
				.append("genre", genre)
				.append("description", description)
				.append("country", country)
				.append("image", image)
				.append("length", length)
				.append("year", year)
				.append("insUsers", insUsers)
				.append("modifUsers", modifUsers)
				.append("deleted", deleted)
				.append("csfd", csfd)
				.append("imdb", imdb)
				.append("actorsEntities", actorsEntities)
				.append("directorsEntities", directorsEntities)
				.toString();
	}
}
