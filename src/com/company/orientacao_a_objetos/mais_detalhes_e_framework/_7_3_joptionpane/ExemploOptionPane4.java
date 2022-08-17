package com.company.orientacao_a_objetos.mais_detalhes_e_framework._7_3_joptionpane;

import javax.swing.*;

public class ExemploOptionPane4 {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        Object[] possibilidades = {"Masculino " , "Feminino"};
        String sexo = (String) JOptionPane.showInputDialog(null , "Selecione sexo" , "SENAI" , JOptionPane.PLAIN_MESSAGE , null , possibilidades , possibilidades[0]);
        System.out.printf("Sexo selecionado: " + sexo);

        String nome = (String) JOptionPane.showInputDialog(null , "Digite seu nome" , "SENAI" , JOptionPane.PLAIN_MESSAGE , null , null , null);
        System.out.println("Seu nome é: " + nome);
    }
}
