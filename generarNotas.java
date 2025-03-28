// Método para generar un arreglo de notas aleatorias
    public static double[] generarNotas(int cantidad) {
        Random random = new Random();
        double[] notas = new double[cantidad];
        for (int i = 0; i < cantidad; i++) {
            notas[i] = 1.0 + (6.0 * random.nextDouble()); // Genera notas entre 1.0 y 7.0
        }
        return notas;
    }