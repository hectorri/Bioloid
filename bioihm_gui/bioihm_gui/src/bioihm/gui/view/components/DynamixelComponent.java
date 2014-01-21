package bioihm.gui.view.components;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import bioihm.gui.view.panel.DynamixelPanel;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;

/**
 * Representa el panel de controles de una actuador Dynamixel
 * 
 * @author hectorri
 *
 */
public class DynamixelComponent extends JPanel {

	/** Identificador de versión serie UID */
	private static final long serialVersionUID = 1L;
	private JTextField posAbsField;
	private JTextField posDegreeField;
	private JTextField speedField;
	private JTextField voltField;
	private JTextField tempField;

	/** Identificador del actuador */
	private int id;

	/**
	 * Create the panel.
	 */
	public DynamixelComponent(int id) {
		this.id = id;

		setBounds(new Rectangle(0, 0, 210, 85));
		setMaximumSize(new Dimension(210, 85));
		setSize(new Dimension(210, 85));
		setPreferredSize(new Dimension(335, 162));
		setMinimumSize(new Dimension(210, 85));
		setLayout(null);
		
		DynamixelPanel dynamixelPanel = new DynamixelPanel();
		dynamixelPanel.setBounds(10, 11, 66, 103);
		add(dynamixelPanel);
		dynamixelPanel.setLayout(null);
		
		JLabel idDxlLabel = new JLabel(String.valueOf(id));
		idDxlLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		idDxlLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idDxlLabel.setBounds(10, 46, 44, 44);
		dynamixelPanel.add(idDxlLabel);
		
		JSlider positionSlider = new JSlider();
		positionSlider.setBounds(60, 125, 216, 23);
		add(positionSlider);
		
		JButton increaseButton = new JButton("+");
		increaseButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		increaseButton.setBounds(286, 125, 40, 23);
		add(increaseButton);
		
		JButton decreaseButton = new JButton("-");
		decreaseButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		decreaseButton.setBounds(10, 125, 40, 23);
		add(decreaseButton);
		
		JPanel controlDynamixelPanel = new JPanel();
		controlDynamixelPanel.setBounds(86, 11, 240, 110);
		add(controlDynamixelPanel);
		controlDynamixelPanel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel posAbsLabel = new JLabel("Posici\u00F3n (0-1023):");
		controlDynamixelPanel.add(posAbsLabel, "2, 2, 3, 1, right, default");
		
		posAbsField = new JTextField();
		posAbsLabel.setLabelFor(posAbsField);
		controlDynamixelPanel.add(posAbsField, "6, 2, 3, 1, fill, default");
		posAbsField.setColumns(10);
		
		JLabel positionAbsDxlLabel = new JLabel("0");
		controlDynamixelPanel.add(positionAbsDxlLabel, "10, 2");
		positionAbsDxlLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel positionDegreeDxlLabel = new JLabel("0\u00BA");
		controlDynamixelPanel.add(positionDegreeDxlLabel, "10, 4");
		positionDegreeDxlLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton applyButton = new JButton("OK");
		controlDynamixelPanel.add(applyButton, "10, 6");
		applyButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel posDegreeLabel = new JLabel("Posici\u00F3n(0-360):");
		controlDynamixelPanel.add(posDegreeLabel, "2, 4, 3, 1, right, default");
		
		posDegreeField = new JTextField();
		posDegreeLabel.setLabelFor(posDegreeField);
		controlDynamixelPanel.add(posDegreeField, "6, 4, 3, 1, fill, default");
		posDegreeField.setColumns(10);
		
		JLabel speedLabel = new JLabel("Velocidad:");
		controlDynamixelPanel.add(speedLabel, "2, 6, 3, 1, right, default");
		
		speedField = new JTextField();
		speedLabel.setLabelFor(speedField);
		controlDynamixelPanel.add(speedField, "6, 6, 3, 1, fill, default");
		speedField.setColumns(10);
		
		JLabel voltLabel = new JLabel("Voltaje:");
		controlDynamixelPanel.add(voltLabel, "2, 8, right, default");
		
		voltField = new JTextField();
		voltLabel.setLabelFor(voltField);
		voltField.setEditable(false);
		voltField.setEnabled(false);
		controlDynamixelPanel.add(voltField, "4, 8, fill, default");
		voltField.setColumns(10);
		
		JLabel tempLabel = new JLabel("Temp.:");
		controlDynamixelPanel.add(tempLabel, "6, 8, right, default");
		
		tempField = new JTextField();
		tempLabel.setLabelFor(tempField);
		tempField.setEditable(false);
		tempField.setEnabled(false);
		controlDynamixelPanel.add(tempField, "8, 8, fill, default");
		tempField.setColumns(10);
		
		JCheckBox autoCheck = new JCheckBox("Auto.");
		controlDynamixelPanel.add(autoCheck, "10, 8");

	}
}
