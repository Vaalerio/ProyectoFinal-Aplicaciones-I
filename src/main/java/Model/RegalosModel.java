package Model;

public class RegalosModel {
    private String idRegalo;
    private String nombreRegalo;
    private String descripcion;

    public RegalosModel(String idRegalo, String nombreRegalo, String descripcion) {
        this.idRegalo = idRegalo;
        this.nombreRegalo = nombreRegalo;
        this.descripcion = descripcion;
    }

    public String getIdRegalo() {
        return idRegalo;
    }

    public void setIdRegalo(String idRegalo) {
        this.idRegalo = idRegalo;
    }

    public String getNombreRegalo() {
        return nombreRegalo;
    }

    public void setNombreRegalo(String nombreRegalo) {
        this.nombreRegalo = nombreRegalo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}