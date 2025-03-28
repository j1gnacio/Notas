// Procesamiento Imperativo
    public static void procesarNotasImperativo(double[] notas) {
        int mayoresA4 = 0;
        int menoresA3_6 = 0;
        int entre3_6y4 = 0;

        for (double nota : notas) {
            if (nota > 4.0) {
                mayoresA4++;
            } else if (nota < 3.6) {
                menoresA3_6++;
            } else if (nota >= 3.6 && nota < 4.0) {
                entre3_6y4++;
            }
        }

        System.out.println("Resultados (Enfoque Imperativo):");
        System.out.println("Notas mayores a 4.0: " + mayoresA4);
        System.out.println("Notas menores a 3.6: " + menoresA3_6);
        System.out.println("Notas en el rango [3.6, 4.0): " + entre3_6y4);
    }