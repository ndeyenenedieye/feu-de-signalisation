package tricolore;
import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JComponent;
import javax.swing.JFrame;
 abstract class FeuTricolore extends JPanel{
	 protected Statechart arrete;
	 protected AbstractStatechart enMarche;
	 Lampe L1,L2,L3;
         int a,b,c,d;
    FeuTricolore(int a, int b,int c,int d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        Lampe L1=new Lampe (Color.RED,a+10,b+20,c-20,c-20);
        Lampe L2=new Lampe (Color.ORANGE,a+10,b+80,c-20,c-20);
        Lampe L3=new Lampe (Color.GREEN,a+10,b+140,c-20,c-20);
    }
    public void paint(Graphics G){
    	 
    	 
        G.setColor(Color.BLACK);
         G.fillRect(a,b,c,d);
         G.setColor(L1.cc);
         G.fillOval(L1.a,L1.b,L1.c,L1.d);
         G.setColor(L2.cc);
         G.fillOval(L2.a,L2.b,L2.c,L2.d); 
         G.setColor(L3.cc);
         G.fillOval(L3.a,L3.b,L3.c,L3.d);
         G.setColor(L3.cc);
  
  
     }
 
   public static void showOnFrame(JComponent component, String frameName) {
         JFrame frame = new JFrame(frameName);
         WindowAdapter wa = new WindowAdapter() {
   public void windowClosing(WindowEvent e) {
                 System.exit(0);
             }
         };
         frame.addWindowListener(wa);
         frame.getContentPane().add(component);
         frame.pack();
         frame.setVisible(true);
         }
  

	 abstract void init_structure();
	 abstract void init_behavior();
	 abstract void start();

	} 
 

