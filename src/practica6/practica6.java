/*Evelyn Esmeralda Patricio Rodriguez
Practica 6 PseInt a NetBeans.
Este programa se realizo con la intencion de ayudarte a determinar cual de los numeros ingresados es el menor
01-11-2023
*/
package practica6;
import java.io.*;
public class practica6 {
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int b;
		int c;
		System.out.println("Ingresa 3 numeros al azar");
		a = Integer.parseInt(bufEntrada.readLine());
		b = Integer.parseInt(bufEntrada.readLine());
		c = Integer.parseInt(bufEntrada.readLine());
		if (a!=b && a!=c && b!=c) {
			if (a<b) {
				if (a<c) {
					System.out.println("El numero menor es: "+a);
				} else {
					System.out.println("El numero menor es: "+c);
				}
			} else {
				if (b<c) {
					System.out.println("El numero mayor es: "+b);
				} else {
					System.out.println("El numero mayor es: "+c);
				}
			}
		} else {
			System.out.println("Ingresa 3 numeros diferentes");
		}
	}
}