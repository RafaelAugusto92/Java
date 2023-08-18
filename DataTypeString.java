package AprendendoJava;
import javax.swing.JOptionPane;

public class DataTypeString {
    public static void main (String [] args) {
        // String name = "Rafael";

        // switch(name) {
        //     case "josé":
        //     System.out.println("O nome não corresponde");
        //     break;
        //     case "Rafael":
        //     System.out.println("O nome corresponde");
        // }


        String nome = JOptionPane.showInputDialog(null, "Entre com um nome: ");

        switch(nome) {
            case "Rafael":
            JOptionPane.showMessageDialog(null, "acertou, é Rafael");
            break;
            case "José":
            JOptionPane.showMessageDialog(null, "errou");
            break;
            default:
            JOptionPane.showMessageDialog(null, "Mensagem não corresponde");
        }
    }
}





