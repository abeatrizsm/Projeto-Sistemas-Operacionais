package util;

public class Entrada {

    public static int[] converter(String texto) {
        String[] partes = texto.split(" ");
        int[] numeros = new int[partes.length];

        for(int i = 0; i < partes.length; i++) {
            numeros[i] = Integer.parseInt(partes[i]);
        }
        return numeros;
    }
}

