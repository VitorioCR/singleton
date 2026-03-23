package Singleton;

public class SistemaAeroporto {
    private SistemaAeroporto() {};

    private static SistemaAeroporto instance = new SistemaAeroporto();

    public static SistemaAeroporto getInstance() {
        return instance;
    }

    private String nomeAeroporto;
    private String operadorLogado;
    private String vooEmDestaque;
    private String pistaAtiva;

    public String getNomeAeroporto() {
        return nomeAeroporto;
    }
    public void setNomeAeroporto(String nomeAeroporto) {
        this.nomeAeroporto = nomeAeroporto;
    }

    public String getOperadorLogado() {
        return operadorLogado;
    }
    public void setOperadorLogado(String operadorLogado) {
        this.operadorLogado = operadorLogado;
    }

    public String getVooEmDestaque() {
        return vooEmDestaque;
    }
    public void setVooEmDestaque(String vooEmDestaque) {
        this.vooEmDestaque = vooEmDestaque;
    }

    public String getPistaAtiva() {
        return pistaAtiva;
    }
    public void setPistaAtiva(String pistaAtiva) {
        this.pistaAtiva = pistaAtiva;
    }
}