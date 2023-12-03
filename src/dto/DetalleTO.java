package dto;

public class DetalleTO {
    int idfactura;
    int idproducto;
    double precprod;
    int cantidad;
    double importe;

    public DetalleTO() {
    }

    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public double getPrecprod() {
        return precprod;
    }

    public void setPrecprod(double precprod) {
        this.precprod = precprod;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
}
