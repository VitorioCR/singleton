package Test;


import Singleton.SistemaHospital;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SistemaHospitalTest {

    @Test
    public void deveRetornarNomeHospital() {
        SistemaHospital.getInstance().setNomeHospital("Hospital 1");
        assertEquals("Hospital 1", SistemaHospital.getInstance().getNomeHospital());
    }

    @Test
    public void deveRetornarMedicoLogado() {
        SistemaHospital.getInstance().setMedicoLogado("Dr. João");
        assertEquals("Dr. João", SistemaHospital.getInstance().getMedicoLogado());
    }

    @Test
    public void deveRetornarPacienteAtendido() {
        SistemaHospital.getInstance().setPacienteAtendido("Maria Silva");
        assertEquals("Maria Silva", SistemaHospital.getInstance().getPacienteAtendido());
    }

    @Test
    public void deveRetornarDepartamentoAtivo() {
        SistemaHospital.getInstance().setDepartamentoAtivo("Cardiologia");
        assertEquals("Cardiologia", SistemaHospital.getInstance().getDepartamentoAtivo());
    }
}