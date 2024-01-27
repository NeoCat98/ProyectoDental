package Otros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

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

    public void LogLogIn(){
        try{
            FileWriter fw = new FileWriter("C:\\Users\\javie\\Desktop\\Ejemplo\\Admin\\Logs Login\\"+accessCode+".txt", false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(""+ultimoInicioSesion);
            bw.close();
        }
        catch(Exception E){
            JOptionPane.showMessageDialog(null,"Record Not Saved!");

        }
    }

    public void LogAccess(){
        try{
            FileWriter fw = new FileWriter("C:\\Users\\javie\\Desktop\\Ejemplo\\Admin\\Logs Access\\"+accessCode+".txt", false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(""+new Date());
            bw.close();
        }
        catch(Exception E){
            JOptionPane.showMessageDialog(null,"Record Not Saved!");

        }
    }

    public void LogEdit(){
        try{
            FileWriter fw = new FileWriter("C:\\Users\\javie\\Desktop\\Ejemplo\\Admin\\Logs Edit\\"+accessCode+".txt", false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(""+new Date());
            bw.close();
        }
        catch(Exception E){
            JOptionPane.showMessageDialog(null,"Record Not Saved!");

        }
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

    public String getultimoInicioSesion() {
        File doc = new File("C:\\Users\\javie\\Desktop\\Ejemplo\\Admin\\Logs Login\\"+accessCode+".txt");
        String line = "";
        try (Scanner obj = new Scanner(doc)) {
            while (obj.hasNextLine()) {
                line = obj.nextLine();
            }
            
        } catch (FileNotFoundException e) {

        }
        return line;
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

    public String getultimoAccesoRegistro() {
        File doc = new File("C:\\Users\\javie\\Desktop\\Ejemplo\\Admin\\Logs Access\\"+accessCode+".txt");
        String line = "";
        try (Scanner obj = new Scanner(doc)) {
            while (obj.hasNextLine()) {
                line = obj.nextLine();
            }
            
        } catch (FileNotFoundException e) {

        }
        return line;
    }

    public void setultimoAccesoRegistro(Date ultimoAccesoRegistro) {
        this.ultimoAccesoRegistro = ultimoAccesoRegistro;
    }
    public String getultimoEditadoRegistro() {
        File doc = new File("C:\\Users\\javie\\Desktop\\Ejemplo\\Admin\\Logs Edit\\"+accessCode+".txt");
        String line = "";
        try (Scanner obj = new Scanner(doc)) {
            while (obj.hasNextLine()) {
                line = obj.nextLine();
            }
            
        } catch (FileNotFoundException e) {

        }
        return line;
    }

    public void setultimoEditadoRegistro(Date ultimoEditadoRegistro) {
        this.ultimoEditadoRegistro = ultimoEditadoRegistro;
    }
    
}