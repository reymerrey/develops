package notas;

import java.util.Scanner;

public class Promedio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int mejorNota = 0;

        System.out.println("Introduce las 4 notas del alumno:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            int nota = scanner.nextInt();
            if (nota > mejorNota) {
                mejorNota = nota;
            }
        }

        System.out.println("La mejor nota es: " + mejorNota);
        System.out.println("GRACIAS ");
        scanner.close();
	}

}
