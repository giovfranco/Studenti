import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Window.Type;




public class main extends JFrame {

	private JFrame frame;
	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public main() {
/*		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		setTitle("Orologio");
		
		JLabel lblNewLabel = new JLabel("Nome");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, frame.getContentPane());
		frame.getContentPane().add(lblNewLabel);		
*/
		//contentPane = new JPanel();
		//this.setLocationRelativeTo(null);				
/*
*/		
		contentPane = new JPanel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 300, 100);

		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Panel panel = new Panel();
		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.setBackground(Color.CYAN);

		JLabel orario = new JLabel();	
		
		//orario.setAlignmentX(100);
//		orario.setAlignment(Label.CENTER);
		orario.setBackground(Color.BLUE);
		orario.setForeground(Color.BLACK);
		contentPane.add(orario, BorderLayout.CENTER);
		contentPane.setForeground(Color.BLACK);
		
		this.setLocationRelativeTo(null);	
		
		Thread t = new Thread(new orologio(orario));
		t.start();


	}

}
