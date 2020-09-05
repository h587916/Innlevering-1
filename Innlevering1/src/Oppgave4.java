import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class Oppgave4 {

	public static void main(String[] args) 
	{
		showMessageDialog(null, "Utregning av trinnskatt");
		int inntekt = Integer.parseInt(showInputDialog("Bruttoinntekt: "));
		
		if (inntekt < 164101) {
			double trinn = (inntekt/100*0);
			showMessageDialog(null, "Trinnskatt = " + trinn + " kr");
			}
		
		if ((inntekt < 230951) && (inntekt > 164100)) {
			double trinn = (inntekt/100*0.93);
			showMessageDialog(null, "Trinnskatt = " + trinn + " kr");
			}
		
		if ((inntekt < 580651) && (inntekt > 230950)) {
			double trinn = (inntekt/100*2.41);
			showMessageDialog(null, "Trinnskatt = " + trinn + " kr");
			}
		
		if ((inntekt < 934051) && (inntekt > 580650)) {
			double trinn = (inntekt/100*11.52);
			showMessageDialog(null, "Trinnskatt = " + trinn + " kr");
			}
		
		if (inntekt > 934050) {
			double trinn = (inntekt/100*14.52);
			showMessageDialog(null, "Trinnskatt = " + trinn + " kr");			
			}		

	}

}
