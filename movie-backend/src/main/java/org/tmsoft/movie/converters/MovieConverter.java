package org.tmsoft.movie.converters;

import org.springframework.core.convert.converter.Converter;
import org.tmsoft.movie.domain.MovieDashbord;
import org.tmsoft.movie.entity.MovieEntity;

/**
 * Created 26.10.15
 *
 * @author Tomas Marianek
 */

public class MovieConverter implements Converter<MovieEntity, MovieDashbord> {
	@Override
	public MovieDashbord convert(MovieEntity movieEntity) {
		MovieDashbord retVal = new MovieDashbord();
		retVal.setId(movieEntity.getId());
		retVal.setCzechName(movieEntity.getCzechName());
		retVal.setOriginalName(movieEntity.getOrigName());
		if(movieEntity.getDvdEntity() != null){
			retVal.setNumber(String.valueOf(movieEntity.getDvdEntity().getNumber()));
		}
		return retVal;
	}
}
