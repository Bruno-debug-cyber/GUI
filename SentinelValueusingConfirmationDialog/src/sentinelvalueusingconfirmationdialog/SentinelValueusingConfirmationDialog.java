/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentinelvalueusingconfirmationdialog;

/**
 *
 * @author BRUNO
 */
import javax.swing.JOptionPane;

public class SentinelValueusingConfirmationDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        
        //Keep reading dat until the user answers No 
        
        int option = 0;
        while (option == JOptionPane.YES_OPTION) {
            // READ THE NEXT DATA
           String dataString = JOptionPane.showInputDialog("Enter a number: ") ;
           int data = Integer.parseInt(dataString);
           
           sum += data;
           
           option = JOptionPane.showConfirmDialog(null, "Continue?");
        }
        JOptionPane.showMessageDialog(null, "The sum is " + sum);
    }
    
}
