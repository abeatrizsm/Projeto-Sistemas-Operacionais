package algoritmos;

import java.util.ArrayList;

public class Clock {

    public static int executar(int[] paginas, int frames) {
        ArrayList<Integer> memoria = new ArrayList<Integer>();
        ArrayList<Integer> bits = new ArrayList<Integer>();
        int faltas = 0;
        int ponteiro = 0;

        for(int i = 0; i < paginas.length; i++) {
            int paginaAtual = paginas[i];

            if(memoria.contains(paginaAtual)) {
                int indice = memoria.indexOf(paginaAtual);
                bits.set(indice, 1);
            }
            else {
                faltas++;

                if(memoria.size() < frames) {
                    memoria.add(paginaAtual);
                    bits.add(1);
                }
                else {
                    while(true) {
                        if(bits.get(ponteiro) == 0) {
                            memoria.set(ponteiro, paginaAtual);
                            bits.set(ponteiro, 1);
                            ponteiro++;

                            if(ponteiro == frames) {
                                ponteiro = 0;
                            }
                            break;
                        }
                        else {
                            bits.set(ponteiro, 0);
                            ponteiro++;

                            if(ponteiro == frames) {
                                ponteiro = 0;
                            }
                        }
                    }
                }
            }
        }
        return faltas;
    }
}

