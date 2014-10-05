package org.tmsoft.movie.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.tmsoft.movie.entity.RegisterEntity;

import java.util.List;

import static org.junit.Assert.assertNotNull;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-applicationContext.xml"})

public class RegisterRepositoryIT {

	@Autowired
	RegisterRepository registerRepository;

	@Test
	public void testGetAll() throws Exception {

		List<RegisterEntity> result = registerRepository.findAll();

		assertNotNull(result);

	}
}