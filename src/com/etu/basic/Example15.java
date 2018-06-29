package com.etu.basic;

import javax.swing.*;
import java.awt.*;

public class Example15 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new StartApplicationTask());
    }
}

class StartApplicationTask implements Runnable {

    @Override
    public void run() {
        JFrame mainFrame = new JFrame();

//        JTextField nameField = new JTextField();
//        nameField.setPreferredSize(new Dimension(100, 30));
//
//        JButton sayHelloButton = new JButton();
//        sayHelloButton.setPreferredSize(new Dimension(40, 30));
//
//        JLabel helloLabel = new JLabel("Hello, ");
//        helloLabel.setPreferredSize(new Dimension(150, 30));
//
//        sayHelloButton.addActionListener(event -> {
//            String name = nameField.getText();
//            helloLabel.setText("Hello, " + name);
//        });

        JPanel rootPanel = new JPanel() {
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.BLUE);
                g.fillRect(20, 20, 300, 300);
            }
        };
        rootPanel.setPreferredSize(new Dimension(500, 500));
//        rootPanel.add(nameField);
//        rootPanel.add(sayHelloButton);
//        rootPanel.add(helloLabel);

        mainFrame.setContentPane(rootPanel);
        mainFrame.setPreferredSize(new Dimension(500, 500));
        mainFrame.pack();

        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}
