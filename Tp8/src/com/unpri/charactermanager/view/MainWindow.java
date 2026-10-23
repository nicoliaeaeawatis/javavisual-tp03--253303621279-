
package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainWindow extends JFrame {

    private final JPanel characterPanel;
    private final JLabel averageLabel;

    public MainWindow(CharacterManager manager) {
        setTitle("Character Manager");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10, 10));

        JLabel titleLabel = new JLabel(
            "Daftar Karakter",
            SwingConstants.CENTER
        );
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBorder(
            BorderFactory.createEmptyBorder(10, 5, 10, 5)
        );
        add(titleLabel, BorderLayout.NORTH);

        characterPanel = new JPanel();
        characterPanel.setLayout(
            new BoxLayout(characterPanel, BoxLayout.Y_AXIS)
        );

        JScrollPane scrollPane = new JScrollPane(characterPanel);
        add(scrollPane, BorderLayout.CENTER);

        averageLabel = new JLabel("", SwingConstants.CENTER);
        averageLabel.setFont(new Font("Arial", Font.BOLD, 14));
        averageLabel.setBorder(
            BorderFactory.createEmptyBorder(10, 5, 10, 5)
        );
        add(averageLabel, BorderLayout.SOUTH);

        displayCharacters(manager);
    }

    private void displayCharacters(CharacterManager manager) {
        characterPanel.removeAll();

        ArrayList<Character> characters = manager.getAllCharacters();

        for (Character character : characters) {
            JLabel characterLabel = new JLabel(
                character.getName()
                + " | Tipe: " + character.getType()
                + " | Level: " + character.getLevel()
                + " | HP: " + character.getHitPoints()
                + " | Attack: " + character.getAttack()
            );

            characterLabel.setBorder(
                BorderFactory.createEmptyBorder(8, 10, 8, 10)
            );

            characterPanel.add(characterLabel);
        }

        double average = manager.getAverageLevel();

        averageLabel.setText(
            String.format("Rata-rata Level: %.2f", average)
        );

        characterPanel.revalidate();
        characterPanel.repaint();
    }
}
