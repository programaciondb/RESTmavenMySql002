
package cl.duoc.restspring.modelos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// JpaRepository<ClaseEntidad, TipoDato Id>
public interface TallerRepositorio extends JpaRepository<TallerEntidad, Integer> {
    
    
}
