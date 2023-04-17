import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    public int titleSize = 80;
    int cols = 8;
    int rows = 8;

    public Board(){
        this.setPreferredSize(new Dimension(cols * titleSize,rows*titleSize));

    }
    public void paintComponent(Graphics g){
        Graphics2D graphics2D = (Graphics2D) g;
        for(int r=0;r<rows;r++)
            for(int c=0;c<cols;c++){
                graphics2D.setColor((((c + r) % 2) == 0) ? new Color(145, 94, 44) : new Color(204, 180, 149));
                graphics2D.fillRect(c * titleSize,r*titleSize,titleSize,titleSize);
        }
    }
}
