package com.objis.cameroun.proxibanque.presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.proxibanque.servive.IService;
import com.objis.cameroun.proxibanque.servive.ServiceImp;

public class Acceuil extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acceuil frame = new Acceuil();
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
	public Acceuil() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\BrandolKuete\\Pictures\\logo1.png"));
		setBackground(new Color(0, 255, 0));
		setTitle("Espace d'authentification");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(850, 650);
		setLocationRelativeTo(null);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(menuBaniere(),BorderLayout.NORTH);
		contentPane.add(positionnerPied(), BorderLayout.SOUTH);
		contentPane.add(positionCentrale(), BorderLayout.CENTER);
		contentPane.add(espaces(), BorderLayout.WEST);
		contentPane.add(espaces(), BorderLayout.EAST);
	}
	
	private static JPanel positionner() {
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setPreferredSize(new Dimension(1131,139));
		panel.setLayout(new BorderLayout());
		
		JLabel lblSystmeDeGestion = new JLabel("Proxibanque SI");
		lblSystmeDeGestion.setForeground(Color.WHITE);
		lblSystmeDeGestion.setHorizontalAlignment(SwingConstants.CENTER);
		lblSystmeDeGestion.setFont(new Font("Verdana", Font.BOLD, 45));
		panel.add(lblSystmeDeGestion, BorderLayout.CENTER);
		
		return panel;
		
	}
	
	private static JMenuBar positionnerLeMenuBar() {
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLACK);
		menuBar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		menuBar.setBackground(Color.WHITE);
		
		JMenu mnFichier = new JMenu("Fichier");
		mnFichier.setFont(new Font("Times New Roman", Font.BOLD, 13));
		mnFichier.setForeground(new Color(0, 0, 0));
		menuBar.add(mnFichier);
		
		JMenu mnEdition = new JMenu("Edition");
		mnEdition.setForeground(new Color(0, 0, 0));
		mnEdition.setFont(new Font("Times New Roman", Font.BOLD, 13));
		menuBar.add(mnEdition);
		
		JMenu mnAffichage = new JMenu("Affichage");
		mnAffichage.setFont(new Font("Times New Roman", Font.BOLD, 13));
		mnAffichage.setForeground(new Color(0, 0, 0));
		menuBar.add(mnAffichage);
		
		JMenu mnOutils = new JMenu("Outils");
		mnOutils.setFont(new Font("Times New Roman", Font.BOLD, 13));
		mnOutils.setForeground(new Color(0, 0, 0));
		menuBar.add(mnOutils);
		
		JMenu mnAide = new JMenu("Aide");
		mnAide.setForeground(new Color(0, 0, 0));
		mnAide.setFont(new Font("Times New Roman", Font.BOLD, 13));
		menuBar.add(mnAide);
		
		return menuBar;
	}
	
	private static JPanel menuBaniere() {
		
		JPanel panel= new JPanel();
		panel.setLayout(new BorderLayout());
		
		panel.add(positionnerLeMenuBar(), BorderLayout.NORTH);
		panel.add(positionner(), BorderLayout.SOUTH);
		
		return panel;
		
	}
	
	private static JPanel positionnerPied(){
		
		JPanel panel= new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(new FlowLayout());
		
		JLabel lbl1= new JLabel("Copyright 2019");
		lbl1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel.add(lbl1);
		
		JLabel lbl2= new JLabel("  Tous droits reservés");
		lbl2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel.add(lbl2);
		
		return panel;
		
	}
	
	private static JPanel blocAuthentification() {
		
		JPanel panel= new JPanel();
		panel.setLayout(new GridLayout(8,2,15,15));
		
		JLabel lbl0= new JLabel("    ");
		panel.add(lbl0);
		
		JLabel lbl3= new JLabel("    ");
		panel.add(lbl3);
		
		JLabel lbl1= new JLabel("Login: ");
		lbl1.setBounds(250, 80, 160, 30);
		lbl1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel.add(lbl1);
		
		final JTextField loginTextField= new JTextField();
		loginTextField.setBounds(300, 80, 290, 30);
		loginTextField.setFont(new Font("Verdana", Font.PLAIN, 15));
		panel.add(loginTextField);
		
		JLabel lbl2= new JLabel("Password: ");
		lbl2.setBounds(250, 160, 160, 30);
		lbl2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel.add(lbl2);
		
		final JPasswordField passwdTextField= new JPasswordField();
		passwdTextField.setBounds(320, 160, 290, 30);
		passwdTextField.setFont(new Font("Verdana", Font.PLAIN, 15));
		panel.add(passwdTextField);
		
		JButton buton1= new JButton("Connecter");
		buton1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				String login= loginTextField.getText();
				String passw= passwdTextField.getText();
				
				IService service= new ServiceImp();
				int status= service.authentifierService(login, passw);
				
				if(status==1) {
					
					String role= service.recupererRoleService(login, passw);
					
					System.out.print(role);
					if(role.equals("admin")) {
						EspaceAdministrateur frame = new EspaceAdministrateur();
						frame.setVisible(true);
						
						
						loginTextField.setText(" ");
						passwdTextField.setText("");
					}else {
						
						EspaceConseiller frame = new EspaceConseiller();
						frame.setVisible(true);
					
						loginTextField.setText(" ");
						passwdTextField.setText("");
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Utislisateur inexistant !!!!");
					
					loginTextField.setText(" ");
					passwdTextField.setText("");
				}	
			}
		});
		buton1.setBounds(290, 230, 160, 30);
		buton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buton1.setFont(new Font("Verdana", Font.BOLD, 16));
		
		JButton buton2= new JButton("Annuler");
		buton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buton2.setFont(new Font("Verdana", Font.BOLD, 16));
		buton2.setBounds(500, 230, 160, 30);
		
		panel.add(buton1);
		panel.add(buton2);
		
		JLabel lbl4= new JLabel("    ");
		panel.add(lbl4);
		
		JLabel lbl5= new JLabel("    ");
		panel.add(lbl5);
		
		JLabel lbl6= new JLabel("    ");
		panel.add(lbl6);
		
		JLabel lbl7= new JLabel("    ");
		panel.add(lbl7);
		
		JLabel lbl8= new JLabel("    ");
		panel.add(lbl8);
		
		JLabel lbl9= new JLabel("    ");
		panel.add(lbl9);
		
		JLabel lbl= new JLabel("    ");
		panel.add(lbl);
		
		JLabel lb= new JLabel("    ");
		panel.add(lb);
		
		return panel;
	}
	
	private static JPanel espaces() {
		//ce gridLayout vide permettra  d'occuper un peu d'espace à l'Est et à l'Ouest de la page, il ne contient que de labels vides
		
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(3, 2));
		
		JLabel lbl1= new JLabel("                   ");
		panel.add(lbl1);
		
		JLabel lbl2= new JLabel("                   ");
		panel.add(lbl2);
		
		JLabel lbl3= new JLabel("                   ");
		panel.add(lbl3);
		
		JLabel lbl4= new JLabel("                   ");
		panel.add(lbl4);
		
		JLabel lbl5=  new JLabel("                  ");
		panel.add(lbl5);
		  
		JLabel lbl6= new JLabel("                   ");
		panel.add(lbl6);
		
		return panel;	
	}
	
	private static JPanel menu() {
		JPanel panel= new JPanel();
		panel.setLayout(new GridLayout(2,1,15,15));
		
		JLabel lbl= new JLabel("  ");
		panel.add(lbl);
		panel.add(titre());
		
		return panel;
	}
	
	private static JLabel titre() {
		JLabel lbl= new JLabel("                            Connexion ");
		lbl.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lbl.setForeground(Color.DARK_GRAY);
		return lbl;
	}
	
	private static JPanel positionCentrale() {
		
		JPanel panel= new JPanel();
		panel.setLayout(new BorderLayout());
		
		panel.add(menu(), BorderLayout.NORTH);
		panel.add(blocAuthentification(), BorderLayout.CENTER);
		
		return panel;
		
	}
}