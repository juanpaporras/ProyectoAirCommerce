/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manejador;

/**
 *
 * @author alfar
 */
public class Persona {
    private String nombreUser, password, genero;

    public Persona(String nombreUser, String password, String genero) {
        this.nombreUser = nombreUser;
        this.password = password;
        this.genero = genero;
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombreUser=" + nombreUser + ", password=" + password + ", genero=" + genero + '}';
    }
    
    


    
}
