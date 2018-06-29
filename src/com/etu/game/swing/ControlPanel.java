package com.etu.game.swing;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel {

    private final JButton up = createButton("↑", 190, 10);
    private final JButton right = createButton("→", 220, 40);
    private final JButton down = createButton("↓", 190, 70);
    private final JButton left = createButton("←", 160, 40);

    public ControlPanel() {
        super(null);
        add(up);
        add(right);
        add(down);
        add(left);
    }

    public void addUpButtonListener(ActionListener listener) {
        up.addActionListener(listener);
    }

    public void addRightButtonListener(ActionListener listener) {
        right.addActionListener(listener);
    }

    public void addDownButtonListener(ActionListener listener) {
        down.addActionListener(listener);
    }

    public void addLeftButtonListener(ActionListener listener) {
        left.addActionListener(listener);
    }

    private JButton createButton(String text, int x, int y) {
        JButton left = new JButton(text);
        left.setBounds(x, y, 30, 30);
        left.setFocusPainted(false);
        left.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        return left;
    }
}
