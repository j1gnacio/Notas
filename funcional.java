// Procesamiento Funcional
    public static void procesarNotasFuncional(double[] notas) {
        long mayoresA4 = IntStream.range(0, notas.length)
                .parallel()
                .filter(i -> notas[i] > 4.0)
                .count();

        long menoresA3_6 = IntStream.range(0, notas.length)
                .parallel()
                .filter(i -> notas[i] < 3.6)
                .count();

        long entre3_6y4 = IntStream.range(0, notas.length)
                .parallel()
                .filter(i -> notas[i] >= 3.6 && notas[i] < 4.0)
                .count();

        System.out.println("Resultados (Enfoque Funcional):");
        System.out.println("Notas mayores a 4.0: " + mayoresA4);
        System.out.println("Notas menores a 3.6: " + menoresA3_6);
        System.out.println("Notas en el rango [3.6, 4.0): " + entre3_6y4);
    }