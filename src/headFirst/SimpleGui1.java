package headFirst;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui1 implements ActionListener {

    static JButton button;

    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("Click me");
        button.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public static void main(String[] args){
       SimpleGui1 simpleGui1 = new SimpleGui1();
       simpleGui1.go();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       button.setText("You Clicked me  !!!");
    }
}
