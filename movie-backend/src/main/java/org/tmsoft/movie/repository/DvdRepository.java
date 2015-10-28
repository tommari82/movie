package org.tmsoft.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tmsoft.movie.entity.DvdEntity;

/**
 * Created 26.10.15
 *
 * @author Tomas Marianek
 */

public interface DvdRepository extends JpaRepository<DvdEntity, Long> {
}
