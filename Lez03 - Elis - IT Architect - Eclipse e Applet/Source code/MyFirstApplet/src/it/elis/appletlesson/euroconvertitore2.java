package it.elis.appletlesson;

/*<applet code="euroConvertitore.class" width="380"
height="100">
</applet>*/

import java.awt.*;
import java.applet.*;
import it.elis.appletlesson.convertitore;

@SuppressWarnings("serial")
public class euroconvertitore2 extends Applet {
/*public void init() {
this.add(new Label("Euro Convertitore"));
TextField lire = new TextField(10);
TextField euro = new TextField(10);
this.add(new Label("Lire"));
this.add(lire);
this.add(new Label("Euro"));
this.add(euro);
}
}*/
	
public void init() {
this.setLayout(new BorderLayout());
Panel p = new Panel();
Panel p2 = new Panel();
p2.add(new Label("Euro Convertitore 2"));
this.add(p2, BorderLayout.NORTH);
this.add(p, BorderLayout.CENTER);
TextField lire = new TextField(10);
TextField euro = new TextField(10);
convertitore l2e = new convertitore(euro,(1/1936.27));
convertitore e2l = new convertitore(lire,1936.27);
lire.addTextListener(l2e);
euro.addTextListener(e2l);
p.add(new Label("Lire"));
p.add(lire);
p.add(new Label("Euro"));
p.add(euro);
}

}
