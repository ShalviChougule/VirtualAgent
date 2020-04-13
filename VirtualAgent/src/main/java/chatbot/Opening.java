package chatbot;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import org.springframework.stereotype.Component;

//@Component
public class Opening extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Opening frame = new Opening();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Opening() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ADMN\\Desktop\\irequest.png"));
		lblNewLabel.setBounds(0, 0, 1330, 711);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Click to chat with ibot");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ChatBot obj1=new ChatBot();
				obj1.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		btnNewButton.setBounds(982, 180, 229, 70);
		contentPane.add(btnNewButton);
	
	}
}
