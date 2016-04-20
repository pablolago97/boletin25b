/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin25b;

import java.awt.*;
import java.awt.Frame;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author oracle
 */
public class Clasef extends JFrame {
    
      private JPanel contentPane;
      
      public int x=20;
      public int y=20;
      public String j = "";
      
      public Clasef(){
          
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setBounds(0,0,410,210);
        j = JOptionPane.showInputDialog("Escribe el número de círculos que desees dibujar");
       }

      
    public void paint(Graphics g){
      super.paint(g);
      g.setColor(Color.red);
      int variable=0;
      for(int i = 0; i < Integer.parseInt(j); i++ ){
      g.drawOval (x+variable, y+variable, 10, 10);
      
      variable = variable + 10;
      }
      
      
    }
    
    
    
}

