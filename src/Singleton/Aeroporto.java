package Singleton;

public class SistemaHospital {
    private SistemaHospital() {};
    private static SistemaHospital instance = new SistemaHospital();

    public static SistemaHospital getInstance() {
        return instance;
    }

    private String nomeHospital;
    private String medicoLogado;
    private String pacienteAtendido;
    private String departamentoAtivo;

    public String getNomeHospital() {
        return nomeHospital;
    }
    public void setNomeHospital(String nomeHospital) {
        this.nomeHospital = nomeHospital;
    }

    public String getMedicoLogado() {
        return medicoLogado;
    }
    public void setMedicoLogado(String medicoLogado) {
        this.medicoLogado = medicoLogado;
    }

    public String getPacienteAtendido() {
        return pacienteAtendido;
    }
    public void setPacienteAtendido(String pacienteAtendido) {
        this.pacienteAtendido = pacienteAtendido;
    }

    public String getDepartamentoAtivo() {
        return departamentoAtivo;
    }
    public void setDepartamentoAtivo(String departamentoAtivo) {
        this.departamentoAtivo = departamentoAtivo;
    }
}