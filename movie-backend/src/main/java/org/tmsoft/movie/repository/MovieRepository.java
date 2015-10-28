package org.tmsoft.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tmsoft.movie.entity.MovieEntity;

/**
 * Created 26.10.15
 *
 * @author Tomas Marianek
 */

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Long> {



}
