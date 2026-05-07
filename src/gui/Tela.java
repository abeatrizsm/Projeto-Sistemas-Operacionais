package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import algoritmos.FIFO;
import algoritmos.LRU;
import algoritmos.Clock;
import algoritmos.Otimo;

import util.Entrada;

public class Tela extends JFrame {

    private JLabel labelSequencia;
    private JTextField campoSequencia;
    private JLabel labelFrames;
    private JTextField campoFrames;
    private JButton botao;
    private JTextArea areaResultado;

    public Tela() {
        setTitle("Simulador de Paginação");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        int centro = 280;
        Font fonteDefault = new Font("Segoe UI", Font.PLAIN, 18);


        labelSequencia = new JLabel("Sequência de páginas:");
        labelSequencia.setFont(fonteDefault);
        labelSequencia.setBounds(centro, 50, 200, 30);
        add(labelSequencia);

        campoSequencia = new JTextField();
        campoSequencia.setBounds(centro, 80, 440, 30);
        add(campoSequencia);

        labelFrames = new JLabel("Quantidade de frames:");
        labelFrames.setFont(fonteDefault);
        labelFrames.setBounds(centro, 120, 200, 30);
        add(labelFrames);

        campoFrames = new JTextField();
        campoFrames.setBounds(centro, 150, 440, 30);
        add(campoFrames);

        botao = new JButton("Simular");
        botao.setBounds(centro, 200, 440, 35);
        add(botao);

        areaResultado = new JTextArea();
        areaResultado.setEditable(false);

        JScrollPane painel = new JScrollPane(areaResultado);
        painel.setBounds(centro, 260, 440, 100);
        add(painel);

        Grafico grafico = new Grafico();
        grafico.setBounds(centro, 400, 640, 220);
        add(grafico);

        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = campoSequencia.getText();

                int frames = Integer.parseInt(campoFrames.getText());
                int[] paginas = Entrada.converter(texto);

                int fifo = FIFO.executar(paginas, frames);
                int lru = LRU.executar(paginas, frames);
                int clock = Clock.executar(paginas, frames);
                int otimo = Otimo.executar(paginas, frames);

                areaResultado.setText("");

                areaResultado.append("FIFO  - " + fifo +" faltas de página\n" );
                areaResultado.append("LRU   - " + lru +" faltas de página\n");
                areaResultado.append( "Clock - " + clock +" faltas de página\n");
                areaResultado.append("Otimo - " + otimo +" faltas de página\n");

                grafico.atualizarValores( fifo,lru,clock, otimo);
            }
        });
        setVisible(true);
    }
}