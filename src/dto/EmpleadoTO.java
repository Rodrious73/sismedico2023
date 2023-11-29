package dto;

public class EmpleadoTO {

    private int idempleado;
    private String nombempl;
    private String apatempl;
    private String amatempl;
    private String sexoempl;
    private String direempl;
    private int iddistrito;
    private String telfempl;
    private String celuempl;
    private String emaiempl;
    private String obsvempl;
    private String fotoempl;

    public EmpleadoTO() {
    }

    public EmpleadoTO(int idempleado, String nombempl, String apatempl, String amatempl, String sexoempl, String direempl, int iddistrito, String telfempl, String celuempl, String emaiempl, String obsvempl, String fotoempl) {
        this.idempleado = idempleado;
        this.nombempl = nombempl;
        this.apatempl = apatempl;
        this.amatempl = amatempl;
        this.sexoempl = sexoempl;
        this.direempl = direempl;
        this.iddistrito = iddistrito;
        this.telfempl = telfempl;
        this.celuempl = celuempl;
        this.emaiempl = emaiempl;
        this.obsvempl = obsvempl;
        this.fotoempl = fotoempl;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getNombempl() {
        return nombempl;
    }

    public void setNombempl(String nombempl) {
        this.nombempl = nombempl;
    }

    public String getApatempl() {
        return apatempl;
    }

    public void setApatempl(String apatempl) {
        this.apatempl = apatempl;
    }

    public String getAmatempl() {
        return amatempl;
    }

    public void setAmatempl(String amatempl) {
        this.amatempl = amatempl;
    }

    public String getSexoempl() {
        return sexoempl;
    }

    public void setSexoempl(String sexoempl) {
        this.sexoempl = sexoempl;
    }

    public String getDireempl() {
        return direempl;
    }

    public void setDireempl(String direempl) {
        this.direempl = direempl;
    }

    public int getIddistrito() {
        return iddistrito;
    }

    public void setIddistrito(int iddistrito) {
        this.iddistrito = iddistrito;
    }

    public String getTelfempl() {
        return telfempl;
    }

    public void setTelfempl(String telfempl) {
        this.telfempl = telfempl;
    }

    public String getCeluempl() {
        return celuempl;
    }

    public void setCeluempl(String celuempl) {
        this.celuempl = celuempl;
    }

    public String getEmaiempl() {
        return emaiempl;
    }

    public void setEmaiempl(String emaiempl) {
        this.emaiempl = emaiempl;
    }

    public String getObsvempl() {
        return obsvempl;
    }

    public void setObsvempl(String obsvempl) {
        this.obsvempl = obsvempl;
    }

    public String getFotoempl() {
        return fotoempl;
    }

    public void setFotoempl(String fotoempl) {
        this.fotoempl = fotoempl;
    }

}
