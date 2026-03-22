package cl.myl.collector;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaRepository extends JpaRepository<Carta, Long> {
}