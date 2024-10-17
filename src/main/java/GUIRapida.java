import VetorialOperacoes.Vetorial;
import entities.Vetor;
import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class GUIRapida extends JFrame {

    //TODO: FAZER INTERFACE COM LITERALMENTE QUALQUER COISA MENOS JFRAME

    private JFormattedTextField inputField1;
    private JFormattedTextField inputField2;
    private JLabel resultLabel;

    public GUIRapida() {
        setTitle("Produto de Dois Escalares");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adiciona o painel ao quadro
        add(createPanel());

        // Exibe a janela
        setVisible(true);
    }

    public JPanel createPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.lightGray);
        GridBagConstraints c = new GridBagConstraints();

        MaskFormatter formatter = null;
        try {
            //TODO: Mudar esse maskFormatter pra outra coisa
            formatter = new MaskFormatter("(#, #, #)");
            formatter.setPlaceholderCharacter('0'); // Placeholder para caracteres vazios
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //TODO: Centralizar os campos de texto

        // Campo de Texto 1 com formatação
        inputField1 = new JFormattedTextField(formatter);
        inputField1.setColumns(10);
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        panel.add(inputField1, c);

        // Campo de Texto 2 com formatação
        inputField2 = new JFormattedTextField(formatter);
        inputField2.setColumns(10);
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        panel.add(inputField2, c);

        // Botão para realizar operação
        JButton calculateButton = new JButton("Fazer Operação");
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        c.weightx = 0.0;
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.CENTER;
        panel.add(calculateButton, c);

        resultLabel = new JLabel("<html>Resultado: </html>");
        resultLabel.setPreferredSize(new Dimension(200, 100)); // Ajuste o tamanho conforme necessário
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        panel.add(resultLabel, c);


        // Adiciona a ação ao botão
        calculateButton.addActionListener(e -> actionButton());

        return panel;
    }

    private void actionButton() {
        try {
            //TODO: Mudar a lógica de valores, de inteiro voltar pra float
            //TODO: Deixar possível colocar valores negativos

            // Obter e limpar os valores dos campos de texto
            String input1 = inputField1.getText().replaceAll("[^\\d,]", "");
            String input2 = inputField2.getText().replaceAll("[^\\d,]", "");

            // Dividir os valores e convertê-los para inteiros
            String[] values1 = input1.split(",");
            String[] values2 = input2.split(",");
            if (values1.length == 3 && values2.length == 3) {
                int x1 = Integer.parseInt(values1[0].trim());
                int y1 = Integer.parseInt(values1[1].trim());
                int z1 = Integer.parseInt(values1[2].trim());

                int x2 = Integer.parseInt(values2[0].trim());
                int y2 = Integer.parseInt(values2[1].trim());
                int z2 = Integer.parseInt(values2[2].trim());

                // Instanciar objetos Vetor
                Vetor vetor1 = new Vetor(x1, y1, z1);
                Vetor vetor2 = new Vetor(x2, y2, z2);

                // Calcular o produto dos vetores
                Vetorial aCoisaFaz = new Vetorial();

                Vetor produto = aCoisaFaz.produtoVetorial(vetor1, vetor2);
                double modulo = aCoisaFaz.modulo(produto);

                // Definindo o texto do rótulo de forma clara e organizada 🌸
                String resultado = "Resultado: (" + produto.x() + ", " + produto.y() + ", " + produto.z() + ")\n";
                String moduloText = " Módulo: " + modulo;

                // Definindo o texto final no rótulo
                String fFinal = (resultado + " \n" + moduloText);
                resultLabel.setText(fFinal);

            } else {
                resultLabel.setText("Por favor, insira valores válidos no formato (x, y, z).");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    public static void main(String[] args) {
        new GUIRapida();
    }
}
