package POO;

public class Persona {
    //Atributos
    //Caracteristicas o descripcion
    String nombre;
    Integer edad;
    String Direccion;

    //Metodos
    //Acciones - Son lo que se encargan de manipular los datos
    //de los atributos.
    public void imprimirDatos(String nm, int age, String dir){
        this.Direccion = dir;
        this.nombre = nm;
        this.edad = age;
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Direccion: "+ this.Direccion);

    }
}
