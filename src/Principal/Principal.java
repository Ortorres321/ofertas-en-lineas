
package Principal;

import InterfacesGraficas.Registro;

public class Principal {
   
    public static void main(String[] args) {
        Registro login = new Registro();
        login.setBounds(0, 0, 1000, 700);
        login.setVisible(true);
        login.setResizable(false);
        login.setLocationRelativeTo(null);
       
        
    }
    
}
