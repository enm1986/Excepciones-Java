/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author navar
 */
public class Exepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("División de números");
        int num;
        int den;
        try {
            num = pedirNumero("numerador");
            den = pedirNumero("denominador");
            System.out.println("La división es: " + dividir(num, den));
        } catch (InputMismatchException e) {
            System.out.println("No has introducido un número entero");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        } catch (DividirPorZeroException e) {
            System.out.println("División por 0");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
        System.out.println("Fin del programa");
    }

    public static int pedirNumero(String tipo) throws InputMismatchException {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el " + tipo + ": ");
        return leer.nextInt();
    }

    public static int dividir(int num, int den) throws DividirPorZeroException {
        if (den == 0) {
            throw new DividirPorZeroException("Has dividido por 0, muy bien campeón");
        }
        return (num / den);
    }

}
