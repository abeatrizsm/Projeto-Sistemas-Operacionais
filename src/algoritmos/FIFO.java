package algoritmos;

import java.util.ArrayList;

public class FIFO {

    public static int executar(int[] paginas, int frames) {
        ArrayList<Integer> memoria = new ArrayList<Integer>();
        int faltas = 0;
        int posicao = 0;

        for(int i = 0; i < paginas.length; i++) {
            int paginaAtual = paginas[i];

            if(!memoria.contains(paginaAtual)) {
                faltas++;

                if(memoria.size() < frames) {
                    memoria.add(paginaAtual);
                }
                else {
                    memoria.set(posicao, paginaAtual);
                    posicao++;

                    if(posicao == frames) {
                        posicao = 0;
                    }
                }
            }
        }
        return faltas;
    }
}

