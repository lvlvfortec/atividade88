import javax.swing.*;
import java.awt.event.*;

public class JanelaComComboBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Seleção de Opções");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        String[] opcoes = { "Opção A", "Opção B", "Opção C" };
        JComboBox<String> comboBox = new JComboBox<>(opcoes);
        comboBox.setBounds(50, 40, 180, 25);
        frame.add(comboBox);

        comboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Selecionado: " + e.getItem());
                }
            }
        });

        frame.setVisible(true);
    }
}