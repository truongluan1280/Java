/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import com.sun.java.accessibility.util.AWTEventMonitor;
/**
 *
 * @author luan
 */
public class ThucHanhbuoi1 {  
public static void main(String[] agrs){
    Frame f = new Frame("My Frst Window");
    f.setBounds (0, 0, 500, 200);
    f.setLayout (new FlowLayout());
    lblA = new Label("a=");
    f.add(lblA);
    txtA = new TextField(40);
    f.add(txtA);
    lblB = new Label("b=");
    f.add(lblB);
    txtB = new TextField(40);
    f.add(txtB);
    Button bt1 = new Button("+");
    bt1.addActionListener(new LangNgheCong());
    f.add(bt1);
    Button bt2 = new Button("-");
    bt2.addActionListener(new LangNgheTru());
    f.add(bt2);
    Button bt3 = new Button("*");
    bt3.addActionListener(new LangNgheNhan());
    f.add(bt3);
    Button bt4 = new Button("/");
    bt4.addActionListener(new LangNgheChia());
    f.add(bt4);
    lblKQ = new Label("KQ");
    f.add(lblKQ);
    txtKQ = new TextField(40);
    f.add(txtKQ);
    f.setVisible(true);
}
  static class LangNgheCong  implements ActionListener 
   {
       public void actionPerformed(ActionEvent evt)
       {
           int a = Integer.parseInt(txtA.getText());
           int b = Integer.parseInt(txtB.getText());
           int Tong = a+b;
           txtKQ.setText(String.valueOf(Tong));
       }
    }
 static class LangNgheTru  implements ActionListener 
   {
       public void actionPerformed(ActionEvent evt)
       {
           int a = Integer.parseInt(txtA.getText());
           int b = Integer.parseInt(txtB.getText());
           int Tong = a-b;
           txtKQ.setText(String.valueOf(Tong));
       }
    }
 static class LangNgheNhan  implements ActionListener 
   {
       public void actionPerformed(ActionEvent evt)
       {
           int a = Integer.parseInt(txtA.getText());
           int b = Integer.parseInt(txtB.getText());
           int Tong = a*b;
           txtKQ.setText(String.valueOf(Tong));
       }
    }
 static class LangNgheChia  implements ActionListener 
   {
       public void actionPerformed(ActionEvent evt)
       {
           int a = Integer.parseInt(txtA.getText());
           int b = Integer.parseInt(txtB.getText());
           int Tong = a/b;
           txtKQ.setText(String.valueOf(Tong));
       }
    }
   static Label lblA, lblB,lblKQ;
   static TextField txtA, txtB, txtKQ;
   static Button bt1, bt2, bt3, bt4;
}