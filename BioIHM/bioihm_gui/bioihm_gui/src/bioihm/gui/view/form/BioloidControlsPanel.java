package bioihm.gui.view.form;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import bioihm.gui.view.components.DynamixelComponent;

/**
 * Panel que representa los controles de los actuadores del Robot
 * 
 * @author hectorri
 *
 */
public class BioloidControlsPanel extends JPanel {

	/** Identificador de versión serie */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public BioloidControlsPanel() {
		setLayout(null);
		
		DynamixelComponent dynamixel1 = new DynamixelComponent(1);
		dynamixel1.setBorder(new TitledBorder(null, "Hombro derecho", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		dynamixel1.setBounds(0, 0, 335, 162);
		add(dynamixel1);
		
		DynamixelComponent dynamixel2 = new DynamixelComponent(2);
		dynamixel2.setBorder(new TitledBorder(null, "Hombro izquierdo", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		dynamixel2.setBounds(340, 0, 335, 162);
		add(dynamixel2);
		
		DynamixelComponent dynamixel3 = new DynamixelComponent(3);
		dynamixel3.setBorder(new TitledBorder(null, "Brazo derecho", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		dynamixel3.setBounds(680, 0, 335, 162);
		add(dynamixel3);
		
		DynamixelComponent dynamixel4 = new DynamixelComponent(4);
		dynamixel4.setBorder(new TitledBorder(null, "Brazo izquierdo", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		dynamixel4.setBounds(1020, 0, 335, 162);
		add(dynamixel4);
		
		DynamixelComponent dynamixel5 = new DynamixelComponent(5);
		dynamixel5.setBorder(new TitledBorder(null, "Codo izquierdo", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		dynamixel5.setBounds(0, 165, 335, 162);
		add(dynamixel5);
		
		DynamixelComponent dynamixel6 = new DynamixelComponent(6);
		dynamixel6.setBorder(new TitledBorder(null, "Codo derecho", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		dynamixel6.setBounds(340, 165, 335, 162);
		add(dynamixel6);
		
		DynamixelComponent dynamixel7 = new DynamixelComponent(7);
		dynamixel7.setBorder(new TitledBorder(null, "Rotación izquierda", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		dynamixel7.setBounds(680, 165, 335, 162);
		add(dynamixel7);
		
		DynamixelComponent dynamixel8 = new DynamixelComponent(8);
		dynamixel8.setBorder(new TitledBorder(null, "Rotación derecha", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		dynamixel8.setBounds(1020, 165, 335, 162);
		add(dynamixel8);
		
		DynamixelComponent dynamixel9 = new DynamixelComponent(9);
		dynamixel9.setBorder(new TitledBorder(null, "Inclinación izquierda", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		dynamixel9.setBounds(0, 330, 335, 162);
		add(dynamixel9);
		
		DynamixelComponent dynamixel10 = new DynamixelComponent(10);
		dynamixel10.setBorder(new TitledBorder(null, "Inclinación derecha", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		dynamixel10.setBounds(340, 330, 335, 162);
		add(dynamixel10);
		
		DynamixelComponent dynamixel11 = new DynamixelComponent(11);
		dynamixel11.setBorder(new TitledBorder(null, "Pierna izquierda", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		dynamixel11.setBounds(680, 330, 335, 162);
		add(dynamixel11);
		
		DynamixelComponent dynamixel12 = new DynamixelComponent(12);
		dynamixel12.setBorder(new TitledBorder(null, "Pierna derecha", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		dynamixel12.setBounds(1020, 330, 335, 162);
		add(dynamixel12);
		
		DynamixelComponent dynamixel13 = new DynamixelComponent(13);
		dynamixel13.setBorder(new TitledBorder(null, "Rodilla izquierda", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		dynamixel13.setBounds(0, 495, 335, 162);
		add(dynamixel13);
		
		DynamixelComponent dynamixel14 = new DynamixelComponent(14);
		dynamixel14.setBorder(new TitledBorder(null, "Rodilla derecha", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		dynamixel14.setBounds(340, 495, 335, 162);
		add(dynamixel14);
		
		DynamixelComponent dynamixel15 = new DynamixelComponent(15);
		dynamixel15.setBorder(new TitledBorder(null, "Pie izquierdo", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		dynamixel15.setBounds(680, 495, 335, 162);
		add(dynamixel15);
		
		DynamixelComponent dynamixel16 = new DynamixelComponent(16);
		dynamixel16.setBorder(new TitledBorder(null, "Pie derecho", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		dynamixel16.setBounds(1020, 495, 335, 162);
		add(dynamixel16);
		
		DynamixelComponent dynamixel17 = new DynamixelComponent(17);
		dynamixel17.setBorder(new TitledBorder(null, "Tobillo izquierdo", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		dynamixel17.setBounds(0, 660, 335, 162);
		add(dynamixel17);
		
		DynamixelComponent dynamixel18 = new DynamixelComponent(18);
		dynamixel18.setBorder(new TitledBorder(null, "Tobillo derecho", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		dynamixel18.setBounds(340, 660, 335, 162);
		add(dynamixel18);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(680, 668, 675, 154);
		add(textArea);

	}
}
