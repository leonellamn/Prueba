public class Ejercicio {

        public static void main(String[] args) {
            int arreglo[] = {10, 12, 15, 20};
            double suma = 0;

            for (int i = 0; i < arreglo.length; i++) {
                suma = suma + arreglo[i];
            }
            System.out.println("Promedio de notas: " + suma / arreglo.length);
        }
    }




