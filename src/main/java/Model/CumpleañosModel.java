package Model;

import java.util.Date;

public class CumpleañosModel {
    private String idPersona;
    private Date fechaCumpleaños;

    public CumpleañosModel(String idPersona, Date fechaCumpleaños) {
        this.idPersona = idPersona;
        this.fechaCumpleaños = fechaCumpleaños;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public Date getFechaCumpleaños() {
        return fechaCumpleaños;
    }

    public void setFechaCumpleaños(Date fechaCumpleaños) {
        this.fechaCumpleaños = fechaCumpleaños;
    }

}