/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.awt.Rectangle;
import java.awt.geom.Arc2D;
import java.awt.geom.Point2D;
import javax.swing.JFrame;

public class CiudadNocturna extends JFrame {

    public CiudadNocturna() {
        // Configuración de la ventana
        setSize(800, 600); // Tamaño de la ventana
        setTitle("Ciudad Nocturna"); // Título de la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la aplicación al cerrar la ventana
        setVisible(true); // Hace visible la ventana
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Llama al método paint de la superclase para asegurar el comportamiento estándar

        // Establece el fondo en color negro
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        // Dibuja las figuras
        drawShapes(g);
    }

    public void drawShapes(Graphics g) {
        Graphics2D gg = (Graphics2D) g; // Convierte Graphics a Graphics2D para acceso a métodos avanzados
        
        // Dibuja edificios (rectángulos) en el fondo con diferentes colores
        gg.setColor(Color.GRAY);
        gg.fillRect(50, 300, 100, 250); // Edificio 1
        
        gg.setColor(Color.DARK_GRAY);
        gg.fillRect(200, 250, 120, 300); // Edificio 2
        
        gg.setColor(Color.LIGHT_GRAY);
        gg.fillRect(370, 280, 150, 270); // Edificio 3
        
        gg.setColor(Color.BLUE);
        gg.fillRect(550, 300, 100, 250); // Nuevo Edificio sobre la calle
        
        // Dibuja ventanas de los edificios (pequeños rectángulos)
        gg.setColor(Color.YELLOW);

        // Ventanas para el Edificio 1
        int ventanaSize = 20;
        int ventanaSpacing = 30;
        int x = 60;
        int y = 310;
        for (int i = 0; i < 6; i++) { // 6 filas
            for (int j = 0; j < 3; j++) { // 3 columnas
                gg.fillRect(x + j * ventanaSpacing, y + i * ventanaSpacing, ventanaSize, ventanaSize);
            }
        }
        
        // Ventanas para el Edificio 2
        x = 210;
        y = 260;
        for (int i = 0; i < 6; i++) { // 6 filas
            for (int j = 0; j < 3; j++) { // 3 columnas
                gg.fillRect(x + j * ventanaSpacing, y + i * ventanaSpacing, ventanaSize, ventanaSize);
            }
        }
        
        // Ventanas para el Edificio 3
        x = 380;
        y = 290;
        for (int i = 0; i < 6; i++) { // 6 filas
            for (int j = 0; j < 3; j++) { // 3 columnas
                gg.fillRect(x + j * ventanaSpacing, y + i * ventanaSpacing, ventanaSize, ventanaSize);
            }
        }
        
        // Ventanas para el Nuevo Edificio
        x = 560;
        y = 310;
        for (int i = 0; i < 6; i++) { // 6 filas
            for (int j = 0; j < 3; j++) { // 3 columnas
                gg.fillRect(x + j * ventanaSpacing, y + i * ventanaSpacing, ventanaSize, ventanaSize);
            }
        }
        
        // Dibuja puertas en los edificios
        gg.setColor(new Color(139, 69, 19)); // Color marrón para las puertas

        // Puerta para el Edificio 1
        gg.fillRect(85, 500, 30, 50); // Puerta

        // Puerta para el Edificio 2
        gg.fillRect(235, 500, 30, 50); // Puerta

        // Puerta para el Edificio 3
        gg.fillRect(385, 500, 30, 50); // Puerta

        // Puerta para el Nuevo Edificio
        gg.fillRect(565, 500, 30, 50); // Puerta
        
        // Dibuja un círculo para la luna
        gg.setColor(Color.LIGHT_GRAY);
        gg.fillOval(600, 50, 100, 100);
        
        // Dibuja un degradado radial para representar la luna
        Point2D centro = new Point2D.Float(650, 100);
        float radio = 50;
        Point2D foco = new Point2D.Float(650, 100); // El foco es el mismo que el centro en este caso
        float[] distribucionColor = {0.0f, 0.5f, 1.0f}; // Fracciones para la distribución del color
        Color[] colores = {Color.WHITE, Color.LIGHT_GRAY, Color.DARK_GRAY}; // Colores para el degradado
        RadialGradientPaint.CycleMethod ciclo = RadialGradientPaint.CycleMethod.REPEAT;

        // Crear el degradado radial
        RadialGradientPaint degradadoLuna = new RadialGradientPaint(centro, radio, foco, distribucionColor, colores, ciclo);
        gg.setPaint(degradadoLuna);
        gg.fillOval(600, 50, 100, 100);
        
        // Dibuja estrellas (pequeños círculos blancos)
        gg.setColor(Color.WHITE);
        gg.fillOval(100, 100, 5, 5);
        gg.fillOval(150, 150, 5, 5);
        gg.fillOval(200, 50, 5, 5);
        gg.fillOval(300, 80, 5, 5);
        gg.fillOval(400, 120, 5, 5);
        gg.fillOval(500, 200, 5, 5);
        gg.fillOval(600, 50, 5, 5);
        
        // Dibuja caminos (líneas)
        gg.setColor(Color.DARK_GRAY);
        gg.setStroke(new BasicStroke(5, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        gg.drawLine(0, 550, 800, 550); // Camino en la parte inferior

        // Dibuja arcos
        gg.setColor(Color.ORANGE);
        gg.setStroke(new BasicStroke(3)); // Grosor de línea para los arcos

        // Arcos en el cielo (simulan puentes o arcos decorativos)
        gg.draw(new Arc2D.Double(50, 150, 150, 100, 0, 180, Arc2D.OPEN)); // Arco superior
        gg.draw(new Arc2D.Double(250, 100, 200, 150, 0, 180, Arc2D.OPEN)); // Arco grande
        gg.draw(new Arc2D.Double(500, 200, 150, 100, 0, 180, Arc2D.OPEN)); // Arco pequeño

        // Dibuja una farola
        // Poste de la farola
        gg.setColor(Color.GRAY);
        gg.fillRect(705, 470, 10, 90); // Poste de la farola
        
        // Base de la farola
        gg.setColor(Color.DARK_GRAY);
        gg.fillRect(700, 560, 20, 10); // Base de la farola
        
        // Lámpara de la farola
        gg.setColor(Color.YELLOW);
        gg.fillOval(695, 440, 30, 30); // Lámpara de la farola
    }

    public static void main(String[] args) {
        new CiudadNocturna(); // Crea una instancia de la clase CiudadNocturna, que muestra la ventana
    }
}










