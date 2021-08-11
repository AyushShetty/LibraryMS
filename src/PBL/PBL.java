/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBL;

/**
 *
 * @author Shubham
 */
public class PBL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
      // Form f = new Form();
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableSelector().setVisible(true);
            }
        });
       
    }
    
}
