/*
 * Program To Show Exam[le Of Swing Utilization 
 * Author: Thuku Josphat Wamwago
 * Reg No: CT101/G/19448/23
 * Date: 19/3/2025
 * Version: 1
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a label
        JLabel label = new JLabel("Click the button to see the magic!", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 16));

        // Create a button
        JButton button = new JButton("Click Me:)");
        button.setFont(new Font("Arial", Font.BOLD, 14));

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked! Congratulations?");
            }
        });

        // Set the layout and add components
        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);

        // Make the frame visible
        frame.setVisible(true);
    }
}
