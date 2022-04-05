package com.example.swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;

public class TooltipAppIconExample {
    public static void main(String[] args) {

        JFrame frame =
                new JFrame();

        JButton b1 = new JButton("Click me!");
        b1.setToolTipText("Kliknij mnie!");

        Image icon = (new ImageIcon("files\\pb.jpg")).getImage();
        frame.setIconImage(icon);

        frame.setLayout(new FlowLayout());
        frame.add(b1);

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
