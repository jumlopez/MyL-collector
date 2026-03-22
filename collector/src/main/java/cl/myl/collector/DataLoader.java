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

        agregarCarta("Kalki", "Primera Era", "Avatar", "Rara");
        agregarCarta("Anubis", "Primera Era", "Dios", "Épica");
        agregarCarta("Odín", "Primera Era", "Dios", "Épica");
        agregarCarta("Medusa", "Primera Era", "Criatura", "Rara");
        agregarCarta("Minotauro", "Primera Era", "Criatura", "Común");
        agregarCarta("Guerrero Mapuche", "Imperio", "Guerrero", "Común");
        agregarCarta("Dragón de Fuego", "Imperio", "Criatura", "Rara");
        agregarCarta("Machi", "Imperio", "Hechicero", "Poco Común");
        agregarCarta("Cóndor Sagrado", "Imperio", "Criatura", "Poco Común");
        agregarCarta("Thor", "Ragnarok", "Dios", "Épica");
        agregarCarta("Loki", "Ragnarok", "Dios", "Rara");
        agregarCarta("Fenrir", "Ragnarok", "Criatura", "Rara");
        agregarCarta("Zeus", "Olimpo", "Dios", "Épica");
        agregarCarta("Atenea", "Olimpo", "Diosa", "Rara");
        agregarCarta("Pegaso", "Olimpo", "Criatura", "Poco Común");
    }

    private void agregarCarta(String nombre, String edicion, String tipo, String rareza) {
        Carta carta = new Carta();
        carta.setNombre(nombre);
        carta.setEdicion(edicion);
        carta.setTipo(tipo);
        carta.setRareza(rareza);
        cartaRepository.save(carta);
    }
}