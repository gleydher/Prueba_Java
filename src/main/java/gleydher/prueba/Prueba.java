
package gleydher.prueba;

public class Prueba {
    
 public static void main (String [] args) {
// definición de cada una de las variables
int a = 20, b = 10, c = 0, d = 20, e = 40, f =30;
    boolean condition = true;
System.out.println("Valor de a inicial = "+ a);

 // operador de pre-incremento
 // a = a+1 y entonces c = a;
 c = ++a;
System.out.println("Valor de c preincremento(++a) = " + c);

 // operador de post-incremento
 // c=b entonces b=b+1 (b pasa a ser 11)
 c = b++;
 System.out.println("Valor de c postincremento(b++) = " + c);
 
 // operador de pre-decremento
 // d=d-1 entonces c=d
 c = --d;
System.out.println("Valor de c predecremento (--d) = " + c);

 // operador de post-decremento
 // c=e entonces e=e-1 (e pasa aser 39)
 c = e--;
System.out.println("Valor de c postdecremento(e--) = " + c);
 // Operador lógico not
 
System.out.println("Valor de !condition =" + !condition);

    }
    
}
