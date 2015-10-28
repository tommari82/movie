package org.tmsoft.movie.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.tmsoft.movie.domain.MovieDashbord;
import org.tmsoft.movie.domain.MovieDetail;

import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * Created 26.10.15
 *
 * @author Tomas Marianek
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-applicationContext.xml"})
@Rollback(value = false)

public class MovieServiceImplIT {

	@Autowired
	MovieService movieService;

	@Test
	@Rollback(value = true)
	public void testSaveMovie() throws Exception {
		MovieDetail movieDetail = new MovieDetail();

		movieDetail.setCzechName("CzechName");
		movieDetail.setOriginName("originalDetail");
		movieDetail.setNumber("1");

		movieService.saveMovie(movieDetail);
	}

	@Test
	public void testGetAllMovieDashbord() throws Exception {
		List<MovieDashbord> result = movieService.getAllMovieDashbord();

		assertNotNull(result);
	}


}