import static javax.swing.JOptionPane.*;

public class Oppgave6 {

	public static void main(String[] args) 
	{
		int tall = Integer.parseInt(showInputDialog("n! = 1*2*3*…*(n-1)*n" + "\nSkriv inn et naturlig tall: "));
		
		while (tall < 1) {
			showMessageDialog(null, "Ugyldig tall!");
			tall = Integer.parseInt(showInputDialog("Skriv inn et nytt naturlig tall: "));
			}

		showMessageDialog(null, "n! = 1*2*3*…*(n-1)*n" + "\nn! av " + tall + " = " + factorial(tall));
	}
		static int factorial(int n)
		{
			if (n==0)
				return 1;
			
			return n*factorial(n-1)*n;
	
		}
}