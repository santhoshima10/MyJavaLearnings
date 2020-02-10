package headFirst;

import javax.swing.*;
import java.awt.*;

public class SimpleGui2 {

    int xCoordinate = 20;
    int yCoordinate = 50;
    boolean animation = true;

    public static void main(String[] args) throws InterruptedException{

        SimpleGui2 simpleGui2 = new SimpleGui2();
        simpleGui2.go();

    }

    public void go() throws InterruptedException{
        JFrame frame = new JFrame();
        MyDrawingPanel myDrawingPanel = new MyDrawingPanel();
        frame.getContentPane().add(myDrawingPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

       for(int i = 1 ; i <= 130 ;i++){
           xCoordinate++;
           yCoordinate++;
           myDrawingPanel.repaint();
           Thread.sleep(50);
       }
    }

    class MyDrawingPanel extends JPanel{
        @Override
        protected void paintComponent(Graphics g) {
            g.setColor(Color.orange);
            g.fillOval(xCoordinate,yCoordinate, 20, 20);

        }
    }

}
