package it.elis.appletlesson;

import javax.swing.JApplet;
import javax.swing.JLabel;
public class AppletWithParameterSwing extends JApplet {
  private String message;
  private String number;
  private JLabel viewMessage;
  private JLabel numText;
  public void init() {
    message = getParameter("message");
    if(message == null)
      message= "Manca il tag HTML message";
    viewMessage = new JLabel(message);
    number = getParameter("number");
    if(number != null) {
        try {
          int num = Integer.parseInt(number);
          numText = new JLabel(number);
        }catch(NumberFormatException e) {
          numText = new JLabel("Non è stato inserito un numero");
        }
      }else {
        numText = new JLabel("Manca il tag HTML number");
      }
    //aggiunti componenti al Container di alto livello
    this.getContentPane().add("Center", viewMessage);
    this.getContentPane().add("South", numText);
    }
  }