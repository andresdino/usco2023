package EstrucutraDeControl.ciclos;


import java.util.Scanner;
public class For {

    public static void main(String[] args) {
        Scanner objTeclado = new Scanner(System.in);
        String arrNombre[] = new String[3];
        for(int contador = 0; contador <= 2; contador++){
            System.out.println("Digite su nombre: ");
            arrNombre[contador] = objTeclado.nextLine();
        }

        //foreach
        for(String valor: arrNombre){
            System.out.println("Nombre :"+ valor);
        }


    }
}
