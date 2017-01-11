package it.elis.appletlesson;

import java.awt.*;
import java.applet.Applet;
import java.util.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class applet2 extends Applet implements ActionListener
{
  Button P1, P2;
  TextField testo;
  public void init() {
    P1=new Button("pari");
    add(P1);
    P1.addActionListener(this);
    P2=new Button("dispari");
    add(P2);
    P2.addActionListener(this);
    testo =new TextField();
    testo.setColumns(30);
    add(testo);
  }
  
//implementiamo il metodo actionPerformed()
 public void actionPerformed(ActionEvent ae) {
   int i,a;
   String valore;
   Random r=new Random();
   a=Math.abs(r.nextInt())%2;
   valore=(String) ae.getActionCommand();
   if ((a==0)&&(valore.equals("pari")))
     testo.setText(" Hai vinto!");
   else if ((a==1)&&(valore.equals("dispari")))
    testo.setText(" Hai vinto!");
   else testo.setText(" Hai perso!");
 }
}