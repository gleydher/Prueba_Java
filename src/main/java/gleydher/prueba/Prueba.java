
package gleydher.prueba;

public class Prueba {
    
public static void main(String[] args) {
int a = 20, b = 10;
boolean z = false;
boolean o = true;

String x = "Operador", y ="Operador";
int ar[] = { 1, 2, 3 }; int br[] = { 1, 2, 3 };
 boolean condicion = true;
 //varios operadores condicionales
 System.out.println("a == b :" + (a ==b));
 System.out.println("a < b :" + (a < b));
 System.out.println("a <= b :" + (a <=b));
 System.out.println("a > b :" + (a > b));
 System.out.println("a >= b :" + (a >=b));
 System.out.println("a != b :" + (a != b));
 // Los Arrays no se pueden comparar con // operadores relacionales porque los objetos 
// almacenan referencias, mas no el valor
 System.out.println("x == y : " + (ar ==br));
System.out.println ("condicion==true :" +(condicion == true));

    System.out.println(z || o);
    System.out.println(z && o);

} }

        