package org.tmsoft.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tmsoft.movie.entity.RegisterItemEntity;

/**
 * Created 05.10.14
 *
 *
 * @since  0.1.0
 * @author Tomas Marianek
 */

public interface RegisterItemRepository extends JpaRepository<RegisterItemEntity, Long> {
}
