package org.tmsoft.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tmsoft.movie.entity.RegisterEntity;

/**
 *
 * @author Tomas Marianek
 * @since  0.1.0
 */
public interface RegisterRepository  extends JpaRepository<RegisterEntity, Long> {

}
