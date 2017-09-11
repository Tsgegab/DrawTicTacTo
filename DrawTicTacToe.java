
import java.applet.Applet;
import java.awt.Graphics;
public class DrawTicTacToe extends Applet{
    public void paint( Graphics g){
        g. drawOval(325, 50, 100, 100);
        g .drawLine(250, 0, 250, 600);
        g.drawLine(500, 0, 500, 600);
        g .drawLine(700, 200, 0, 200);
        g .drawLine(700, 400, 0, 400);
        g .drawOval(50, 250, 100, 100);
        g .drawOval(50, 500, 100, 100);
        g .drawOval(325, 500, 100, 100);
        g .drawLine(0, 0, 710, 570);
        g .drawLine(710, 28, 250, 400);
        g .drawLine(250, 0, 0, 200);
        g .drawLine(700, 200, 500, 0);
        g .drawLine(500, 600, 700, 400);

}

}
