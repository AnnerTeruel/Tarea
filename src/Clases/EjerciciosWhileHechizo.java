package Clases;

public class EjerciciosWhileHechizo {
    WhileHechizo whileHechizo = new WhileHechizo();

    //Ejercicio 1: Contador Recursivo
    public void Ejercicio1(int contador){
        System.out.println("Contador Recursivo");
        whileHechizo.Ejercicio1(contador);
    }

    //Ejercicio 2: Suma con Limite Recursiva
    public void Ejercicio2(int sumaActual, int numero, int LIMITE){
        System.out.println("Suma con Limite Recursiva");
        whileHechizo.Ejercicio2(sumaActual, numero, LIMITE);
    }

    //Ejercicio 3: Conteo Regresivo Recursivo
    public void Ejercicio3(int cuentaAtras){
        System.out.println("Conteo Regresivo Recursivo");
        whileHechizo.Ejercicio3(cuentaAtras);
    }

    //Ejercicio 4: Detener por Mutiplo de 3
    public void Ejercicio4(int i){
        System.out.println("Detener por Mutiplo de 3");
        whileHechizo.Ejercicio4(i);
    }

    //Ejercicio 5: Impresion de Pares Recursivo
    public void Ejercicio5(int numeroActual, int paresImpresos){
        System.out.println("Impresion de Pares Recursivo");
        whileHechizo.Ejercicio5(numeroActual, paresImpresos);
    }
}
