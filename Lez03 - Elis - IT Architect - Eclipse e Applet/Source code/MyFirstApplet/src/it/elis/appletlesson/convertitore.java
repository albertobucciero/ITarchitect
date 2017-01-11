package it.elis.appletlesson;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;


public class convertitore implements TextListener { 
	double tasso; 
	TextComponent out; 
	convertitore(TextComponent output, double tasso){ 
		this.out = output; 
		this.tasso = tasso; } 
	public void textValueChanged(TextEvent e) { 
		TextComponent c = (TextComponent)e.getSource(); 
		double d = 0; String s = ""; 
		d = Double.parseDouble(c.getText()); 
		s += (d*tasso); 
		out.setText(s); }
	
	}
