package crudPersonas.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="personas")
public class Personas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  id;
    private String nombre;
    private String apellido;

    private String email;

    private String direccion;

    private  String estadoCivil;

    private String edad;


    public Personas() {
    }

    public Personas(int id, String nombre, String apellido, String email, String direccion, String estadoCivil, String edad){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.edad = edad;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
