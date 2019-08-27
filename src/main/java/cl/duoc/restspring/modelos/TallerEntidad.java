
package cl.duoc.restspring.modelos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name="taller")
public class TallerEntidad implements Serializable {
    @Id
    private int numtaller;
    @Column(name="nombre")
    private String nombre;
    @Column(name="detalle")
    private String detalle;
    @Column(name="numhoras")
    private int numhoras;
    @Column(name="cupos")
    private int cupos;

    public TallerEntidad() {
    }

    public TallerEntidad(int numtaller, String nombre, String detalle, int numhoras, int cupos) {
        this.numtaller = numtaller;
        this.nombre = nombre;
        this.detalle = detalle;
        this.numhoras = numhoras;
        this.cupos = cupos;
    }

    public int getNumtaller() {
        return numtaller;
    }

    public void setNumtaller(int numtaller) {
        this.numtaller = numtaller;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getNumhoras() {
        return numhoras;
    }

    public void setNumhoras(int numhoras) {
        this.numhoras = numhoras;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

}
