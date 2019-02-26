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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.proxibanque.servive.IService;
import com.objis.cameroun.proxibanque.servive.ServiceImp;

public class FaireVirement extends JFrame {

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
					FaireVirement frame = new FaireVirement();
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
	public FaireVirement() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\BrandolKuete\\Pictures\\logo1.png"));
		setBackground(new Color(0, 255, 0));
		setTitle("          Virement de compte à compte");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(1200, 750);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		
		contentPane.add(menuBaniere(),BorderLayout.NORTH);
		contentPane.add(positionnerPied(), BorderLayout.SOUTH);
		contentPane.add(espaces(), BorderLayout.WEST);
		contentPane.add(espaces(), BorderLayout.EAST);
		contentPane.add(positionP1(), BorderLayout.CENTER);
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
		
		JLabel lbl2= new JLabel("       Tous droits reservés");
		lbl2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel.add(lbl2);
		
		return panel;
		
	}
	
	private static JPanel espaces() {
		
		//ce gridLayout vide permettra  d'occuper un peu d'espace à l'Est et à l'Ouest de la page, il ne contient que de labels vides
		
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(3, 2));
		
		JLabel lbl1= new JLabel("                                           ");
		panel.add(lbl1);
		
		JLabel lbl2= new JLabel("                                           ");
		panel.add(lbl2);
		
		JLabel lbl3= new JLabel("                                           ");
		panel.add(lbl3);
		
		JLabel lbl4= new JLabel("                                           ");
		panel.add(lbl4);
		
		JLabel lbl5=  new JLabel("                                          ");
		panel.add(lbl5);
		  
		JLabel lbl6= new JLabel("                                           ");
		panel.add(lbl6);
		
		return panel;	
	}
	
	private static JPanel espaceVirement() {
		
		JPanel panel= new JPanel();
		panel.setLayout(new GridLayout(10, 2,8,12));
		
		JLabel compte1Lbl= new JLabel("Entrer le numero du compte débiteur: ");
		final JTextField compte1TextField= new JTextField();
		compte1Lbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		compte1TextField.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JLabel compte2Lbl= new JLabel("Entrer le numero du compte créditaire: ");
		final JTextField compte2TextField= new JTextField();
		compte2Lbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		compte2TextField.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JLabel montantLbl= new JLabel("Entrer le montant: ");
		final JTextField montantTextField= new JTextField();
		montantLbl.setFont(new Font("Times New Roman", Font.BOLD, 18));
		montantTextField.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JButton boutn1= new JButton("Effectuer");
		boutn1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				float montant= Float.parseFloat(montantTextField.getText());
				String comptDeb= compte1TextField.getText();
				String comptCre= compte2TextField.getText();
				
				IService service= new ServiceImp();
				
				service.faireVirementCompteACompteService(montant, comptDeb, comptCre);
				
				compte1TextField.setText(" ");
				compte2TextField.setText(" ");
				montantTextField.setText(" ");
				
			}
		});
		boutn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boutn1.setFont(new Font("Verdana", Font.BOLD, 16));
		boutn1.setFocusable(false);
		
		JButton boutn2= new JButton("Annuler");
		boutn2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boutn2.setFont(new Font("Verdana", Font.BOLD, 16));
		boutn2.setFocusable(false);
		
		JLabel lbl0= new JLabel("    ");
		panel.add(lbl0);
		
		JLabel lbl1= new JLabel("    ");
		panel.add(lbl1);
		
		panel.add(compte1Lbl);
		panel.add(compte1TextField);
		panel.add(compte2Lbl);
		panel.add(compte2TextField);
		panel.add(montantLbl);
		panel.add(montantTextField);
		
		JLabel lbl2= new JLabel("    ");
		panel.add(lbl2);
		
		JLabel lbl3= new JLabel("    ");
		panel.add(lbl3);
		
		panel.add(boutn1);
		panel.add(boutn2);
		
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
		JLabel lbl= new JLabel("              Virement de compte à compte");
		lbl.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lbl.setForeground(Color.DARK_GRAY);
		return lbl;
	}
	
	private static JPanel positionP1() {
		
		JPanel panel= new JPanel();
		panel.setLayout(new BorderLayout());
		
		panel.add(menu(), BorderLayout.NORTH);
		panel.add(espaceVirement(), BorderLayout.CENTER);
		
		return panel;
		
	}

}
