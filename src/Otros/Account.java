package Otros;

import java.util.Date;
import java.util.Random;

public class Account {
    Random genCode = new Random();
    String name;
    int accessCode = genCode.nextInt(1000,9999);
    boolean specialAccess = false;
    Date ultimoInicioSesion;
    Date ultimoAccesoRegistro;
    Date ultimoEditadoRegistro;

    public Account(){}

    public Account(String name,int accessCode, boolean specialAccess){
        this.name = name;
        this.accessCode = accessCode;
        this.specialAccess = specialAccess;
        Date fecha = new Date();
        this.ultimoInicioSesion = fecha;
        System.out.println(fecha);
    }

    public void DisplayNuAccount(){
        System.out.println("Access code of employee " + name + " is: " + accessCode);
    }

    public void priority(){
        specialAccess = true;
    }

    public Random getGenCode() {
        return genCode;
    }

    public void setGenCode(Random genCode) {
        this.genCode = genCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getultimoInicioSesion() {
        return ultimoInicioSesion;
    }

    public void setultimoInicioSesion(Date ultimoInicioSesion) {
        this.ultimoInicioSesion = ultimoInicioSesion;
    }

    public int getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(int accessCode) {
        this.accessCode = accessCode;
    }

    public boolean isSpecialAccess() {
        return specialAccess;
    }

    public void setSpecialAccess(boolean specialAccess) {
        this.specialAccess = specialAccess;
    }  

    public Date getultimoAccesoRegistro() {
        return ultimoAccesoRegistro;
    }

    public void setultimoAccesoRegistro(Date ultimoAccesoRegistro) {
        this.ultimoAccesoRegistro = ultimoAccesoRegistro;
    }
    public Date getultimoEditadoRegistro() {
        return ultimoEditadoRegistro;
    }

    public void setultimoEditadoRegistro(Date ultimoEditadoRegistro) {
        this.ultimoEditadoRegistro = ultimoEditadoRegistro;
    }
    
}