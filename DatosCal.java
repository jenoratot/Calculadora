
import ejerciciosbasicosjava.Calculadora1;
import java.util.Scanner;
public class DatosCal {
    
    public static void main (String[]args){
        Calculadora1 C = new Calculadora1();
        Scanner sc = new Scanner (System.in);
        System.out.print("ingrese el primer numero : ");
        C.Num1(sc.nextInt());
        System.out.print("ingrese el segundo numero : ");
        C.Num2(sc.nextInt());
        C.Sumar();
        System.out.println("la suma es : " + C.getResultado());
        C.Restar();
        System.out.println("la resta es : " + C.getResultado());
        C.multiplicar();
        System.out.println("la Multiplicación es : " + C.getResultado());
        C.Dividir();
        System.out.println("la Division es : " + C.getResultado());
                        
          
    }
    
}


