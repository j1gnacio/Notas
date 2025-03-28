public static void main(String[] args) {
        int cantidadNotas = 100; // Puedes cambiar este valor
        double[] notas = generarNotas(cantidadNotas);

        // Mostrar el arreglo de notas generado
        System.out.println("Arreglo de notas generadas:");
        for (double nota : notas) {
            System.out.printf("%.2f ", nota);
        }
        System.out.println();

        // Procesar notas de ambas maneras
        procesarNotasImperativo(notas);
        procesarNotasFuncional(notas);
    }