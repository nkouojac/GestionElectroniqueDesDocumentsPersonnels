package cm.objis.gestionelectroniquedesdocuments.presentation.vues;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import cm.objis.gestionelectroniquedesdocuments.dao.Dao;
import cm.objis.gestionelectroniquedesdocuments.dao.IDao;
import cm.objis.gestionelectroniquedesdocuments.domaine.DocumentModel;
import cm.objis.gestionelectroniquedesdocuments.service.IService;
import cm.objis.gestionelectroniquedesdocuments.service.Service;

import javax.swing.JTable;

public class ListeDocument extends JFrame {

	private JPanel contentPane;
	// private JTable table;
	private IDao dao;
	private IService service;
	private JTable tableDocument;

	/**
	 * create the frame.
	 * 
	 */
	public ListeDocument() {

		setTitle("Liste des Documents");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		dao = new Dao();
		service = new Service(dao);

		DocumentModel documentmodel = new DocumentModel(service.getAllDocumentService());

		tableDocument = new JTable(documentmodel);
		contentPane.add(new JScrollPane(tableDocument), BorderLayout.CENTER);

	}

}
