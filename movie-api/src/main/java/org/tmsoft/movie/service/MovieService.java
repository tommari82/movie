package org.tmsoft.movie.service;

import org.tmsoft.movie.domain.MovieDashbord;
import org.tmsoft.movie.domain.MovieDetail;

import java.util.List;

/**
 * Created 26.10.15
 *
 * @author Tomas Marianek
 */

public interface MovieService {

	List<MovieDashbord> getAllMovieDashbord();

	void saveMovie(MovieDetail movieDetail);
}
