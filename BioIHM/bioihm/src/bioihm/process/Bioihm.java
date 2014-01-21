package bioihm.process;

import bioihm.gui.view.window.BioloidControlsFrame;

/**
 * Clase principal
 * 
 * @author hectorri
 *
 */
public class Bioihm {

	private static BioloidControlsFrame bioloidWindow;
	
	public static void main(String[] args) {
		bioloidWindow = new BioloidControlsFrame();
		bioloidWindow.setVisible(true);
	}
}
