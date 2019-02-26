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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.proxibanque.domaine.Role;
import com.objis.cameroun.proxibanque.servive.IService;
import com.objis.cameroun.proxibanque.servive.ServiceImp;

public class AjouterRole extends JFrame {

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
					AjouterRole frame = new AjouterRole();
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
	public AjouterRole() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\BrandolKuete\\Pictures\\logo1.png"));
		setBackground(new Color(0, 255, 0));
		setTitle("Créer un role");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(1200, 750);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		
		contentPane.add(menuBaniere(),BorderLayout.NORTH);
		contentPane.add(positionP1(), BorderLayout.CENTER);
		contentPane.add(positionnerPied(), BorderLayout.SOUTH);
		contentPane.add(espaces(), BorderLayout.WEST);
		contentPane.add(espaces(), BorderLayout.EAST);
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
		panel.add(lbl1);
		
		JLabel lbl2= new JLabel("  Tous droits reservés");
		panel.add(lbl2);
		
		return panel;
		
	}
	
	private static JPanel positionner() {
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setPreferredSize(new Dimension(1131,139));
		//panel.setBounds(100, 100, 1131, 139);
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
	
 private static JPanel espaces() {
		
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(3, 2));
		
		JLabel lbl1= new JLabel("                                                             ");
		panel.add(lbl1);
		
		JLabel lbl2= new JLabel("                                                             ");
		panel.add(lbl2);
		
		JLabel lbl3= new JLabel("                                                             ");
		panel.add(lbl3);
		
		JLabel lbl4= new JLabel("                                                             ");
		panel.add(lbl4);
		
		JLabel lbl5=  new JLabel("                                                            ");
		panel.add(lbl5);
		  
		JLabel lbl6= new JLabel("                                                             ");
		panel.add(lbl6);
		
		return panel;	
	}
	
	private static JLabel titre() {
		JLabel lbl= new JLabel("          Création d'un nouveau role ");
		lbl.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lbl.setForeground(Color.DARK_GRAY);
		return lbl;
	}
	
	private static JPanel positionP1() {
		
		JPanel panel= new JPanel();
		panel.setLayout(new BorderLayout());
		
		panel.add(titre(), BorderLayout.NORTH);
		panel.add(formulaire(), BorderLayout.CENTER);
		
		return panel;
		
	}

	private static JPanel formulaire() {
		JPanel panel= new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER,30,30));
		
		JLabel libeleLbl= new JLabel("Entrer le role: ");
		libeleLbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		final JTextField libeleTextField= new JTextField();
		libeleTextField.setPreferredSize(new Dimension(200, 30));
		libeleTextField.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JButton bouton= new JButton("Enregistrer");
		bouton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String libele= libeleTextField.getText();
				
				Role role= new Role();
				role.setLibeleRole(libele);
				IService service= new ServiceImp();
				 
				int status= service.ajouterRoleService(role);
				
				 if(status==1) {
					 JOptionPane.showMessageDialog(null, "Ajout réussi !!! ");
					 libeleTextField.setText(" ");
				 }else {
					 JOptionPane.showMessageDialog(null, "Une erreur est survenue lors de l'ajout!!! ");
					 libeleTextField.setText(" ");
				 }
			}
		});
		bouton.setFont(new Font("Verdana", Font.BOLD, 18));
		bouton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bouton.setFocusable(false);
		
		panel.add(libeleLbl);
		panel.add(libeleTextField);
		panel.add(bouton);
		
		return panel;
	}

}
