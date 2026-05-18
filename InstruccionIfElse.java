import java.util.Scanner;

public class InstruccionIfElse {
    public static void main(String[] args) {
        // Creamos el objeto Scanner para leer datos del teclado
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una edad: ");
        int edad = entrada.nextInt();

        // Estructura de control para decidir según la edad
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }

        System.out.println("Adiós!");
        
        // Es buena práctica cerrar el scanner al terminar
        entrada.close();
    } // Fin del método main
} // Fin de la clase InstruccionIfElse