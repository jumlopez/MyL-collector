package cl.myl.collector;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CartaRepository extends JpaRepository<Carta, Long> {
    List<Carta> findByNombreContainingIgnoreCase(String nombre);
}