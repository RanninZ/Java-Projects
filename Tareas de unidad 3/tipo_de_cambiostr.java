import javax.swing.JOptionPane;



public class tipo_de_cambiostr {
    public static void main (String [] args){
        double pesoMex, tipoCambio, dolares;
        String pesoMexstr, tipoCambiostr
        ;

        pesoMexstr = JOptionPane.showInputDialog( "Ingresa tus pesos mexicanos: ");
        tipoCambiostr = JOptionPane.showInputDialog("Ingesa el tipo de cambio actual del dolar: ");

        pesoMex = Integer.parseInt(pesoMexstr);
        tipoCambio  = Integer.parseInt(tipoCambiostr);
        

        dolares = (pesoMex / tipoCambio);

        JOptionPane.showMessageDialog(null, "Tus: $"+pesoMex+" son: $"+dolares+" dolares.");

    } 
}
