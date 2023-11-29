package dto;

public class ProductoTO {
    int idproducto;
    String nombprod;
    double precprod;
    String obsvprod;
    String fotoprod;

    public ProductoTO(int idproducto, String nombprod, double precprod, String obsvprod) {
        this.idproducto = idproducto;
        this.nombprod = nombprod;
        this.precprod = precprod;
        this.obsvprod = obsvprod;
    }

    public ProductoTO() {
    }

    public String getFotoprod() {
        return fotoprod;
    }

    public void setFotoprod(String fotoprod) {
        this.fotoprod = fotoprod;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombprod() {
        return nombprod;
    }

    public void setNombprod(String nombprod) {
        this.nombprod = nombprod;
    }

    public double getPrecprod() {
        return precprod;
    }

    public void setPrecprod(double precprod) {
        this.precprod = precprod;
    }

    public String getObsvprod() {
        return obsvprod;
    }

    public void setObsvprod(String obsvprod) {
        this.obsvprod = obsvprod;
    }
    
}
