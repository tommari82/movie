package org.tmsoft.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tmsoft.movie.domain.MovieDetail;
import org.tmsoft.movie.domain.MovieDashbord;
import org.tmsoft.movie.entity.DvdEntity;
import org.tmsoft.movie.entity.MovieEntity;
import org.tmsoft.movie.repository.DvdRepository;
import org.tmsoft.movie.repository.MovieRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created 26.10.15
 *
 * @author Tomas Marianek
 */

@Service
@Transactional
public class MovieServiceImpl implements MovieService {
	@Autowired
	MovieRepository movieRepository;

	@Autowired
	DvdRepository dvdRepository;

	@Autowired
	ConversionService conversionService;

	@Transactional(readOnly = true)
	@Override
	public List<MovieDashbord> getAllMovieDashbord() {
		List<MovieEntity> movieEntities = movieRepository.findAll();
		List<MovieDashbord> retVal = new ArrayList<MovieDashbord>();
			for (MovieEntity me : movieEntities){
				MovieDashbord md = conversionService.convert(me, MovieDashbord.class);
				retVal.add(md);
			}
		return retVal;
	}

	@Transactional(readOnly = false)
	@Override
	public void saveMovie(MovieDetail movieDetail) {
		MovieEntity movieEntity = new MovieEntity();
		movieEntity.setCzechName(movieDetail.getCzechName());
		movieEntity.setOrigName(movieDetail.getOriginName());

		movieRepository.save(movieEntity);

		DvdEntity dvdEntity = new DvdEntity();

		dvdEntity.setNumber(Long.valueOf(movieDetail.getNumber()));
		dvdEntity.setMovieEntity(movieEntity);
		dvdRepository.save(dvdEntity);

	}
}
