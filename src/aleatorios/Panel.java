/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorios;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author vbarrera
 */
public class Panel extends JPanel{
    ImageIcon imagen;
    String nombre;

    public Panel(String nombre) {
        this.nombre = nombre;
        this.setSize(508,408);
    }

    @Override
    public void paint(Graphics g) {
        Dimension tamanio=getSize();
        imagen=new ImageIcon(getClass().getResource(nombre));
       g.drawImage(imagen.getImage(), 0, 0, tamanio.width,tamanio.height,null);
        setOpaque(false);
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
    }
    
            
}
