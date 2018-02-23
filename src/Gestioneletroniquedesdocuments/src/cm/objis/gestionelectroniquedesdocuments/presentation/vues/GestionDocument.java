package cm.objis.gestionelectroniquedesdocuments.presentation.vues;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import cm.objis.gestionelectroniquedesdocuments.dao.Dao;
import cm.objis.gestionelectroniquedesdocuments.dao.IDao;
import cm.objis.gestionelectroniquedesdocuments.domaine.Document;
import cm.objis.gestionelectroniquedesdocuments.service.IService;
import cm.objis.gestionelectroniquedesdocuments.service.Service;

import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;

public class GestionDocument {

	// ma fenetre d'enregistrement de la liste documents
	private JFrame frmEnregitrerUnDocument;
	// les champs de mon formulaire d'enregistrement
	private JTextField textFieldnomdudocument;
	private JTextField textFieldobjet;
	private JTextField textFieldauteur;
	private JTextField textFielddestinataire;
	private JTextField textFielddate;

	private IService service;
	private IDao dao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionDocument window = new GestionDocument();
					window.frmEnregitrerUnDocument.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GestionDocument() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEnregitrerUnDocument = new JFrame();
		frmEnregitrerUnDocument.setTitle("ENREGITRER UN  DOCUMENT");
		frmEnregitrerUnDocument.setBounds(100, 100, 450, 404);
		frmEnregitrerUnDocument.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();// instantiation d'un objet JPanel
		panel.setBackground(Color.PINK);// definition de la couleur de fond
		frmEnregitrerUnDocument.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("NOMDUDOCUMENT:");
		lblNewLabel.setBounds(12, 28, 120, 16);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("OBJET:");
		lblNewLabel_1.setBounds(12, 57, 56, 24);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("AUTEUR  :");
		lblNewLabel_2.setBounds(12, 99, 85, 16);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("DESTINATAIRE:");
		lblNewLabel_3.setBounds(12, 125, 99, 16);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_5 = new JLabel("DATE:");
		lblNewLabel_5.setBounds(12, 154, 56, 16);
		panel.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("NOMBREDESPIECESJOINTES:");
		lblNewLabel_6.setBounds(12, 192, 177, 16);
		panel.add(lblNewLabel_6);

		textFieldnomdudocument = new JTextField();
		textFieldnomdudocument.setBounds(194, 25, 160, 22);
		panel.add(textFieldnomdudocument);
		textFieldnomdudocument.setColumns(10);

		textFieldobjet = new JTextField();
		textFieldobjet.setBounds(194, 58, 160, 22);
		panel.add(textFieldobjet);
		textFieldobjet.setColumns(10);

		textFieldauteur = new JTextField();
		textFieldauteur.setBounds(194, 96, 160, 22);
		panel.add(textFieldauteur);
		textFieldauteur.setColumns(10);

		textFielddestinataire = new JTextField();
		textFielddestinataire.setBounds(194, 122, 160, 22);
		panel.add(textFielddestinataire);
		textFielddestinataire.setColumns(10);

		textFielddate = new JTextField();
		textFielddate.setBounds(194, 154, 160, 22);
		panel.add(textFielddate);
		textFielddate.setColumns(10);

		JSpinner spinnernombredespiecesjointes = new JSpinner();
		spinnernombredespiecesjointes.setBounds(194, 189, 160, 22);
		panel.add(spinnernombredespiecesjointes);

		JButton btnNewButtonenenregistrer = new JButton("ENREGISTRER");
		btnNewButtonenenregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Le code source execute après un clic sur le bouton
				// ENREGISTRER

				// 1 Récupération des valeurs saisies par l'utilisateur

				String nomDuDocument;
				String objet;
				String auteur;
				String destinataire;
				String date;
				int nombrePiecesJointes;

				nomDuDocument = textFieldnomdudocument.getText();
				objet = textFieldobjet.getText();
				auteur = textFieldauteur.getText();
				destinataire = textFielddestinataire.getText();
				date = textFielddate.getText();
				nombrePiecesJointes = (int) spinnernombredespiecesjointes.getValue();

				// 2-CREATION d'un objet etudiant et mise à jour des attribut de
				// l'etudiant

				Document document = new Document();
				document.setNomDuDocument(nomDuDocument);
				document.setObjet(objet);
				document.setAuteur(auteur);
				document.setDestinataire(destinataire);
				document.setDateRedaction(date);
				document.setNombrePiecesJointes(nombrePiecesJointes);

				// 3-Appel de la couche service pour enegistre Etudiant en base
				// de données

				int etat = service.enregistrerDocumentService(document);
				if (etat == 1) {
					JOptionPane.showConfirmDialog(null, "le document" + document.getNomDuDocument() + ""
							+ document.getObjet() + "est bien enregistré  dans la  base ds données");
					textFieldnomdudocument.setText("");
					textFieldobjet.setText("");
					textFieldauteur.setText("");
					textFielddestinataire.setText("");
					textFielddate.setText("");

				}

				else {
					JOptionPane.showConfirmDialog(null, "Erreur lors   de   l'enregistement ");

				}

			}
		});
		btnNewButtonenenregistrer.setBounds(260, 275, 120, 25);
		panel.add(btnNewButtonenenregistrer);

		JButton btnNewButtonlistedesdocuments = new JButton("LISTE DES DOCUMENTS");
		btnNewButtonlistedesdocuments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ListeDocument listedocument = new ListeDocument();
				listedocument.setVisible(true);
			}
		});
		btnNewButtonlistedesdocuments.setBounds(12, 275, 184, 25);
		panel.add(btnNewButtonlistedesdocuments);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 432, 16);
		panel.add(menuBar);

		JMenu mnDocument = new JMenu("Document");
		menuBar.add(mnDocument);

		JMenuItem mntmAfficher = new JMenuItem("Afficher");
		mntmAfficher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ListeDocument listedocument = new ListeDocument();
				listedocument.setVisible(true);
			}
		});
		mnDocument.add(mntmAfficher);

		JMenu mnRefactor = new JMenu("Refactor");
		menuBar.add(mnRefactor);

		JMenu mnSearch = new JMenu("Search");
		menuBar.add(mnSearch);

		JMenu mnProject = new JMenu("Project");
		menuBar.add(mnProject);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		dao = new Dao();
		service = new Service(dao);
	}
}
