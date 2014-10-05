package org.tmsoft.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tmsoft.movie.entity.ParamvariableEntity;

/**
 * Created 05.10.14
 *
 * @author Tomas Marianek
 */

public interface ParamVariableRepository extends JpaRepository<ParamvariableEntity, Long>{
}
