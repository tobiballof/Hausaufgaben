/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_002_boxlayout;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Tobi
 */
class GUI {

    
    private JFrame f = new JFrame();
    private JPanel mainPanel = new JPanel(new GridLayout(0, 1));
    private JPanel rechenPanel = new JPanel(new FlowLayout());
    private JTextField ersteZahl = new JTextField();
    private JTextField zweiteZahl = new JTextField();
    private String[] zeichenArray = {"+", "-"};
    private JComboBox rechenzeichen = new JComboBox(zeichenArray);
    private JButton rechenButton = new JButton("=");
    private JButton deleteButton = new JButton("Löschen");

    void start() {

        
        rechenPanel.add(ersteZahl);
        rechenPanel.add(rechenzeichen);
        rechenPanel.add(zweiteZahl);
        rechenButton.setAction(new RechenButtonAction());
        rechenPanel.add(rechenButton);
        mainPanel.add(rechenPanel);
        f.add(mainPanel);

        f.setDefaultCloseOperation(3);
        f.setVisible(true);
        f.setLayout(new GridLayout(0, 1));
        f.pack();
    }

    private  class DeleteButtonAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            
        }

        
    }

    private class RechenButtonAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent ae) {
            int ergebnis = 0;
            JTextField ergebnisText = new JTextField();
            ergebnisText.setText(ergebnis + "");
            
            JPanel ergebnisPanel = new JPanel();
            Taschenrechner tr = new Taschenrechner();
            ergebnisPanel.add(ergebnisText);
            deleteButton.setAction(new DeleteButtonAction());
            ergebnisPanel.add(new JButton(new DeleteButtonAction()));
            f.add(ergebnisPanel);
            f.pack();
            
            
        }

        
    }

}
