
import javax.swing.InputMap;
import javax.swing.KeyStroke;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.accessibility.Accessible;

import java.beans.*; 
import java.awt.*;
import java.awt.event.*;


class Picture extends JComponent
                       implements MouseListener,
                                  Accessible {
    Image image;

    public Picture(Image image) {

        this.image = image;
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        requestFocusInWindow();
    }

    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }
    public void mousePressed(MouseEvent e) { }
    public void mouseReleased(MouseEvent e) { }


    protected void paintComponent(Graphics graphics) {
        Graphics g = graphics.create();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, image == null ? 100 : image.getWidth(this),
                image == null ? 100 : image.getHeight(this));
        
     
        if (image != null) {
            g.drawImage(image, 0, 0, this);
        }
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, image == null ? 100 : 100,
                         image == null ? 100 : 100);
        g.dispose();
    }

}