/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import javax.swing.JFrame;

public class CircuitoCarreras extends JFrame {

    public CircuitoCarreras() {
        // Configuración de la ventana
        setSize(800, 600);
        setTitle("Paisaje: Circuito de Carreras");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        // Dibujar el fondo primero
        // Degradado para el cielo
        GradientPaint skyGradient = new GradientPaint(0, 0, Color.CYAN, 0, getHeight() / 2, Color.BLUE);
        g2d.setPaint(skyGradient);
        g2d.fillRect(0, 0, getWidth(), getHeight() / 2);

        // Degradado para el pasto
        GradientPaint grassGradient = new GradientPaint(0, getHeight() / 2, Color.GREEN, 0, getHeight(), Color.DARK_GRAY);
        g2d.setPaint(grassGradient);
        g2d.fillRect(0, getHeight() / 2, getWidth(), getHeight() / 2);

        // Circuito de carreras (rectángulos, líneas, arcos)
        g2d.setColor(Color.GRAY); // Color del asfalto
        g2d.fillRect(100, getHeight() / 2 + 50, 600, 150); // Rectángulo principal del circuito

        // Curvas del circuito (arcos)
        g2d.setStroke(new BasicStroke(5));
        g2d.draw(new Arc2D.Double(50, getHeight() / 2 + 50, 100, 150, 90, 180, Arc2D.OPEN)); // Curva izquierda
        g2d.draw(new Arc2D.Double(650, getHeight() / 2 + 50, 100, 150, 270, 180, Arc2D.OPEN)); // Curva derecha

        // Líneas en el circuito (patrón de línea, grosor, color)
        float[] dashPattern = {10, 10};
        g2d.setStroke(new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, dashPattern, 0));
        g2d.setColor(Color.WHITE);
        g2d.drawLine(150, getHeight() / 2 + 125, 650, getHeight() / 2 + 125); // Línea central

        // Rectángulos pequeños como "curbs" (borde de la pista)
        g2d.setColor(Color.RED);
        g2d.fillRect(150, getHeight() / 2 + 50, 20, 150);
        g2d.fillRect(630, getHeight() / 2 + 50, 20, 150);

        // Triángulos para las copas de los pinos al lado del circuito
        g2d.setColor(new Color(34, 139, 34));
        int[] xPoints = {200, 250, 150};
        int[] yPoints = {getHeight() / 2 - 150, getHeight() / 2 - 50, getHeight() / 2 - 50};
        g2d.fillPolygon(xPoints, yPoints, 3);

        int[] xPoints2 = {600, 650, 550};
        int[] yPoints2 = {getHeight() / 2 - 150, getHeight() / 2 - 50, getHeight() / 2 - 50};
        g2d.fillPolygon(xPoints2, yPoints2, 3);

        // Añadir troncos debajo de los árboles (rectángulos cafés)
        g2d.setColor(new Color(139, 69, 19)); // Color marrón
        g2d.fillRect(190, getHeight() / 2 - 50, 20, 50); // Tronco del primer árbol
        g2d.fillRect(590, getHeight() / 2 - 50, 20, 50); // Tronco del segundo árbol



        // Dibujar la bandera de cuadros sin usar un 'for'
        int flagX = 680;
        int flagY = getHeight() / 2 + 30;
        int squareSize = 10;

        // Fila 1
        g2d.setColor(Color.BLACK);
        g2d.fillRect(flagX, flagY, squareSize, squareSize);
        g2d.fillRect(flagX + 2 * squareSize, flagY, squareSize, squareSize);
        g2d.fillRect(flagX + 4 * squareSize, flagY, squareSize, squareSize);
        g2d.fillRect(flagX + 6 * squareSize, flagY, squareSize, squareSize);

        g2d.setColor(Color.WHITE);
        g2d.fillRect(flagX + squareSize, flagY, squareSize, squareSize);
        g2d.fillRect(flagX + 3 * squareSize, flagY, squareSize, squareSize);
        g2d.fillRect(flagX + 5 * squareSize, flagY, squareSize, squareSize);

        // Fila 2
        g2d.setColor(Color.WHITE);
        g2d.fillRect(flagX, flagY + squareSize, squareSize, squareSize);
        g2d.fillRect(flagX + 2 * squareSize, flagY + squareSize, squareSize, squareSize);
        g2d.fillRect(flagX + 4 * squareSize, flagY + squareSize, squareSize, squareSize);
        g2d.fillRect(flagX + 6 * squareSize, flagY + squareSize, squareSize, squareSize);

        g2d.setColor(Color.BLACK);
        g2d.fillRect(flagX + squareSize, flagY + squareSize, squareSize, squareSize);
        g2d.fillRect(flagX + 3 * squareSize, flagY + squareSize, squareSize, squareSize);
        g2d.fillRect(flagX + 5 * squareSize, flagY + squareSize, squareSize, squareSize);

        // Fila 3
        g2d.setColor(Color.BLACK);
        g2d.fillRect(flagX, flagY + 2 * squareSize, squareSize, squareSize);
        g2d.fillRect(flagX + 2 * squareSize, flagY + 2 * squareSize, squareSize, squareSize);
        g2d.fillRect(flagX + 4 * squareSize, flagY + 2 * squareSize, squareSize, squareSize);
        g2d.fillRect(flagX + 6 * squareSize, flagY + 2 * squareSize, squareSize, squareSize);

        g2d.setColor(Color.WHITE);
        g2d.fillRect(flagX + squareSize, flagY + 2 * squareSize, squareSize, squareSize);
        g2d.fillRect(flagX + 3 * squareSize, flagY + 2 * squareSize, squareSize, squareSize);
        g2d.fillRect(flagX + 5 * squareSize, flagY + 2 * squareSize, squareSize, squareSize);

        // Fila 4
        g2d.setColor(Color.WHITE);
        g2d.fillRect(flagX, flagY + 3 * squareSize, squareSize, squareSize);
        g2d.fillRect(flagX + 2 * squareSize, flagY + 3 * squareSize, squareSize, squareSize);
        g2d.fillRect(flagX + 4 * squareSize, flagY + 3 * squareSize, squareSize, squareSize);
        g2d.fillRect(flagX + 6 * squareSize, flagY + 3 * squareSize, squareSize, squareSize);

        g2d.setColor(Color.BLACK);
        g2d.fillRect(flagX + squareSize, flagY + 3 * squareSize, squareSize, squareSize);
        g2d.fillRect(flagX + 3 * squareSize, flagY + 3 * squareSize, squareSize, squareSize);
        g2d.fillRect(flagX + 5 * squareSize, flagY + 3 * squareSize, squareSize, squareSize);
    }

    public static void main(String[] args) {
        new CircuitoCarreras();
    }
}




