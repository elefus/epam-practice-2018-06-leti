package com.etu.game.swing;

import com.etu.game.controller.Controller;
import com.etu.game.model.Model;
import com.etu.game.view.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class GameLauncher extends JFrame {

    private final ControlPanel controls;
    private final Component canvas;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GameLauncher().setVisible(true));
    }

    private GameLauncher() throws HeadlessException {
        canvas = new JPanel();
        canvas.setPreferredSize(new Dimension(400, 440));

        controls = new ControlPanel();
        controls.setPreferredSize(new Dimension(400, 120));

        JPanel rootPanel = new JPanel();
        rootPanel.setLayout(new BoxLayout(rootPanel, BoxLayout.Y_AXIS));
        rootPanel.setPreferredSize(new Dimension(400, 560));
        rootPanel.add(canvas, BorderLayout.CENTER);
        rootPanel.add(controls, BorderLayout.SOUTH);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(rootPanel);
        pack();
        setLocationRelativeTo(null);

        initListeners();
    }

    private void initListeners() {
        // TODO возможность выбора файла
        Scanner scanner = new Scanner(GameLauncher.class.getResourceAsStream("./../level2.dat"));
        Model model = Model.restore(scanner);
        View view = new View();
        view.setGraphics(new SwingGraphicsAdapter(this, canvas.getGraphics()));

        Controller controller = new Controller(model, view);

        controls.addUpButtonListener(e -> controller.moveUp());
        controls.addRightButtonListener(e -> controller.moveRight());
        controls.addDownButtonListener(e -> controller.moveDown());
        controls.addLeftButtonListener(e -> controller.moveLeft());

        canvas.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent event) {
                switch (event.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                    case KeyEvent.VK_A:
                        controller.moveLeft();
                        break;

                    case KeyEvent.VK_RIGHT:
                    case KeyEvent.VK_D:
                        controller.moveRight();
                        break;

                    case KeyEvent.VK_UP:
                    case KeyEvent.VK_W:
                        controller.moveUp();
                        break;

                    case KeyEvent.VK_DOWN:
                    case KeyEvent.VK_S:
                        controller.moveDown();
                        break;
                }
            }
        });

        Timer timer = new Timer(50, e -> {
            controller.viewUpdated();
            canvas.requestFocus();
        });
        timer.setRepeats(true);
        timer.start();
    }
}
