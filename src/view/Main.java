package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

import controller.Controller;

public class Main {
	public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Crab Game");
        Controller control = new Controller();
        frame.add(control);
        frame.setSize(control.FRAMEWIDTH, control.FRAMEHEIGHT);
        frame.getContentPane().setBackground(Color.BLUE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                control.update();
            }
        };
        
        Timer timer = new Timer(25 ,taskPerformer);
        timer.start();
        
        
        
        
    }
}
