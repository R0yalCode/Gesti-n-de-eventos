public class Direccion {
    private String callePrincipal;
    private String calleSecundaria;
    private String referencia;

    // Constructor
    public Direccion(String callePrincipal, String calleSecundaria, String referencia) {
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.referencia = referencia;
    }

    // Getters y Setters
    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
