
package boletin9_4;

import javax.swing.JOptionPane;


public class MultiplicaNum {
    
    
    
    
    public void multiplica(int num){
        
        int i =1;
        num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca o número a multiplicar "));
        do {
            
            
           JOptionPane.showMessageDialog(null,+num+" * "+ i + " e " + " = "+ " a "+(num*i));
            i++;
            
        }while(i<=10&&i>0);
        
    }
}
