
package Login;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JComponent;

public class PanelCustom extends JComponent{
    public PanelCustom(){}
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2=(Graphics2D)g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),10,10));
        g2.dispose();
        super.paintComponent(g);
    } 
    
    private float alpha;
    
    @Override
    public void paint(Graphics g){
        
        super.paint(g);
        Graphics2D g2=(Graphics2D) g.create();
        //g2.setColor(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float) (alpha*0.8)));
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha*0.8f));
        g2.setColor(LoginAndRegister.mainColor);
        g2.fill(new Rectangle2D.Double(0,0,getWidth(),getHeight()));
        g2.dispose();
        
    }

    public float getAlpha() {
        return alpha;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }
    
}
