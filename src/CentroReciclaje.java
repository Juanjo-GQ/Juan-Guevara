import java.util.Scanner;

public class CentroReciclaje {
    final double MIN_CARGAS = 3.0;
     final double MAX_CARGAS = 20.0;
     final double MIN_PESO = 5.0;
    final double MAX_PESO = 200.0;
    final double LIMITE_CLASIFICACION = 80.0;
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner (System.in);







    }

    public static int leerCantidad(Scanner leer, int min, int max) {
            int n;
            do {
                System.out.print("Ingrese la cantidad de cargas (" + min + " a " + max + "): ");
                n = leer.nextInt();
                
                if (n >= min && n <= max) {
                } else {
                    System.out.println("Error: La cantidad de cargas debe estar entre " + min + " y " + max + ".");
                }
            } while (n < min || n > max);
            
            return n;
    }
     public static boolean pesoValido(double peso, double min, double max) {
        if (peso >= min && peso <= max) {
            return true;
        } else {
            return false;
        }
    }

    
        public static void cargarPesos(double[] pesos, Scanner leer, double min, double max) {
        System.out.println(" INGRESO DE PESOS");
        for (int i = 0; i < pesos.length; i++) {
            int pesoIngresado;
            do {
                System.out.print("Carga " + (i + 1) + " en kg (" + min + " a " + max + "): ");
                pesoIngresado = leer.nextInt();
                
                if (pesoValido(pesoIngresado, min, max)) {
                    pesos[i] = pesoIngresado;
                } else {
                    System.out.println("Error: El peso ingresado no es valido. Intente nuevamente.");
                }
            } while (pesoValido(pesoIngresado, min, max) == false);
        }
    }

    public static double calcularTotal(double[] pesos) {
        double suma = 0;
        for (int i = 0; i < pesos.length; i++) {
            suma = suma + pesos[i];
        }
        return suma;
        }

    public static int primerRango(int[] pesos, int min, int max) {
        int cant = 0;
        for (int i = 0; i < pesos.length; i++) {
            if (pesos[i] >= min && pesos[i] <= max) {
                cant++;
            }
        }
        return cant;
    }
       public static double calcularPromedio(int suma, int n) {
        return (double) suma / n;
    }

    public static double encontrarMayor(double[] pesos){
        


    }








    





}
