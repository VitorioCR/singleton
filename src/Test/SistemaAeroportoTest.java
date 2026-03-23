package Test;

import Singleton.SistemaAeroporto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SistemaAeroportoTest {

    @Test
    public void deveRetornarNomeAeroporto() {
        SistemaAeroporto.getInstance().setNomeAeroporto("Aeroporto Internacional de Confins");
        assertEquals("Aeroporto Internacional de Confins", SistemaAeroporto.getInstance().getNomeAeroporto());
    }

    @Test
    public void deveRetornarOperadorLogado() {
        SistemaAeroporto.getInstance().setOperadorLogado("Controlador Vitório");
        assertEquals("Controlador Vitório", SistemaAeroporto.getInstance().getOperadorLogado());
    }

    @Test
    public void deveRetornarVooEmDestaque() {
        SistemaAeroporto.getInstance().setVooEmDestaque("AD4201");
        assertEquals("AD4201", SistemaAeroporto.getInstance().getVooEmDestaque());
    }

    @Test
    public void deveRetornarPistaAtiva() {
        SistemaAeroporto.getInstance().setPistaAtiva("Pista 02 Norte");
        assertEquals("Pista 02 Norte", SistemaAeroporto.getInstance().getPistaAtiva());
    }
}