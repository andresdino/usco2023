package EstrucutraDeControl.ciclos;



import java.util.Scanner;
public class CicloWhile {

    public static void main(String[] args) {
        //Un ciclo es una estructura de contro
        //While -> Mientras

        /*
            While(condición){
            cuerpo del ciclo cuando se cumple la
            la condicion

            Incremento o algo que me defina el final del ciclo

            }


        var contador = 0;
        while(contador < 10){
            System.out.println(contador);
            contador++;
        }* */

        String[] arrNombre = new String[3];
        Scanner objTeclado = new Scanner(System.in);

        int contador = 0;

        while(contador <=2){
            System.out.println("Digite el nombre");
            String nm =  objTeclado.nextLine();
            arrNombre[contador] = nm;
            contador++;
        }
        contador = 0;

        while(contador <= 2){
            System.out.println("Nombre :"+ contador + " " + arrNombre[contador]);
            contador++;
        }

















    }
}
