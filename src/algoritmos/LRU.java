package algoritmos;

import java.util.ArrayList;

public class LRU {

    public static int executar(int[] paginas, int frames) {
        ArrayList<Integer> memoria = new ArrayList<Integer>();
        int faltas = 0;

        for(int i = 0; i < paginas.length; i++) {
            int paginaAtual = paginas[i];

            if(memoria.contains(paginaAtual)) {
                memoria.remove((Integer) paginaAtual);
                memoria.add(paginaAtual);
            }
            else {
                faltas++;

                if(memoria.size() < frames) {
                    memoria.add(paginaAtual);
                }
                else {
                    memoria.remove(0);
                    memoria.add(paginaAtual);
                }
            }
        }

        return faltas;
    }
}

