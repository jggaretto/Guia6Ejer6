
package guia6ejer6;


class A {
    public void metodoA() {
        System.out.println("sentencia_a1");
        System.out.println("sentencia_a2");
        try {
            System.out.println("sentencia_a3");
            System.out.println("sentencia_a4");
            throw new MioException(); // Simulamos la generación de la excepción MioException
        } catch (MioException e) {
            System.out.println("sentencia_a6");
        }
        System.out.println("sentencia_a5");
    }
}
