package it.elis.appletlesson;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;


public class convertitore3 implements TextListener, FocusListener { 
	double tasso; 
	TextComponent out; 
	boolean editing = false;
	convertitore3(TextComponent output, double tasso){ 
		this.out = output; 
		this.tasso = tasso; } 
	public void textValueChanged(TextEvent e) { 
		TextComponent c = (TextComponent)e.getSource(); 
		double d = 0; String s = ""; 
		d = Double.parseDouble(c.getText()); 
		s += (d*tasso); 
		if (editing)
		out.setText(s);
		}
		public void focusGained(FocusEvent e) {
		editing = true;
		}
		public void focusLost(FocusEvent e) {
		editing = false;
		}
	
	}