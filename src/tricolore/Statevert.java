package tricolore;
import java.awt.Color;
import java.awt.*;
import javax.swing.*;
public  class Statevert<AbstractStatechart_monitor> extends FeuTricolore{

	private static final String Orange = null;
	private static final String Rouge = null;
	private static final String VERT = null;
	
	public Statevert(int a,int b,int c,int d) {
		    super(a,b,c,d);
		
		// TODO Auto-generated constructor stub
	}	

   protected tricolore.stateMachine stateMachine;
    private Statechart orange;
       
   protected void init_structure()
    {
  }

    protected void init_behavior(Statechart rouge, Statechart vert, Statechart orange) throws Statechart_exception 
    {

	arrete = new Statechart("Arrete");
	arrete.inputState();

	rouge = new Statechart("Rouge");
	vert = new Statechart("Vert");
	orange = new Statechart("orange");
	rouge.inputState();

	enMarche = ((Statechart) rouge.xor(vert)).xor(orange).name("En Marche");
    }

    protected void start(String vert, String rouge) throws Statechart_exception 
    {	
	stateMachine = new stateMachine(arrete.xor(enMarche), 
					      "Feu Tricolore", true);

	stateMachine.fires("passerRouge", Orange, rouge);
	stateMachine.fires("passerVert", rouge, vert);
	stateMachine.fires("passerOrange", vert, Rouge);
	
	stateMachine.fires("demarrer", arrete, enMarche);
	stateMachine.fires("arreter", enMarche, arrete);
	
	Statechart_monitor_viewer viewer = new Statechart_monitor_viewer();
	stateMachine.add_listener(viewer);
    stateMachine.initialize_listener();
        viewer.show();
	}

	@Override
	void init_behavior() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void start() {
		// TODO Auto-generated method stub
		
	}

	
	
		// TODO Auto-generated method stub
		
	}

