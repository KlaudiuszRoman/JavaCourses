package com.example.swing;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;

public class JColorChooserExample extends JFrame {
    public static void main(String[] args) {
        JColorChooserExample frame =
                new JColorChooserExample();

        Color color = JColorChooser.showDialog(frame, "wybierz kolor", Color.BLUE);

        System.out.println("wybrany kolor: " + color);

        JLabel label = new JLabel("Label");
        frame.add(label);
        label.setForeground(color);

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
