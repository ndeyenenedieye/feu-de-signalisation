package tricolore;
import java.awt.*;
import javax.security.sasl.SaslException;
import javax.swing.*;
import java.awt.Color;
import java.awt.Color;

public class Lampe {
	int a,b,c,d;
        Color cc;
	private Object stateMachine;
public Lampe(Color cc,int a,int b,int c,int d) {
	    this.cc=cc;
	    this.a=a;
	    this.b=b;
	    this.c=c;
	    this.d=d;
	    }
    protected static String orange;
    protected static String vert;
    protected static String rouge;
	
	public void passerVert() {
		// TODO Auto-generated method stub
	  System.out.println("passerVert");
	    }
	
	public void passerRouge() {
		// TODO Auto-generated method stub
	  System.out.println("passerRouge");
	}
	public void passerOrange() {
		// TODO Auto-generated method stub
		System.out.println("passerOrange");
	}
	public void arreter() {
		// TODO Auto-generated method stub
	  System.out.println("arreter");
	}

     public void demarrer1() {
      System.out.println("demarrer");
    }
	
	
    public String verbose(Lampe stateMachine) {
       return stateMachine.verbose(stateMachine);
}

   public String name(Lampe stateMachine) {
    return stateMachine.name(stateMachine);
}

public void to_state(String name, Lampe stateMachine) throws SaslException {
    stateMachine.to_state(name, stateMachine);
}

public String current_state(Lampe stateMachine) {
    return stateMachine.current_state(stateMachine);
}

public boolean in_state(String name, Lampe stateMachine) {
    return 
    		
    stateMachine.in_state(name, stateMachine);
}

protected void demarrer() {
	// TODO Auto-generated method stub
	
}

}
