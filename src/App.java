public class App {
    final int MIN_CARGAS = 3;
     final int MAX_CARGAS = 20;
     final int MIN_PESO = 5;
    final int MAX_PESO = 200;
    final int LIMITE_CLASIFICACION = 80;
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);


    }
    public static int leerCantidad(Scanner scanner, int min, int max) {
            int n;
            do {
                System.out.print("Ingrese la cantidad de cargas (" + min + " a " + max + "): ");
                n = scanner.nextInt();
                
                if (n >= min && n <= max) {
                    // Entrada correcta, no requiere mensaje de error
                } else {
                    System.out.println("Error: La cantidad de cargas debe estar entre " + min + " y " + max + ".");
                }
            } while (n < min || n > max);
            
            return n;
    }

}
