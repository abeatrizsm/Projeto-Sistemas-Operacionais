package gui;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Color;

public class Grafico extends JPanel {

    private int fifo;

    private int lru;

    private int clock;

    private int otimo;

    public void atualizarValores(
            int fifo,
            int lru,
            int clock,
            int otimo
    ) {

        this.fifo = fifo;

        this.lru = lru;

        this.clock = clock;

        this.otimo = otimo;

        repaint();
    }

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        int larguraBarra = 80;

        int espacamento = 50;

        int base = 180;

        g.setColor(Color.BLUE);

        g.fillRect(
                50,
                base - (fifo * 10),
                larguraBarra,
                fifo * 10
        );

        g.setColor(Color.BLACK);

        g.drawString(
                "FIFO",
                70,
                200
        );

        g.drawString(
                String.valueOf(fifo),
                80,
                base - (fifo * 10) - 10
        );

        g.setColor(Color.RED);

        g.fillRect(
                50 + espacamento + larguraBarra,
                base - (lru * 10),
                larguraBarra,
                lru * 10
        );

        g.setColor(Color.BLACK);

        g.drawString(
                "LRU",
                170,
                200
        );

        g.drawString(
                String.valueOf(lru),
                180,
                base - (lru * 10) - 10
        );

        g.setColor(Color.GREEN);

        g.fillRect(
                50 + (espacamento + larguraBarra) * 2,
                base - (clock * 10),
                larguraBarra,
                clock * 10
        );

        g.setColor(Color.BLACK);

        g.drawString(
                "Clock",
                255,
                200
        );

        g.drawString(
                String.valueOf(clock),
                280,
                base - (clock * 10) - 10
        );

        g.setColor(Color.ORANGE);

        g.fillRect(
                50 + (espacamento + larguraBarra) * 3,
                base - (otimo * 10),
                larguraBarra,
                otimo * 10
        );

        g.setColor(Color.BLACK);

        g.drawString(
                "Otimo",
                370,
                200
        );

        g.drawString(
                String.valueOf(otimo),
                380,
                base - (otimo * 10) - 10
        );
    }
}