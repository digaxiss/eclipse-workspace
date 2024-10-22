package diadasemana;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Aniversariante {
    String nome;
    LocalDate dataNascimento;

    public Aniversariante(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
}

public class SistemaAniversariosGUI {
    private List<Aniversariante> aniversariantes = new ArrayList<>();
    private JTextArea areaMensagens;

    public SistemaAniversariosGUI() {
        JFrame frame = new JFrame("Sistema de Aniversários");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        JLabel nomeLabel = new JLabel("Nome:");
        JTextField nomeField = new JTextField(20);
        JLabel dataLabel = new JLabel("Data de Nascimento (DD/MM/AAAA):");
        JTextField dataField = new JTextField(20);
        JButton adicionarButton = new JButton("Adicionar Aniversariante");
        areaMensagens = new JTextArea(10, 30);
        areaMensagens.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(areaMensagens);

        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String dataNascimentoStr = dataField.getText();

                try {
                    String[] partes = dataNascimentoStr.split("/");
                    LocalDate dataNascimento = LocalDate.of(
                            Integer.parseInt(partes[2]),
                            Integer.parseInt(partes[1]),
                            Integer.parseInt(partes[0])
                    );
                    aniversariantes.add(new Aniversariante(nome, dataNascimento));
                    nomeField.setText("");
                    dataField.setText("");
                    verificarAniversarios();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Data inválida. Tente novamente.");
                }
            }
        });

        frame.add(nomeLabel);
        frame.add(nomeField);
        frame.add(dataLabel);
        frame.add(dataField);
        frame.add(adicionarButton);
        frame.add(scrollPane);

        frame.setVisible(true);
    }

    private void verificarAniversarios() {
        areaMensagens.setText("");
        int mesAtual = LocalDate.now().getMonthValue();

        for (Aniversariante aniversariante : aniversariantes) {
            if (aniversariante.dataNascimento.getMonthValue() == mesAtual) {
                areaMensagens.append("Feliz aniversário, " + aniversariante.nome + "! Que seu mês seja cheio de alegrias!\n");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SistemaAniversariosGUI::new);
    }
}
