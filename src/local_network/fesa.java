package local_network;
import java.awt.BorderLayout;

import javax.swing.*;
class fesa{
   public static void main(String args[]){
     JFrame frame = new JFrame("Router");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(600,600);
    JButton button1 = new JButton("Press");
    frame.getContentPane().add(button1);
    JPanel panel = new JPanel(); // the panel is not visible in output
    JLabel label = new JLabel("Enter Text");
    JTextField tf = new JTextField(10); // accepts upto 10 characters
    JButton send = new JButton("Send");
    JButton reset = new JButton("Reset");
    panel.add(label); // Components Added using Flow Layout
    panel.add(tf);
   // panel.add(send);
    panel.add(reset);
    JTextArea ta = new JTextArea();

    //Adding Components to the frame.
    frame.getContentPane().add(BorderLayout.SOUTH, panel);
   // frame.getContentPane().add(BorderLayout.NORTH, mb);
    frame.getContentPane().add(BorderLayout.CENTER, ta);
    frame.setVisible(true);
  }
}