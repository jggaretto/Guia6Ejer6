/*
En java, dado el método metodoA de la clase A, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la
excepción MioException?

class A{
public void metodoA(){
	sentencia_a1
	sentencia_a2
try{
	sentencia_a3
	sentencia_a4
}catch(MioException e){
	sentencia_a6
}
	sentencia_a5
}
}

a) Si se produce la excepción MioException, las sentencias se ejecutarán en el siguiente orden:

sentencia_a1
sentencia_a2
sentencia_a3
sentencia_a4
sentencia_a6
sentencia_a5
La excepción MioException es capturada por el bloque catch y se ejecuta la sentencia_a6. Después de manejar la excepción, el flujo continúa con la sentencia_a5.

b) Si no se produce la excepción MioException, las sentencias se ejecutarán en el siguiente orden:

sentencia_a1
sentencia_a2
sentencia_a3
sentencia_a4
sentencia_a5
En este caso, como no se lanza la excepción MioException, el flujo continúa sin entrar al bloque catch y se ejecuta la sentencia_a5 directamente después de la sentencia_a4
 */
package guia6ejer6;


public class Guia6Ejer6 {

   public static void main(String[] args) {
        A instanciaA = new A();
        
        System.out.println("Ejecución con excepción MioException:");
        instanciaA.metodoA();
        
        System.out.println("\nEjecución sin excepción MioException:");
        instanciaA.metodoA();
    }
}
