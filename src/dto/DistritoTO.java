package dto;

public class DistritoTO {
    int iddistrito;
    String nombdist;
    String obsvdist;

    public DistritoTO(int iddistrito, String nombdist, String obsvdist) {
        this.iddistrito = iddistrito;
        this.nombdist = nombdist;
        this.obsvdist = obsvdist;
    }

    public DistritoTO() {
    }

    public int getIddistrito() {
        return iddistrito;
    }

    public void setIddistrito(int iddistrito) {
        this.iddistrito = iddistrito;
    }

    public String getNombdist() {
        return nombdist;
    }

    public void setNombdist(String nombdist) {
        this.nombdist = nombdist;
    }

    public String getObsvdist() {
        return obsvdist;
    }

    public void setObsvdist(String obsvdist) {
        this.obsvdist = obsvdist;
    }
    
    
}
