/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversortemperatura;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("CONVERSOR DE TEMPERATURA");
        System.out.println("-----------------------");
        System.out.print("Digite a temperatura em Celsius: ");
        
        double celsius = scanner.nextDouble();
        
        // Conversão para Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;
        
        // Conversão para Kelvin
        double kelvin = celsius + 273.15;
        
        System.out.println("\nResultados das conversões:");
        System.out.printf("Celsius: %.2f °C%n", celsius);
        System.out.printf("Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Kelvin: %.2f K%n", kelvin);
        
        scanner.close();
    }
}
    

