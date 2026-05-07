package algoritmos;

import java.util.ArrayList;

public class Otimo {

    public static int executar(int[] paginas, int frames) {
        ArrayList<Integer> memoria = new ArrayList<Integer>();
        int faltas = 0;

        for(int i = 0; i < paginas.length; i++) {
            int paginaAtual = paginas[i];

            if(!memoria.contains(paginaAtual)) {
                faltas++;

                if(memoria.size() < frames) {
                    memoria.add(paginaAtual);
                }
                else {
                    int indiceRemover = 0;
                    int maiorDistancia = -1;

                    for(int j = 0; j < memoria.size(); j++) {
                        int paginaMemoria = memoria.get(j);
                        int distancia = 9999;

                        for(int k = i + 1; k < paginas.length; k++) {
                            if(paginas[k] == paginaMemoria) {
                                distancia = k;
                                break;
                            }
                        }

                        if(distancia > maiorDistancia) {
                            maiorDistancia = distancia;
                            indiceRemover = j;
                        }
                    }
                    memoria.set(indiceRemover, paginaAtual);
                }
            }
        }

        return faltas;
    }
}
