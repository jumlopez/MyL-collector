package cl.myl.collector;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CartaController {

    private final CartaRepository cartaRepository;

    public CartaController(CartaRepository cartaRepository) {
        this.cartaRepository = cartaRepository;
    }

    @GetMapping("/cartas")
    public String listarCartas(
            @RequestParam(required = false, defaultValue = "") String buscar,
            Model model) {

        List<Carta> cartas;

        if (buscar.isEmpty()) {
            cartas = cartaRepository.findAll();
        } else {
            cartas = cartaRepository
                    .findByNombreContainingIgnoreCase(buscar);
        }

        model.addAttribute("cartas", cartas);
        model.addAttribute("buscar", buscar);
        return "cartas";
    }
    @GetMapping("/cartas/{id}")
    public String detalleCarta(@PathVariable Long id, Model model) {
        Carta carta = cartaRepository.findById(id).orElse(null);
        model.addAttribute("carta", carta);
        return "carta-detalle";
    }
}
