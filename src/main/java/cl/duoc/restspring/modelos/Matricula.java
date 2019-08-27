
package cl.duoc.restspring.modelos;

public class Matricula {
    private int nummat;
    private String rut;
    private String dv;
    private String paterno;
    private String materno;
    private String nombre;
    private String email;
    private int numtaller;

    public Matricula() {
    }

    public Matricula(int nummat, String rut, String dv, String paterno, String materno, String nombre, String email, int numtaller) {
        this.nummat = nummat;
        this.rut = rut;
        this.dv = dv;
        this.paterno = paterno;
        this.materno = materno;
        this.nombre = nombre;
        this.email = email;
        this.numtaller = numtaller;
    }

    public int getNummat() {
        return nummat;
    }

    public void setNummat(int nummat) {
        this.nummat = nummat;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumtaller() {
        return numtaller;
    }

    public void setNumtaller(int numtaller) {
        this.numtaller = numtaller;
    }
    
    
    
    
}
