


import javafx.scene.control.ComboBox;

import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class comboboxdemo extends JFrame
                          implements ItemListener{

    private JComboBox titlelist;
    private JTextField greeting = new JTextField(20);
    public comboboxdemo() {
        getContentPane().setLayout(new FlowLayout());
        String titles []= {"MR.","MS.","MRS.","DR."};
        titlelist = new JComboBox(titles);
        titlelist.addItem("PROFESSOR");
        getContentPane().add(titlelist);
        getContentPane().add(greeting);
        titlelist.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent itEv) {
        if (itEv.getSource() == titlelist) {
            String titleStr = (String) titlelist.getSelectedItem();
            greeting.setText("DEAR" + titleStr + "Jones");
        }
    }

    public static void main(String[] args) {
         comboboxdemo cBD =new comboboxdemo();
         cBD.setSize (400, 200);
         cBD.setVisible(true);
         cBD.setTitle("Combo box demo ");
         cBD.addWindowListener(
                 new WindowAdapter(){
                     public void windowClosing (WindowEvent e){
                         System.exit(0);

                     }
                 }
         );
    }
    }