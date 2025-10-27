package Clases;

public class ForHechizo {
    


    //Imprime los numeros del 1 al 100
    public void Ejercicio1(int limite, int inicio){
        System.out.println(inicio);
        if(inicio>=limite){
            return;
        }
        Ejercicio1(limite, inicio+1);
    }

    //Suma los numeros del 1 al 50
    public void  Ejercicio2(int n, int acumulador) {
        if(n==0){
            System.out.println(acumulador);
            return;
        }
        
        Ejercicio2(n-1, acumulador+n);
        
    }


    //Tablas de multiplicacion del numero que ingrese el usuario
    public void Ejercicio3(int nb, int i){
        if(i>10){
            return;
        }

        System.out.println(i+" x "+nb+" = "+(i*nb));
        Ejercicio3(nb, i+1);
    }

    //Multiplica los numeros del 1 al 50 y imprime el resultado
    public  void Ejercicio4(int i, int limite) {
        
        
        if (i > limite) {
            return;
        }

        
        System.out.println(i * 2);

        
        Ejercicio4(i + 1, limite);
    }

    //Calcula el factorial del numero ingresado
    public  void Ejercicio5(int n, long resultadoAcumulado, int numOriginal) {
        
        
        if (n == 0) {
            
            System.out.println("El factorial de " + numOriginal + " es: " + resultadoAcumulado);
            return;
        }

        
        Ejercicio5(n - 1, resultadoAcumulado * n, numOriginal);
    }

}
