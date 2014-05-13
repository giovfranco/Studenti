package it.appuntisoftware;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;

public class TestSwingGui {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * @wbp.nonvisual location=39,349
	 */
	private final Utente utente = new Utente();
	private JSpinner spinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestSwingGui window = new TestSwingGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestSwingGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("Nome");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, frame.getContentPane());
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, -121, SpringLayout.WEST, textField);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -75, SpringLayout.WEST, textField);
		springLayout.putConstraint(SpringLayout.WEST, textField, 131, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textField, 220, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cognome");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 26, SpringLayout.SOUTH, lblNewLabel);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, -63, SpringLayout.WEST, textField_1);
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 17, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, -120, SpringLayout.WEST, textField_1);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		spinner = new JSpinner();
		springLayout.putConstraint(SpringLayout.NORTH, spinner, 21, SpringLayout.SOUTH, textField_1);
		frame.getContentPane().add(spinner);
		
		JLabel lblNewLabel_2 = new JLabel("Et\u00E0");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 30, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_2, -121, SpringLayout.WEST, spinner);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_2, -75, SpringLayout.WEST, spinner);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Invia");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(utente.getNome());
				System.out.println(utente.getCognome());
				System.out.println(utente.getEtà());
			}
		});
		
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 33, SpringLayout.SOUTH, spinner);
		springLayout.putConstraint(SpringLayout.EAST, spinner, 46, SpringLayout.WEST, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 131, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textField_1, 89, SpringLayout.WEST, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, spinner, 0, SpringLayout.WEST, btnNewButton);
		frame.getContentPane().add(btnNewButton);
		initDataBindings();
	}
	protected void initDataBindings() {
		BeanProperty<Utente, String> utenteBeanProperty = BeanProperty.create("nome");
		BeanProperty<JTextField, String> jTextFieldBeanProperty = BeanProperty.create("text");
		AutoBinding<Utente, String, JTextField, String> autoBinding = Bindings.createAutoBinding(UpdateStrategy.READ_WRITE, utente, utenteBeanProperty, textField, jTextFieldBeanProperty);
		autoBinding.bind();
		//
		BeanProperty<Utente, String> utenteBeanProperty_1 = BeanProperty.create("cognome");
		BeanProperty<JTextField, String> jTextFieldBeanProperty_1 = BeanProperty.create("text");
		AutoBinding<Utente, String, JTextField, String> autoBinding_1 = Bindings.createAutoBinding(UpdateStrategy.READ_WRITE, utente, utenteBeanProperty_1, textField_1, jTextFieldBeanProperty_1);
		autoBinding_1.bind();
		//
		BeanProperty<Utente, Integer> utenteBeanProperty_2 = BeanProperty.create("età");
		BeanProperty<JSpinner, Object> jSpinnerBeanProperty = BeanProperty.create("value");
		AutoBinding<Utente, Integer, JSpinner, Object> autoBinding_2 = Bindings.createAutoBinding(UpdateStrategy.READ_WRITE, utente, utenteBeanProperty_2, spinner, jSpinnerBeanProperty);
		autoBinding_2.bind();
	}
}
