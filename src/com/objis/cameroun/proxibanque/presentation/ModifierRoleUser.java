package com.objis.cameroun.proxibanque.presentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import com.objis.cameroun.proxibanque.dao.ConnectionMysqlDB;
import com.objis.cameroun.proxibanque.domaine.Role;
import com.objis.cameroun.proxibanque.domaine.Utilisateur;
import com.objis.cameroun.proxibanque.servive.IService;
import com.objis.cameroun.proxibanque.servive.ServiceImp;

public class ModifierRoleUser extends JFrame {

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
					ModifierRoleUser frame = new ModifierRoleUser();
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
	public ModifierRoleUser() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\BrandolKuete\\Pictures\\logo1.png"));
		setBackground(new Color(0, 255, 0));
		setTitle("Modifier Role User");
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
		JLabel lbl= new JLabel("Modification du role d'un utilisateur ");
		lbl.setFont(new Font("Times New Roman", Font.BOLD, 25));
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
		panel.setLayout(new GridLayout(0,1));
		
		JLabel nomLbl= new JLabel(" Nom de l'utilisateur: ");
		final JComboBox combo= new JComboBox();
		nomLbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		combo.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JLabel roleLbl= new JLabel("Choissez le nouveau role: ");
		final JComboBox combo1= new JComboBox();
		roleLbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		combo1.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JButton bouton= new JButton("Modifier");
		bouton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String nom= combo.getSelectedItem().toString();
				String role= combo1.getSelectedItem().toString();
				
				IService service= new ServiceImp();
				int status= service.modifierRoleUserService(nom, role);
				
				if(status==1) {
					JOptionPane.showMessageDialog(null, "Modification réussie!!! ");
					
					combo.setSelectedItem(" ");
					combo1.setSelectedItem(" ");
				}else {
					JOptionPane.showMessageDialog(null, "Une erreur est survenue lors de la modification!!! ");
					
					combo.setSelectedItem(" ");
					combo1.setSelectedItem(" ");
				}
				
			}
		});
		bouton.setFont(new Font("Verdana", Font.BOLD, 18));
		bouton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bouton.setFocusable(false);
		
		JLabel lbl0= new JLabel("                                                             ");
		panel.add(lbl0);
		
		combo.addItem(" ");
		try {
			
			Connection cn =ConnectionMysqlDB.getInstance();
			
			String sql = "SELECT * FROM useraccount";
			
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				combo.addItem(rs.getString("nomuser"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		// recupération des roles présents dans la base de données
		
		
		combo1.addItem(" ");
		
		try {
			
			Connection cn =ConnectionMysqlDB.getInstance();
			
			String sql = "SELECT * FROM role";
			
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				combo1.addItem(rs.getString("libele"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		panel.add(nomLbl);
		panel.add(combo);
		panel.add(roleLbl);
		panel.add(combo1);
		
		JLabel lbl1= new JLabel("                                                             ");
		panel.add(lbl1);
		
		panel.add(bouton);
		
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

}
