package ejerciciosbasicosjava;

/*Escribir un programa que permita el ingreso de dos valores y con estos permita realizar las operacion suma,
resta, multiplicacion y divicion.
 */
public class Calculadora1 {
    private int Num1;
    private int Num2;
    private int Resultado;
    
    public void  Num1 (int valor ){
        this.Num1= valor;  
    }
    public void  Num2 (int valor ){
        this.Num2= valor;
}
    public int getResultado(){
        return this.Resultado;
    }
    public void Sumar(){
        this.Resultado = this.Num1 + this.Num2;
    }
    public void Restar(){
        this.Resultado = this.Num1 - this.Num2;
    }
    public void multiplicar(){
        this.Resultado = this.Num1 * this.Num2;
    }
    public void Dividir(){
        this.Resultado = this.Num1  / this.Num2;
    }
           
}
