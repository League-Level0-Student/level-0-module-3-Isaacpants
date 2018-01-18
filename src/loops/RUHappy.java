package loops;

import javax.swing.JOptionPane;

public class RUHappy {
	public static void main(String[] args) {

		String Happy = JOptionPane.showInputDialog("R u happy");

		if (Happy.equals("no")) {
			String Sad = JOptionPane.showInputDialog("DO u want to be happy");
			if (Sad.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}
			if (Sad.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever ur doing");

			}
			{

			}

		}
		if (Happy.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what ur doing");
		}
	}
}