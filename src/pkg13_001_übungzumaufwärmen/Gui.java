/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_001_übungzumaufwärmen;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author B201
 */
class Gui {

    private JFrame frame = new JFrame();
    private JTextField text = new JTextField();
    private JLabel label = new JLabel();
    private JButton button = new JButton();
    private DefaultListModel model = new DefaultListModel();
    private JList list = new JList(model);
    private JScrollPane scroller = new JScrollPane(list);
    private JComboBox box = new JComboBox();

    public void start() {

        frame.add(text);
        frame.add(box);
        box.addItem(new Reverse());
        box.addItem(new Marlon());
        box.addItem(new UpperDowner());
        frame.add(label);
        button.setAction(new ButterAction());
        button.setText("GO");
        frame.add(button);
        frame.add(scroller);

        list.addListSelectionListener(new stalker());
        frame.setLayout(new GridLayout(2, 2));

        frame.setTitle("App");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

    }

    private class stalker implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {

           /* text.setText((String) model.getElementAt(list.getSelectedIndex()));
            label.setText(((Aenderer) box.getSelectedItem()).manipuliere(text.getText()));*/

        }
    }

    private class ButterAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {

            String alt = text.getText();
            String neu = new StringBuilder(alt).reverse().toString();
            label.setText(((Aenderer) box.getSelectedItem()).manipuliere(text.getText()));
            //text.setText("");

            model.addElement(alt + " <-> " + neu);
            frame.pack();

        }
    }

}
