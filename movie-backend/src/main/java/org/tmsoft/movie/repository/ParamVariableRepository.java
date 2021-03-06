package org.tmsoft.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tmsoft.movie.entity.ParamvariableEntity;

/**
 * Created 05.10.14
 *
 * @author Tomas Marianek
 */

@Repository
public interface ParamVariableRepository extends JpaRepository<ParamvariableEntity, Long>{
}
