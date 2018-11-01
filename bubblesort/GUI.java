/*
 * Created by JFormDesigner on Mon Oct 15 12:23:03 CEST 2018
 */

package bubblesort;

import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author Paul Lamberti
 */
public class GUI extends JPanel {
    public GUI() {
        initComponents();
    }

    private void goButtonActionPerformed(ActionEvent e) {
        String range = rangeIn.getText();
        String lenght = lenghtIn.getText();
        String out[] = Bubblesort.sort(range, lenght);
        unorderedOut.setText(out[1]);
        output.setText(out[0]);
        time.setText(out[2] + " ms");
    }

    public static boolean checkButton() {
        boolean checked =false;
        if (rndBox.isSelected()) {
            checked = true;
        }
        return checked;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Paul Lamberti
        rndBox = new JCheckBox();
        hSpacer1 = new JPanel(null);
        label1 = new JLabel();
        lenghtIn = new JTextField();
        label2 = new JLabel();
        rangeIn = new JTextField();
        label3 = new JLabel();
        scrollPane2 = new JScrollPane();
        unorderedOut = new JTextPane();
        vSpacer1 = new JPanel(null);
        label4 = new JLabel();
        scrollPane1 = new JScrollPane();
        output = new JTextPane();
        vSpacer2 = new JPanel(null);
        label5 = new JLabel();
        scrollPane3 = new JScrollPane();
        time = new JTextPane();
        goButton = new JButton();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- rndBox ----
        rndBox.setText("random numbers");
        add(rndBox, "cell 0 0");
        add(hSpacer1, "cell 1 0,width 150:200:500");

        //---- label1 ----
        label1.setText("Length:");
        add(label1, "cell 0 2");
        add(lenghtIn, "cell 1 2");

        //---- label2 ----
        label2.setText("Range:");
        add(label2, "cell 0 3");
        add(rangeIn, "cell 1 3");

        //---- label3 ----
        label3.setText("Unsorted array:");
        add(label3, "cell 0 4");

        //======== scrollPane2 ========
        {
            scrollPane2.setViewportView(unorderedOut);
        }
        add(scrollPane2, "cell 1 4");
        add(vSpacer1, "cell 2 4,hmin 50");

        //---- label4 ----
        label4.setText("Sorted Array:");
        add(label4, "cell 0 5");

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(output);
        }
        add(scrollPane1, "cell 1 5");
        add(vSpacer2, "cell 2 5,hmin 50");

        //---- label5 ----
        label5.setText("Elapsed time:");
        add(label5, "cell 0 7");

        //======== scrollPane3 ========
        {
            scrollPane3.setViewportView(time);
        }
        add(scrollPane3, "cell 1 7");

        //---- goButton ----
        goButton.setText("Go");
        goButton.addActionListener(e -> goButtonActionPerformed(e));
        add(goButton, "cell 0 11");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Paul Lamberti
    private static JCheckBox rndBox;
    private JPanel hSpacer1;
    private JLabel label1;
    private JTextField lenghtIn;
    private JLabel label2;
    private JTextField rangeIn;
    private JLabel label3;
    private JScrollPane scrollPane2;
    private JTextPane unorderedOut;
    private JPanel vSpacer1;
    private JLabel label4;
    private JScrollPane scrollPane1;
    private JTextPane output;
    private JPanel vSpacer2;
    private JLabel label5;
    private JScrollPane scrollPane3;
    private JTextPane time;
    private JButton goButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
