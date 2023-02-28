import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCalc extends JFrame {
    private JPanel PNLTelaCalc;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btnmais;
    private JButton btnporcento;
    private JButton btnponto;
    private JButton btn6;
    private JButton btn5;
    private JButton btn4;
    private JButton btnmulti;
    private JButton btnigual;
    private JButton btn9;
    private JButton btn8;
    private JButton btn7;
    private JButton btnbarra;
    private JButton btn0;
    private JButton btnc;
    private JButton btnvirgula;
    private JButton btnraiz;
    private JTextField txtsaida;

    double valor1;
    double valor2;
    String operador;

public TelaCalc() {
    iniciarComponentes();
    addListeners();

}
 private void iniciarComponentes() {
    JPanel telaCalc = new JPanel();
    setSize(500,350);
    setContentPane(PNLTelaCalc);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Calculadora");
    setVisible(true);
 }

   private void addListeners() {
    btn1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtsaida.setText(txtsaida.getText() + "1");
        }
    });

       btn2.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               txtsaida.setText(txtsaida.getText() + "2");
           }
       });

       btn3.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               txtsaida.setText(txtsaida.getText() + "3");
           }
       });

       btn4.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               txtsaida.setText(txtsaida.getText() + "4");
           }
       });

       btn5.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               txtsaida.setText(txtsaida.getText() + "5");
           }
       });

       btn6.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               txtsaida.setText(txtsaida.getText() + "6");
           }
       });

       btn7.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               txtsaida.setText(txtsaida.getText() + "7");
           }
       });

       btn8.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               txtsaida.setText(txtsaida.getText() + "8");
           }
       });

       btn9.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               txtsaida.setText(txtsaida.getText() + "9");
           }
       });

       btn0.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               txtsaida.setText(txtsaida.getText() + "0");
           }
       });

       btnvirgula.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               txtsaida.setText(txtsaida.getText() + ",");
           }
       });

       btnmais.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               valor1 = Double.parseDouble(txtsaida.getText());
               txtsaida.setText("");
               operador = "+";
           }
       });

       btnponto.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               valor1 = Double.parseDouble(txtsaida.getText());
               txtsaida.setText("");
               operador = "-";
           }
       });

       btnbarra.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               valor1 = Double.parseDouble(txtsaida.getText());
               txtsaida.setText("");
               operador = "/";
           }
       });

       btnmulti.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               valor1 = Double.parseDouble(txtsaida.getText());
               txtsaida.setText("");
               operador = "*";
           }
       });

       btnporcento.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               valor1 = Double.parseDouble(txtsaida.getText());
               txtsaida.setText("");
               operador = "%";
           }
       });

       btnraiz.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               valor1 = Double.parseDouble(txtsaida.getText());
               txtsaida.setText("");
               operador = "sqrt";
               double sqrt = Math.sqrt(valor1);
               txtsaida.setText(String.valueOf((sqrt)));
           }
       });

       btnigual.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               valor2 = Double.parseDouble(txtsaida.getText());
               switch (operador){
                   case"+":
                       txtsaida.setText(String.valueOf(valor1 + valor2));
                       break;

                   case"-":
                       txtsaida.setText(String.valueOf(valor1 - valor2));
                       break;

                   case"/":
                       txtsaida.setText(String.valueOf(valor1 / valor2));
                       break;

                   case"*":
                       txtsaida.setText(String.valueOf(valor1 * valor2));
                       break;

                   case"%":
                       txtsaida.setText(String.valueOf(valor1 + (valor2/100)));
                       break;

                   default:
                       break;
               }
           }
       });


   }

    public static void main(String[] args) {
        TelaCalc calculadora = new TelaCalc();
    }
}

