package EstrucutraDeControl;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Que es un una Estructura de Control

        //Que es IF -> Pregunta -> SI/NO  True/False
        /*
        V & V = V
        V & F = F
        F & V = F
        F & F = F

        V OR V = V
        V OR F = V
        F OR V = V
        F OR F = F

        if(condicion){

        }

        * */

        Scanner objConsola = new Scanner(System.in);
/*
        int a = 10;

        if(a == 10){
            System.out.println("Son iguales");
        }


        if(a != 10 & a == 10){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son diferentes");
        }
*/
        System.out.println("Digite el Día");
        String dias = objConsola.nextLine();

        if(dias.equals("Lunes")){
            System.out.println("Inicio de semamana");
        }else if(dias.equals("Martes")){
            System.out.println("Hos es: " + dias);
        }else if(dias.equals("Miercoles")){
            System.out.println("Hos es: " + dias);
        }else{
            System.out.println("Dia seleccionado no corresponde");
        }


        switch (dias){
            case "Lunes": System.out.println("Hos es: " + dias);
                break;
            case "Martes":System.out.println("Hos es: " + dias);
                break;
            case "Miercoles": System.out.println("Hos es: " + dias);
                break;
            default: System.out.println("Dia seleccionado no corresponde");
        }


    }
}
