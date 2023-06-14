import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculaRob extends JFrame{
    public JPanel calculadoraPanel;
    private JTextField textNomeProduto;
    private JTextField textCustoProduto;
    private JTextField textValorVenda;
    private JTextField textValorPIS;
    private JTextField textValorCofins;
    private JTextField textValorICMS;
    private JTextField textValorDIFAL;
    private JTextField textValorFrete;
    private JTextField textValorISS;
    private JButton calcularButton;
    private JTextArea textArea1;
    private JComboBox valorComboTipo;
    private JTextField valorSelecionado;
    private JTextPane textPane1;
    private JTextPane textPane2;




public class Imposto {
}

public CalculaRob () {


    calcularButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {




            if (textNomeProduto.getText().isEmpty() || textCustoProduto.getText().isEmpty() || textValorVenda.getText().isEmpty() ||textValorPIS.getText().isEmpty() ||textValorCofins.getText().isEmpty() ||textValorICMS.getText().isEmpty() ||textValorDIFAL.getText().isEmpty() ||valorSelecionado.getText().isEmpty()) {



                JOptionPane.showMessageDialog(null, "Preencha todos os Campos!");
            }else{

                textNomeProduto.getText();
                Double custo = Double.valueOf(textCustoProduto.getText());
                Double vVenda = Double.valueOf(textValorVenda.getText());
                Double vPIS = Double.valueOf(textValorPIS.getText());
                Double vCofins = Double.valueOf(textValorCofins.getText());
                Double vICMS = Double.valueOf(textValorICMS.getText());
                Double vDIFAL = Double.valueOf(textValorDIFAL.getText());



                if (valorComboTipo.getSelectedIndex() == 0) {


                        Double vFrete = Double.valueOf(valorSelecionado.getText());

                        Double valorDivisao = ((((((vVenda - custo) - vPIS) - vCofins) - vICMS) - vDIFAL) - vFrete);
                        Double valorDividida = valorDivisao / vVenda;
                        Double valorPorcentagem = (valorDividida * 100);

                    textPane1.setText(String.valueOf(valorDivisao).

                        substring(0,8));
                    textPane2.setText(String.valueOf(valorPorcentagem +"%").

                        substring(0,4));;


                } else if (valorComboTipo.getSelectedIndex() == 1) {
                    Double vServico = Double.valueOf(valorSelecionado.getText());

                    Double valorDivisao = (vVenda - custo - vPIS - vCofins - vICMS - vDIFAL - vServico);
                    Double valorDividida = valorDivisao / vVenda;
                    Double valorPorcentagem = (valorDividida * 100);

                    textPane1.setText(String.valueOf(valorDivisao).substring(0, 8));
                    textPane2.setText(String.valueOf(valorPorcentagem).substring(0, 4));
                    ;


                }
            }
}
});
};}