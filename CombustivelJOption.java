package javaSenacTech;

import javax.swing.JOptionPane;

public class CombustivelJOption {

    public static void main(String[] args) {

        double gasolina, alcool, litros = 0.0, total = 0.0;
        String gasolina1, alcool1, litros1, opcao1;
        int opcao;

        gasolina1 = JOptionPane.showInputDialog("Preço da gasolina R$ ");
        alcool1 = JOptionPane.showInputDialog("Preço do alcool R$ ");
        opcao1 = JOptionPane.showInputDialog("1- Gasolina \n 2- Alcool \n 3- Sair ");

        gasolina = Double.parseDouble(gasolina1);
        alcool = Double.parseDouble(alcool1);
        opcao = Integer.parseInt(opcao1);

        if (opcao == 1) {
            litros1 = JOptionPane.showInputDialog("Quantos litros ");
            litros = Double.parseDouble(litros1);
            total = gasolina * litros;
        } else if (opcao == 2) {
            litros1 = JOptionPane.showInputDialog("Quantos litros ");
            litros = Double.parseDouble(litros1);
            total = alcool * litros;
        } else {
            System.exit(0);
        }

        JOptionPane.showMessageDialog(null, "Foram abastecidos " + litros + " de combustível \nTotal a ser pago " + total, "Combustivel", JOptionPane.PLAIN_MESSAGE);

    }
}
