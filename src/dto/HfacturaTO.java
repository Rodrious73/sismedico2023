package dto;

public class HfacturaTO {
    int idfactura;
    String fechfact;
    int idcliente;
    int idempleado;
    double stotfact;
    double igvfact;
    double totafact;
    int estafact;
    String transa;
    String usuario;
    String fechahora;

    public HfacturaTO() {
    }

    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }

    public String getFechfact() {
        return fechfact;
    }

    public void setFechfact(String fechfact) {
        this.fechfact = fechfact;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public double getStotfact() {
        return stotfact;
    }

    public void setStotfact(double stotfact) {
        this.stotfact = stotfact;
    }

    public double getIgvfact() {
        return igvfact;
    }

    public void setIgvfact(double igvfact) {
        this.igvfact = igvfact;
    }

    public double getTotafact() {
        return totafact;
    }

    public void setTotafact(double totafact) {
        this.totafact = totafact;
    }

    public int getEstafact() {
        return estafact;
    }

    public void setEstafact(int estafact) {
        this.estafact = estafact;
    }

    public String getTransa() {
        return transa;
    }

    public void setTransa(String transa) {
        this.transa = transa;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFechahora() {
        return fechahora;
    }

    public void setFechahora(String fechahora) {
        this.fechahora = fechahora;
    }
    
}
