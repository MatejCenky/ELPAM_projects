/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other;

import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author Matus
 */
public class AddingItemToComboBox {

  public static void main(String[] a) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JComboBox jComboBox1 = new JComboBox();
    jComboBox1.addItem("asdf");
    Object cmboitem = jComboBox1.getSelectedItem();
    System.out.println(cmboitem);

    frame.add(jComboBox1);

    frame.setSize(300, 200);
    frame.setVisible(true);
  }    
}
