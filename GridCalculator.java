import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class GridCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	String abc="";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridCalculator frame = new GridCalculator();
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
	public GridCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(5, 5, 424, 50);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("0");
		btnNewButton_1.setBounds(5, 55, 106, 50);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abc=abc+"0";
				textField.setText(abc);
			}
		});
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(111, 5, 106, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(217, 5, 106, 50);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(323, 5, 106, 50);
		contentPane.add(lblNewLabel_2);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBounds(111, 55, 106, 50);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abc=abc+"1";
				textField.setText(abc);
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("2");
		btnNewButton_3.setBounds(217, 55, 106, 50);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abc=abc+"2";
				textField.setText(abc);
			}
		});
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setBounds(323, 55, 106, 50);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abc=abc+"3";
				textField.setText(abc);
			}
		});
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBounds(5, 105, 106, 50);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abc=abc+"4";
				textField.setText(abc);
			}
		});
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_8 = new JButton("5");
		btnNewButton_8.setBounds(111, 105, 106, 50);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abc=abc+"5";
				textField.setText(abc);
			}
		});
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setBounds(217, 105, 106, 50);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abc=abc+"6";
				textField.setText(abc);
			}
		});
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.setBounds(323, 105, 106, 50);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abc=abc+"7";
				textField.setText(abc);
			}
		});
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.setBounds(5, 155, 106, 50);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abc=abc+"8";
				textField.setText(abc);
			}
		});
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.setBounds(111, 155, 106, 50);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abc=abc+"9";
				textField.setText(abc);
			}
		});
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Enter");
		btnNewButton_10.setBounds(323, 155, 106, 100);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int g=0;
			}
		});
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("+");
		btnNewButton_11.setBounds(217, 155, 106, 50);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abc=abc+"+";
				textField.setText(abc);
			}
		});
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.setBounds(5, 205, 106, 50);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abc=abc+"-";
				textField.setText(abc);
			}
		});
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("/");
		btnNewButton_13.setBounds(111, 205, 106, 50);
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abc=abc+"/";
				textField.setText(abc);
			}
		});
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("*");
		btnNewButton_14.setBounds(217, 205, 106, 50);
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abc=abc+"*";
				textField.setText(abc);
			}
		});
		contentPane.add(btnNewButton_14);
	}

}
