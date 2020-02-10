package headFirst;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyDrawPanel extends JPanel implements ActionListener {

    JFrame frame;

    @Override
    protected void paintComponent(Graphics g) {
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color randomColor = new Color(red,green,blue);

       g.setColor(randomColor);
       g.fill3DRect(20,50,100,100, true);
    }

    public static void main(String[] args){
        MyDrawPanel myDrawPanel = new MyDrawPanel();
        myDrawPanel.go();

    }

    public void go(){

        frame = new JFrame();
        JButton button = new JButton("Change Color");
        button.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER,this);
        frame.getContentPane().add(BorderLayout.SOUTH,button);
        frame.setSize(300,300);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
         frame.repaint();
    }
}
