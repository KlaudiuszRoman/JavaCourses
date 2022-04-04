package com.example.swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SpinnerNumberModelExample extends JFrame {
    public static void main(String[] args) {
        SpinnerNumberModelExample frame =
                new SpinnerNumberModelExample();

        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(10, -5, 15, 1);
        JSpinner spinner = new JSpinner(spinnerModel);
        spinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("Spinner: " + spinner.getValue());
            }
        });

        frame.add(spinner);

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
