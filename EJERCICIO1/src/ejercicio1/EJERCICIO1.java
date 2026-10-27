package ejercicio1;
// Importamos Arrays para poder mostrar los arreglos
import java.util.Arrays;

// Creamos nuestra clase principal
public class EJERCICIO1 {

    // Aquí comienza nuestro programa
    public static void main(String[] args) {

        // Creamos un arreglo con 5 números desordenados
        int[] numeros = {8, 5, 9, 6, 7};

        // Mostramos los números originales
        System.out.println("Numeros originales: "
                + Arrays.toString(numeros));

        // ALGORITMO BURBUJA

        // Hacemos una copia de los números originales
        int[] burbuja = numeros.clone();

        // Este ciclo sirve para repetir las comparaciones
        for (int i = 0; i < burbuja.length - 1; i++) {

            // Recorremos los números para compararlos
            for (int j = 0; j < burbuja.length - 1 - i; j++) {

                // Revisamos si un número es mayor que el siguiente
                if (burbuja[j] > burbuja[j + 1]) {

                    // Guardamos el primer número temporalmente
                    int aux = burbuja[j];

                    // Ponemos el número menor en la primera posición
                    burbuja[j] = burbuja[j + 1];

                    // Colocamos el otro número en la siguiente posición
                    burbuja[j + 1] = aux;

                } // Cerramos la condición

            } // Cerramos el segundo ciclo

        } // Cerramos el primer ciclo

        // Mostramos los números ordenados
        System.out.println("Burbuja: "
                + Arrays.toString(burbuja));

        // Mostramos la complejidad del algoritmo
        System.out.println("Complejidad: O(n^2)");


        // ALGORITMO INSERCION

        // Hacemos otra copia de los números originales
        int[] insercion = numeros.clone();

        // Empezamos desde el segundo número
        for (int i = 1; i < insercion.length; i++) {

            // Guardamos el número que vamos a acomodar
            int actual = insercion[i];

            // Tomamos la posición anterior
            int j = i - 1;

            // Comparamos el número actual con los anteriores
            while (j >= 0 && insercion[j] > actual) {

                // Movemos el número mayor hacia la derecha
                insercion[j + 1] = insercion[j];

                // Retrocedemos una posición
                j--;

            } // Cerramos el ciclo while

            // Colocamos el número en su lugar correcto
            insercion[j + 1] = actual;

        } // Cerramos el ciclo for

        // Mostramos los números ordenados
        System.out.println("Insercion: "
                + Arrays.toString(insercion));

        // Mostramos su complejidad
        System.out.println("Complejidad: O(n^2)");


        // ALGORITMO QUICKSORT

        // Copiamos nuevamente los números originales
        int[] quick = numeros.clone();

        // Llamamos al método para ordenar los números
        quickSort(quick, 0, quick.length - 1);

        // Mostramos el resultado del ordenamiento
        System.out.println("QuickSort: "
                + Arrays.toString(quick));

        // Mostramos la complejidad promedio
        System.out.println("Complejidad promedio: O(n log n)");


        // BUSQUEDA LINEAL

        // Elegimos el número que queremos encontrar
        int buscar = 9;

        // Ponemos -1 porque todavía no encontramos el número
        int posicion = -1;

        // Recorremos todos los números del arreglo
        for (int i = 0; i < numeros.length; i++) {

            // Comparamos si el número es igual al que buscamos
            if (numeros[i] == buscar) {

                // Guardamos la posición donde lo encontramos
                posicion = i;

                // Detenemos la búsqueda porque ya lo encontramos
                break;

            } // Cerramos la condición

        } // Cerramos el ciclo

        // Mostramos el número que buscamos
        System.out.println("Busqueda del numero " + buscar);

        // Mostramos la posición donde se encontró
        System.out.println("Posicion: " + posicion);

        // Mostramos la complejidad de la búsqueda
        System.out.println("Complejidad: O(n)");

    } // Aquí termina nuestro método principal


    // METODO QUICKSORT

    // Creamos el método que va a ordenar los números
    public static void quickSort(int[] a, int inicio, int fin) {

        // Revisamos si todavía hay números por ordenar
        if (inicio < fin) {

            // Elegimos el último número como pivote
            int pivote = a[fin];

            // Creamos una variable para controlar las posiciones
            int i = inicio - 1;

            // Recorremos los números para compararlos con el pivote
            for (int j = inicio; j < fin; j++) {

                // Revisamos si el número es menor o igual al pivote
                if (a[j] <= pivote) {

                    // Avanzamos una posición
                    i++;

                    // Guardamos temporalmente un número
                    int aux = a[i];

                    // Cambiamos el número de posición
                    a[i] = a[j];

                    // Terminamos de intercambiar los números
                    a[j] = aux;

                } // Cerramos la condición

            } // Cerramos el ciclo

            // Guardamos el número donde irá el pivote
            int aux = a[i + 1];

            // Colocamos el pivote en su posición
            a[i + 1] = a[fin];

            // Colocamos el número guardado en la otra posición
            a[fin] = aux;

            // Guardamos la posición donde quedó el pivote
            int posicion = i + 1;

            // Ordenamos los números de la izquierda
            quickSort(a, inicio, posicion - 1);

            // Ordenamos los números de la derecha
            quickSort(a, posicion + 1, fin);

        } // Cerramos la condición

    } // Aquí termina el método QuickSort

} // Aquí termina nuestra clase