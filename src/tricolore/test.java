package tricolore;

public class test {
	private static final int i  = 0;

	{
		try {
	         Lampe feu = new  Lampe(null, 0, 0, 0, 0);
		    Thread.sleep(2000);
		    feu.demarrer();
		    int i = 0;
		    while(i++ < 4)
			{ 
			    Thread.sleep(5000);
			    feu.passerVert();
			    Thread.sleep(3000);
			    feu.passerRouge();
			    Thread.sleep(2000);
			    feu.passerOrange();
			}
		    feu.arreter();
		} catch(Throwable t) {
		    System.err.println(" ** Pb : "+t);
	        }
	    }
	}


