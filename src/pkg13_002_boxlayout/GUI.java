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
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
    private JComboBox rechenzeichen = new JComboBox();
    private JButton rechenButton = new JButton("=");
    private JButton deleteButton = new JButton("Löschen");

    void start() {

        rechenPanel.add(ersteZahl);
        rechenzeichen.addItem(new Plus().getSymbol().toString());
        rechenzeichen.addItem(new Minus().getSymbol().toString());
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

    

    private class RechenButtonAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent ae) {
            int a, b = 0;
            
            try{
                
                a = Integer.parseInt(ersteZahl.getText());
                b = Integer.parseInt(zweiteZahl.getText());
                
            } catch (NumberFormatException ex){
                
                System.err.println("Nur Zahlen eingeben");
                        return;
            }
            
            JPanel ergebnisPanel = new JPanel();
            ergebnisPanel.setLayout(new BoxLayout(ergebnisPanel, BoxLayout.X_AXIS));
            String ergebnis = String.valueOf(((Rechenoperation) rechenzeichen.getSelectedItem()).rechne(a, b));
            
            JLabel antwortLabel = new JLabel(ergebnis);
            JButton del = new JButton();
            del.setAction(new DeleteButtonAction());
            del.setText("Löschen");
            
            ergebnisPanel.add(antwortLabel);
            ergebnisPanel.add(del);
            f.add(ergebnisPanel);
            
            f.pack();

        }

    }

    
    private class DeleteButtonAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent ae) {

            JButton del = (JButton) ae.getSource();
            del.getParent().removeAll();
            
            
            mainPanel.setSize(mainPanel.getPreferredSize());
            mainPanel.revalidate();
            mainPanel.getTopLevelAncestor().validate();
            mainPanel.repaint();
            f.pack();
        }

    }
}
