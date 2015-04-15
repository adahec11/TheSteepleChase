/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Helena
 */
public class MenuGUI extends JFrame
{
    public MenuGUI() 
    {
        initComponents();
        this.setSize(600, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void initComponents()
    {
        this.setLayout(new BorderLayout());
        JPanel panel1 = new JPanel();
        
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        
        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(1, 3));
        
        JPanel panel5 = new JPanel();
        
        JPanel panel6 = new JPanel();
        panel6.setLayout(new GridLayout(4, 1));
        
        //Events von Buttons:
        btStart.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                //Spiel wird gestartet
            }
        });
        
        btInstruction.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                /**
                 * neue JFrame extended Klasse wird aufgerufen in welcher
                 * die Anleitung zu dem Spiel angezeigt werden soll
                 */
            }
        });
        
        btEnd.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                /**
                 * Spiel wird beendet
                 */
                dispose();
            }
        });
        
        panel6.add(btStart);
        panel6.add(btInstruction);
        panel6.add(btHighscore);
        panel6.add(btEnd);
        
        JPanel panel7 = new JPanel();
        
        panel3.add(panel5);
        panel3.add(panel6);
        panel3.add(panel7);
        
        JPanel panel4 = new JPanel();
        panel2.add(panel3);
        panel2.add(panel4, BorderLayout.SOUTH);
        this.getContentPane().add(panel1, BorderLayout.NORTH);
        this.getContentPane().add(panel2); 
    }
    
    public static void main(String[] args) 
    {
        new MenuGUI().setVisible(true);
    }
    
    private JButton btStart = new JButton("Start");
    private JButton btInstruction = new JButton("Instructions");
    private JButton btEnd = new JButton("End");
    private JButton btHighscore = new JButton("Highscore");

}
