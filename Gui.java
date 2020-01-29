
package gui;

import javax.swing.*;

public class Gui {
    
    public static void main(String[] args) {
  
      String a=JOptionPane.showInputDialog("what is your name",JOptionPane.QUESTION_MESSAGE);
         String b=JOptionPane.showInputDialog("enter first number",JOptionPane.QUESTION_MESSAGE);
         String c=JOptionPane.showInputDialog("enter second number",JOptionPane.QUESTION_MESSAGE);
        int d=Integer.parseInt(b);
        int e=Integer.parseInt(c);
        d=d+e;
        JOptionPane.showMessageDialog(null, "Wellcome '"+a+"' The sum is: "+d);
       
    }
}