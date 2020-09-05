import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave5 {

	public static void main(String[] args) 
	{
		
		final int personer = 10;
		for (int person = 1; person <= personer; person++)
		{
				int poeng = Integer.parseInt(showInputDialog("Poengsum " + person));
				
				while ((poeng < 0) || (poeng > 100)){
					showMessageDialog(null, "Ugyldig poengsum");
					poeng = Integer.parseInt(showInputDialog("Ny poengsum " + person + " er: "));
				}
				{
				
					if ((poeng < 101) && (poeng > 89)) {
						String karakter = "A";
						showMessageDialog(null, "Karakter: " + karakter);
					}
					if ((poeng < 90) && (poeng > 79)) {
						String karakter = "B";
						showMessageDialog(null, "Karakter: " + karakter);
					}
					if ((poeng < 80) && (poeng > 59)) {
						String karakter = "C";
						showMessageDialog(null, "Karakter: " + karakter);
					}
					if ((poeng < 60) && (poeng > 49)) {
						String karakter = "D";
						showMessageDialog(null, "Karakter: " + karakter);
					}
					if ((poeng < 50) && (poeng > 39)) {
						String karakter = "E";
						showMessageDialog(null, "Karakter: " + karakter);
					}
					if ((poeng < 40) && (poeng > -1)) {
						String karakter = "F";
						showMessageDialog(null, "Karakter: " + karakter);
				
				}
		}
	}	
}
}