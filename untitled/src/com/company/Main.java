//Primera parte:
//Crear una función con tres parámetros que sean números que se suman entre sí.
//Llamar a la función en el main y darle valores.
/*Segunda parte:
* Crear una clase coche.
 Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
*Crear un objeto miCoche en el main y añadirle una puerta.
*Mostrar el número de puertas que tiene el objeto.*/
package com.company;

public class Main {
    public static void main(String[] args) {
        suma(10,30,20);
        Coche miCoche = new Coche();
        miCoche.ContarPuertas();
        System.out.println("Segunda parte: numero de puertas= " + miCoche.puertas);
    }
    public static void suma(int a, int b,int c) {
        int resultado;
        resultado = a + b + c;
        System.out.println("Primera parte: Suma de tres numeros= "+resultado);
        }
    }
class Coche{
    public int puertas =0;

    public void ContarPuertas(){
        this.puertas++;
    }

}
