import javax.swing.JOptionPane;

public class dialogoNombre
{
    public static void main(String[]args)
    {
     
     String nombre =JOptionPane.showInputDialog("digie su nombre");   
     
     
     String mensaje=
     String.format("bienvenido,  a la java",nombre);
     JOptionPane.showMessageDialog(null, mensaje);
        
    }
}
