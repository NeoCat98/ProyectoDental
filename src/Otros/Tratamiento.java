package Otros;

public class Tratamiento {
    Double monto;
    String nombre;
    Integer id;
    Boolean activo;

    public Tratamiento(){}

    public Tratamiento(Double monto, String nombre, Integer id, Boolean activo){
        this.monto = monto;
        this.nombre = nombre;
        this.id = id;
        this.activo = activo;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    
    
}
