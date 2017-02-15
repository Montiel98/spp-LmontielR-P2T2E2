
package spp.lmontielr.p2t2e2;
import java.util.Scanner;
public class SppLmontielRP2T2E2 {

    public static void main(String[] args) {
           System.out.println("Bienvenido!");
        op();
        
        
        
    }
static int data(String valor){
    Scanner dato = new Scanner (System.in);
    
    System.out.print("Ingrese " + valor + ": ");
    int datos = dato.nextInt();
    
    return datos;
}  
static void div(int valor){
    if ((valor%2)==0){
        System.out.println(valor+" es un número par.");
    } if ((valor%3)==0){
          System.out.println(valor+" es un número divisible entre 3.");
        } if ((valor%5)==0) {
            System.out.println(valor+" es un número divisible entre 5.\n");
            } else {}
}
static void op(){
    int valinf = data("valor inferior");
    int valsup = data("valor superior");
    int count = valinf - 1;
    System.out.println("Los valores entre "+valinf+" y "+valsup+" son: ");
    while (count < valsup){
        System.out.println(count=count+1);
    }System.out.println("");
    div(valinf);
    div(valsup);
    
}

}
