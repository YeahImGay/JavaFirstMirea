package ru.mirea.task9;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Match {
    static int sc1=0;
    static int sc2=0;
    static String win="None";
    static String ls= "None";
    private JLabel Result;
    private JLabel Last;
    private JLabel Winner;
    public Match() {
        JFrame frame = new JFrame("Match");
        JLabel result;
        Result = new JLabel("Result: " + sc1 + " X " + sc2);
        Result.setBounds(100, 10, 100, 50);
        frame.add(Result);
        JLabel last;
        Last = new JLabel("Last scorer: " + ls);
        Last.setBounds(90, 60, 120, 50);
        frame.add(Last);
        JLabel winner;
        Winner = new JLabel("Winner: " + win);
        Winner.setBounds(100, 110, 100, 50);
        frame.add(Winner);
        JButton score1 = new JButton("Milano");
        score1.setBounds(25, 175, 100, 50);
        frame.add(score1);
        score1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Match.sc1++;
                Match.ls = "Milano";
                if (Match.sc1 > Match.sc2) {
                    Match.win = "Milano";
                } else {
                    if (Match.sc1 < Match.sc2) {
                        Match.win = "Madrid";
                    } else {
                        Match.win = "Draw";
                    }
                }
                update();
            }
        });
        JButton score2 = new JButton("Madrid");
        score2.setBounds(150, 175, 100, 50);
        frame.add(score2);
        score2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Match.sc2++;
                Match.ls = "Madrid";
                if (Match.sc1 > Match.sc2) {                      
                    Match.win = "Milano";
                } else {
                    if (Match.sc1 < Match.sc2) {
                        Match.win = "Madrid";
                    } else {
                        Match.win = "Draw";
                    }
                }
                update();
            }
        });
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void update(){
        Winner.setText("Winner: "+win);
        Result.setText("Result: "+sc1+" X "+sc2);
        Last.setText("Last scorer: "+ls);
    }
}