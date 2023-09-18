package arreglos;

public class arrUnidimensionales {
    public static void main(String[] args) {
      /*  int edadEstudiantes[] = new int[3];
        edadEstudiantes[2] = 20;
        System.out.println(edadEstudiantes[0]);
        System.out.println(edadEstudiantes[1]);
        System.out.println(edadEstudiantes[2]);

        //Ejericio en clase
        //Cargar un arregle de 8 pos y luego adicionar valores
        */
        int operaciones[] = new int[8];

        operaciones[0] = 2;
        operaciones[1] = 47;
        operaciones[2] = 20;
        operaciones[3] = 4;
        operaciones[4] = 96;
        operaciones[5] = 8;
        operaciones[6] = 10;
        operaciones[7] = 2;

        int suma = operaciones[0] + operaciones[1];
        System.out.println("La suma es: " + suma);

        int resta = operaciones[2] - operaciones[3];
        System.out.println("La resta es: " + resta);

        int multipli = operaciones[4] * operaciones[5];
        System.out.println("La multipli es: " + multipli);

        int divi =  operaciones[6] / operaciones[7];
        System.out.println("La divi es: " + divi);




    }
}
