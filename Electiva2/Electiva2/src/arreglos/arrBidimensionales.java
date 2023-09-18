package arreglos;

public class arrBidimensionales {

    public static void main(String[] args) {
        int operaciones[][] = new int[2][2];
        operaciones[0][0] = 20;
        operaciones[0][1] = 30;
        operaciones[1][0] = 40;
        operaciones[1][1] = 60;

        String producto[][]= {
                {"tomate", "3000"},
                {"limon", "2000"},
                {"papa", "1000"}
        };

        System.out.println(producto[2][0]+ " " + producto[2][1]);


        String productosSocios[][][] =
                {
                        {
                                {"1L leche","1.00 d�lares"},
                                {"Galletas","0.75 d�lares"},
                                {"1Kg Az�car","1.25 d�lares"}
                        },
                        {
                                {"1L Crema","1.75 d�lares"},
                                {"1 Lata de chiles","1.35 d�lares"},
                                {"1 Paleta de hielo","1.40 d�lar"}
                        },
                        {
                                {"1 Paleta de caramelo","0.85 d�lares"},
                                {"1 Paquete de vasos","2.5 d�lares"},
                                {"1Kg Arroz","2.25 d�lares"}
                        }
                };






    }
}
