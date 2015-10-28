package org.tmsoft.movie.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.tmsoft.movie.entity.MovieEntity;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created 26.10.15
 *
 * @author Tomas Marianek
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-applicationContext.xml"})


public class MovieRepositoryIT {
	@Autowired
	MovieRepository movieRepository;

	@Test
	public void testGetAll() throws Exception {
		List<MovieEntity> result = movieRepository.findAll();

		assertNotNull(result);
		assertTrue(result.size() > 0);

	}


}