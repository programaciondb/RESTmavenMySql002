
package cl.duoc.restspring.modelos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepositorio extends JpaRepository<MatriculaEntidad, Integer> {
    
}
