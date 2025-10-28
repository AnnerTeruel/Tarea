package Clases;

public class EjerciciosForHechizo {
    ForHechizo forHechizo = new ForHechizo();

    //Imprime los numeros del 1 al 100
    public void Ejercicio1(int limite, int inicio){
        System.out.println("Numeros del 1 al 100:");
        forHechizo.Ejercicio1(limite, inicio);
    }

    //Suma los numeros del 1 al 50
    public void Ejercicio2(int n, int acumulador){
        System.out.println("Suma de los numeros del 1 al 50:");
        forHechizo.Ejercicio2(n, acumulador);
    }

    //Tablas de multiplicacion del numero que ingrese el usuario
    public void Ejercicio3(int nb, int i){
        System.out.println("Tabla de multiplicar del "+nb+":");
        forHechizo.Ejercicio3(nb, i);
    }

    //Multiplica los numeros del 1 al 50 y imprime el resultado
    public void Ejercicio4(int i, int limite){
        System.out.println("Multiplica los numeros del 1 al 50 y imprime el resultado:");
        forHechizo.Ejercicio4(i, limite);
    }

    //Calcula el factorial del numero ingresado
    public void Ejercicio5(int n, long resultadoAcumulado, int numOriginal){
        System.out.println("El factorial del numero ingresado:");
        forHechizo.Ejercicio5(n, resultadoAcumulado, numOriginal);
    }
}
