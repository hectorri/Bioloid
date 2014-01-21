package bioihm.process;

import bioihm.gui.view.window.BioloidControlsFrame;

public class Bioihm {

	private static BioloidControlsFrame bioloidWindow;
	
	public static void main(String[] args) {
		bioloidWindow = new BioloidControlsFrame();
		bioloidWindow.setVisible(true);
	}
}
