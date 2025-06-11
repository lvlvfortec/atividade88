import javax.swing.*;

import java.awt.event.*;

public class JanelaComCampoTexto {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Entrada de Nome");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Digite seu nome:");
        label.setBounds(20, 20, 150, 25);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(20, 50, 150, 25);
        frame.add(textField);

        JButton button = new JButton("Enviar");
        button.setBounds(180, 50, 80, 25);
        frame.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = textField.getText();
                System.out.println("Nome digitado: " + nome);
            }
        });

        frame.setVisible(true);
    }
}