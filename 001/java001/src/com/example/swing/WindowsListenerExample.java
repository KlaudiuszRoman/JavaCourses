package com.example.swing;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;

public class WindowsListenerExample extends JFrame
        implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Windows opened!");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Windows closing!");
        this.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Okno zamknięte!");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Okno zminimalizowane!");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Okno pokazane!");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Okno aktywowane!");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Okno deaktywowane!");
    }

    public static void main(String[] args) {
        WindowsListenerExample frame = new WindowsListenerExample();

        frame.addWindowListener(frame);

        frame.addWindowFocusListener(new WindowFocusListener() {
            @Override
            public void windowGainedFocus(WindowEvent e) {
                System.out.println("Windows gained focus.");
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                System.out.println("Window lost focus.");
            }
        });

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
