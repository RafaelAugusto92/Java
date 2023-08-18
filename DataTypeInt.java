package AprendendoJava;

import javax.swing.JOptionPane;

public class DataTypeInt {
    public static void main(String [] args){
        int myNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));

        switch(myNumber){
            case 10:
            System.out.println("Acertouuu");
            break;
            case 20:
            System.out.println("Errou");
            break;
            default:
            JOptionPane.showMessageDialog(null, "não é nenhum desses");
            break;
        }
    }
    
}
