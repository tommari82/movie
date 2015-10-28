package org.tmsoft.movie.domain;

import java.io.Serializable;

/**
 * Created 26.10.15
 *
 * @author Tomas Marianek
 */

public class MovieDetail implements Serializable{
	private String number;
	private String czechName;
	private String originName;

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

	public String getOriginName() {
		return originName;
	}

	public void setOriginName(String originName) {
		this.originName = originName;
	}
}
