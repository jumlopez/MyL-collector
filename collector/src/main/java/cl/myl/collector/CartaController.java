package cl.myl.collector;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class CartaController {

    private final CartaRepository cartaRepository;

    public CartaController(CartaRepository cartaRepository) {
        this.cartaRepository = cartaRepository;
    }

    @GetMapping("/cartas")
    public String listarCartas(Model model) {
        List<Carta> cartas = cartaRepository.findAll();
        model.addAttribute("cartas", cartas);
        return "cartas";
    }
}