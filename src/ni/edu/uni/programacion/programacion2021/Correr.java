/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.programacion2021;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author jahp0
 */
public class Correr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
     * @param args the command line arguments
     */
SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            ConversorMoneda  gui = new ConversorMoneda();
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(gui);
            frame.pack();
            frame.setVisible(true);
        }
    });
    
    
        
        
        
        
        
        
        
    }
    
}
