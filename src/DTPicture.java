
import java.beans.*; 
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

import javax.accessibility.*;
import javax.swing.*;


class DTPicture extends Picture implements MouseMotionListener {
    private MouseEvent firstMouseEvent = null;
    private static boolean installInputMapBindings = true;

    public DTPicture(Image image) {
        super(image);
        addMouseMotionListener(this);

    }

    public void setImage(Image image) {
        this.image = image;
        this.repaint();
    }
    public void mouseClicked(MouseEvent e){
    	if(e.getClickCount()==2){
    		
    		this.image = rotate(this.image);
    		this.repaint();
    		System.out.println("aaaa");
//    		tokenChanged();
    	}
    }
    public void mousePressed(MouseEvent e) {
        if (image == null) return;
        firstMouseEvent = e;
        e.consume();
    }

    public void mouseDragged(MouseEvent e) {
        if (image == null) return;

        if (firstMouseEvent != null) {
            e.consume();
            int ctrlMask = InputEvent.CTRL_DOWN_MASK;
            int action = ((e.getModifiersEx() & ctrlMask) == ctrlMask) ?
                  TransferHandler.COPY : TransferHandler.MOVE;

            int dx = Math.abs(e.getX() - firstMouseEvent.getX());
            int dy = Math.abs(e.getY() - firstMouseEvent.getY());
            
            if (dx > 5 || dy > 5) {
             
                JComponent c = (JComponent)e.getSource();
                TransferHandler handler = c.getTransferHandler();
                handler.exportAsDrag(c, firstMouseEvent, action);
                firstMouseEvent = null;
            }
        }
    }

    public void mouseReleased(MouseEvent e) {
        firstMouseEvent = null;
    }
    public void mouseMoved(MouseEvent e) { }
    
    
    //image -> buffered image
    public static BufferedImage toBufferedImage(Image img)
    {
    	if(img instanceof BufferedImage){
    		return (BufferedImage)img;
    	}
        BufferedImage bufferedimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D image = bufferedimage.createGraphics();
        image.drawImage(img, 0, 0, null);
        image.dispose();
        return bufferedimage;
    }
    //bufferedimage ->rotate
    public static Image rotate(Image image) {
    	BufferedImage bufferedImage=toBufferedImage(image);
    	AffineTransform tx = new AffineTransform();
   	    tx.rotate(Math.toRadians(90), bufferedImage.getWidth() / 2, bufferedImage.getHeight() / 2);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
   	    bufferedImage = op.filter(bufferedImage, null);
   	    image=toImage(bufferedImage);
   	    return image;
    }

    //bufferdimage -> image
    public static Image toImage(BufferedImage img){
    	 return Toolkit.getDefaultToolkit().createImage(img.getSource());
    	
    }
    //tokenChaned
    public void tokenChanged(){
    	
    }
}