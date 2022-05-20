import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Font;


public class Calculadora extends JFrame {


		private JFrame frame;
	    private JTextField caja;
	    private JButton btnNewButton;
	    private JButton btnNewButton_1;
	    private JButton btnNewButton_2;
	    private JButton btnNewButton_3;
	    private JButton btnNewButton_4;
	    private JButton btnNewButton_5;
	    private JButton btnNewButton_6;
	    private JButton btnNewButton_7;
	    private JButton btnNewButton_8;
	    private JButton btnNewButton_9;
	    private JButton btnNewButton_10;
	    private JButton btnNewButton_12;
	    private JButton btnNewButton_13;
	    private JButton btnNewButton_14;
	    private JButton btnNewButton_15;
	    private JButton btnNewButton_16;
	    private JButton btnNewButton_18;
	    private double calculo;
	    private int[] operacion = {0,0,0,0};
	    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
        frame.setBounds(100, 100, 310, 464);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        caja = new JTextField();
        caja.setHorizontalAlignment(SwingConstants.RIGHT);
        caja.setBounds(10, 26, 276, 37);
        frame.getContentPane().add(caja);
        caja.setColumns(10);
        JPanel panel = new JPanel();
        panel.setBackground(new Color(51, 204, 204));
        panel.setBounds(0, 0, 296, 427);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        btnNewButton = new JButton("C");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText("");
            }
        });
        btnNewButton.setBounds(10, 93, 52, 42);
        panel.add(btnNewButton);
        btnNewButton_1 = new JButton("/");
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculo += Double.valueOf(caja.getText());
                caja.setText(null);
                operacion[3]=1;
            }
        });
        btnNewButton_1.setBounds(84, 93, 42, 42);
        panel.add(btnNewButton_1);
        btnNewButton_2 = new JButton("*");
        btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculo += Double.valueOf(caja.getText());
                caja.setText(null);
                operacion[2]=1;
            }
        });
        btnNewButton_2.setBounds(148, 93, 42, 42);
        panel.add(btnNewButton_2);
        btnNewButton_3 = new JButton("_");
        btnNewButton_3.setVerticalAlignment(SwingConstants.TOP);
        btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculo += Double.valueOf(caja.getText());
                caja.setText(null);
                operacion[1]=1;
            }
        });
        btnNewButton_3.setBounds(228, 93, 58, 42);
        panel.add(btnNewButton_3);
        btnNewButton_7 = new JButton("+");
        btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculo += Double.valueOf(caja.getText());
                caja.setText(null);
                operacion[0]=1;
            }
        });
        btnNewButton_7.setBounds(228, 158, 58, 106);
        panel.add(btnNewButton_7);
        btnNewButton_12 = new JButton("1");
        btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText(caja.getText()+"1");
            }
        });
        btnNewButton_12.setBounds(20, 287, 42, 42);
        panel.add(btnNewButton_12);
        btnNewButton_15 = new JButton("=");
        btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(operacion[0]==1) {
                    calculo += Double.valueOf(caja.getText());
                    caja.setText(String.valueOf(calculo));
                    calculo = 0;
                    operacion[0]=0;
                }else if(operacion[1]==1) {
                    calculo -= Double.valueOf(caja.getText());
                    caja.setText(String.valueOf(calculo));
                    calculo = 0;
                    operacion[1]=0;
                }else if(operacion[2]==1) {
                    calculo *= Double.valueOf(caja.getText());
                    caja.setText(String.valueOf(calculo));
                    calculo = 0;
                    operacion[2]=0;
                }else if(operacion[3]==1) {
                    calculo /= Double.valueOf(caja.getText());
                    caja.setText(String.valueOf(calculo));
                    calculo = 0;
                    operacion[3]=0;
                }
            }
        });
        btnNewButton_15.setBounds(228, 287, 58, 109);
        panel.add(btnNewButton_15);
        btnNewButton_16 = new JButton("0");
        btnNewButton_16.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText(caja.getText()+"0");
            }
        });
        btnNewButton_16.setBounds(21, 354, 105, 42);
        panel.add(btnNewButton_16);
        btnNewButton_18 = new JButton(".");
        btnNewButton_18.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText(caja.getText()+".");
            }
        });
        btnNewButton_18.setBounds(148, 354, 42, 42);
        panel.add(btnNewButton_18);
        JButton btnNewButton_12_1 = new JButton("2");
        btnNewButton_12_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_12_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText(caja.getText()+"2");
            }
        });
        btnNewButton_12_1.setBounds(84, 287, 42, 42);
        panel.add(btnNewButton_12_1);
        JButton btnNewButton_12_2 = new JButton("3");
        btnNewButton_12_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_12_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText(caja.getText()+"3");
            }
        });
        btnNewButton_12_2.setBounds(148, 287, 42, 42);
        panel.add(btnNewButton_12_2);
        JButton btnNewButton_12_3 = new JButton("4");
        btnNewButton_12_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_12_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText(caja.getText()+"4");
            }
        });
        btnNewButton_12_3.setBounds(20, 222, 42, 42);
        panel.add(btnNewButton_12_3);
        JButton btnNewButton_12_4 = new JButton("7");
        btnNewButton_12_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_12_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText(caja.getText()+"7");
            }
        });
        btnNewButton_12_4.setBounds(20, 158, 42, 42);
        panel.add(btnNewButton_12_4);
        JButton btnNewButton_12_5 = new JButton("5");
        btnNewButton_12_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_12_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText(caja.getText()+"5");
            }
        });
        btnNewButton_12_5.setBounds(84, 222, 42, 42);
        panel.add(btnNewButton_12_5);
        JButton btnNewButton_12_6 = new JButton("8");
        btnNewButton_12_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_12_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText(caja.getText()+"8");
            }
        });
        btnNewButton_12_6.setBounds(84, 158, 42, 42);
        panel.add(btnNewButton_12_6);
        JButton btnNewButton_12_7 = new JButton("9");
        btnNewButton_12_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_12_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText(caja.getText()+"9");
            }
        });
        btnNewButton_12_7.setBounds(148, 158, 42, 42);
        panel.add(btnNewButton_12_7);
        JButton btnNewButton_12_8 = new JButton("6");
        btnNewButton_12_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_12_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText(caja.getText()+"6");
            }
        });
        btnNewButton_12_8.setBounds(148, 222, 42, 42);
        panel.add(btnNewButton_12_8);
    }
		
		
}
