package cl.myl.collector;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final CartaRepository cartaRepository;

    public DataLoader(CartaRepository cartaRepository) {
        this.cartaRepository = cartaRepository;
    }

    @Override
    public void run(String... args) {
        Carta carta1 = new Carta();
        carta1.setNombre("Dragón de Fuego");
        carta1.setEdicion("Primera Era");
        carta1.setTipo("Criatura");
        carta1.setRareza("Rara");
        cartaRepository.save(carta1);

        Carta carta2 = new Carta();
        carta2.setNombre("Guerrero Mapuche");
        carta2.setEdicion("Imperio");
        carta2.setTipo("Guerrero");
        carta2.setRareza("Común");
        cartaRepository.save(carta2);
    }
}