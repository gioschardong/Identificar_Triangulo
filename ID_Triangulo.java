import java.util.Scanner;

public class ID_Triangulo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("\n=-=-=-=--=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-");
        System.out.println("    PROGRAMA PARA IDENTIFICAR TRIANGULOS");
        System.out.println("=-=-=-=--=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-\n");

        System.out.println("Insira os Valores das Laterais: ");
        System.out.print("Primeira lateral: ");
        double Lado1 = in.nextDouble();
        System.out.print("Segunda lateral: ");
        double Lado2 = in.nextDouble();
        System.out.print("Terceira lateral: ");
        double Lado3 = in.nextDouble();

        if ((Lado1 < Lado2 + Lado3) && (Lado2 < Lado1 + Lado3) && (Lado3 < Lado1 + Lado2)) {
            if (Lado1 == Lado2 && Lado1 == Lado3) {
                System.out.println("\nTriangulo Equilatero");
            } else if ((Lado1 == Lado2) || (Lado1 == Lado3)) {
                System.out.println("\nTriangulo Isosceles");
            } else if ((Lado1 != Lado2) && (Lado1 != Lado3) && (Lado2 != Lado3)) {
                System.out.println("\nTriângulo Escaleno");
            } else {
                System.out.println("\nNão é um triangulo!");
            }
        }
    }
}