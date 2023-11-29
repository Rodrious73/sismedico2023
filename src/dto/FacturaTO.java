package dto;

public class FacturaTO {
    int idfactura;
    int idcliente;
    int idempleado;	
    double stotfact;	
    double igvfact;	
    double totafact;

    public FacturaTO() {
    }

    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
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
}
