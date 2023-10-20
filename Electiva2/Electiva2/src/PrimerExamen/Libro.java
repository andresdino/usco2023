package PrimerExamen;

public class Libro {

    //camelCase
    public String tituloLibro;
    public String autorLibro;
    public int paginas;
    public boolean disponible;


    public void prestar(){
        if(this.disponible){
            this.disponible = false;
        }else{
            System.out.println("El libro no está disponible para préstamo");
        }
    }

    public void devolver(){
        //this.disponible es false
        if(!this.disponible){
            this.disponible = true;
        }else{
            System.out.println("El libro ya esta disponible");
        }
    }

    public void informacion(){

        System.out.println("Titulo Libro: "+ this.tituloLibro);
        System.out.println("Autor Libro: "+ this.autorLibro);
        System.out.println("No Paginas Libro: "+ this.paginas);
        System.out.println("Disponible?: "+ this.disponible);

    }


}
