/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MultipleGradientPaint.CycleMethod;
import java.awt.RadialGradientPaint;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Figuras extends JFrame {

    public Figuras() {
        // Configuración de la ventana
        setSize(1000, 700);
        setTitle("Figuras Geométricas");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Dibujar figuras sin relleno
        drawShapes(g, false, 50, 50);

        // Dibujar figuras con relleno
        drawShapes(g, true, 250, 250);
        
        g.setColor(Color.WHITE);
    }

    public void drawShapes(Graphics g, boolean filled, int offsetX, int offsetY) {
        // Tamaño reducido para las figuras
        int width = 50;
        int height = 50;

        Graphics2D gg = (Graphics2D)g;
        //Cosas del profe
        
        //Decoracion de extremos, dada por las constantes
        //CAP_BUTT (Cuadrado)
        //CAP_ROUND (Redodeado)
        
        
        float guiones1[] = {10,10};
        float guiones2[] = {21,9, 3, 9};
        float guiones3[] = {25,25};
        float guiones4[] = {5};
        
        gg.setStroke(new BasicStroke (2,BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 0, guiones1, 0));
        gg.drawLine(50, 80, 150, 180);
        gg.setStroke(new BasicStroke (3,BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, guiones2, 0));
          gg.drawLine(150, 80, 250, 180);
        gg.setStroke(new BasicStroke (4,BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 0, guiones3, 0));
          gg.drawLine(250, 80, 350, 180);
        gg.setStroke(new BasicStroke (5,BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND, 0, guiones4, 0));
          gg.drawLine(350, 80, 450, 180);
            gg.setStroke(new BasicStroke (1,BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, guiones1, 0));
          
            gg.drawRect(500, 80, 100, 100);
              gg.drawOval(650, 80, 100, 100);
              
              //Imagenes
              //g.setColor(Color.white);
              //g.drawString("-- Imagenes --" , 50, 240);
             // ImageIcon rect1 = new ImageIcon(getClass().getResource("C:\\Users\\Carlos Fernando\\Documents\\NetBeansProjects\\Figuras 2\\src\\figuras\\pkg2\\yoshi.png"));
              //g.drawImage(rect1.getImage(), 50, 240, this );
        
              
              Graphics2D figDegradado = (Graphics2D)g ;
              
              GradientPaint degradado = new GradientPaint(0,0,Color.blue, 20, 20, Color.cyan, true);
              figDegradado.setPaint(degradado);
              figDegradado.fillRect(50, 360, 150, 100);
              
              GradientPaint degradado1 = new GradientPaint(0,0,Color.magenta, 20, 20, Color.cyan, true);
              figDegradado.setPaint(degradado1);
              figDegradado.fillRect(250, 360, 100, 100);
              
              
              
              //Degradado radial
              
              g.setColor(Color.white);
              g.drawString("-- Degradado Radial --", 360, 360);
              Point2D puntoCentral = new Point2D.Float(360, 360);
              float radio = 15;
              Point2D foco = new Point2D.Float(20,25);
              float[] distribucionColor={0.0f, 0.5f, 1.0f};
              Color[] colores = {Color.magenta,  Color.CYAN, Color.BLUE};
              
              RadialGradientPaint degradadoR = new RadialGradientPaint(puntoCentral,
              radio, foco, distribucionColor, colores, CycleMethod.REPEAT);
              
              figDegradado.setPaint(degradadoR);
              figDegradado.fillRect(400, 360, 150, 130);
              figDegradado.fillOval(580, 360, 150, 130);
              
              BufferedImage buffer = new BufferedImage(80, 80, BufferedImage.TYPE_INT_RGB);
              Graphics2D textura = buffer.createGraphics();
              
              textura.setColor(Color.red);
              textura.fillRect(0,0,80,80);
              textura.setColor(Color.blue);
              
              textura.fillRect(20,20,20,20);
               textura.fillRect(40,40,20,20);
               
               textura.setColor(Color.black);
               textura.fillRect(40,20,20,20);
               textura.fillRect(20, 40, 20, 20);
               
               TexturePaint texturaImagen = new TexturePaint(buffer, new Rectangle(80,80));
               gg.setPaint(texturaImagen);
               gg.fillOval(780, 250, 200, 200);
        
       
    }

    public static void main(String[] args) {
        new Figuras();
    }
}


