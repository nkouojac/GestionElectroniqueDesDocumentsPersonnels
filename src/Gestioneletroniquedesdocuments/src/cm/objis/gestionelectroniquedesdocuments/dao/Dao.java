package cm.objis.gestionelectroniquedesdocuments.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cm.objis.gestionelectroniquedesdocuments.domaine.Document;
import cm.objis.gestionelectroniquedesdocuments.utilitaires.ConnectionMYSQL;

/**
 * @author jaqueline classe qui implemmente l'interface IDao
 *
 */
public class Dao implements IDao {

	public Dao() {
		super();

		// TODO Auto-generated constructor stub
	}

	public int enregistrerDocumentDao(Document document) {

		try {
			// Etape1:récupération de la connexion
			Connection cn = ConnectionMYSQL.getInstance();
			String sql = "INSERT  INTO`document`(`nomDuDocument`,`objet`,`auteur` ,`destinataire`,`dateRedaction`,`nombreDesPiecesJointes`)"
					+ "VALUES(?,?,?,?,?,?)";

			// Etape2: Création d'un statement

			PreparedStatement ps = cn.prepareStatement(sql);
			ps.setString(1, document.getNomDuDocument());
			ps.setString(2, document.getObjet());
			ps.setString(3, document.getAuteur());
			ps.setString(4, document.getDestinataire());
			ps.setString(5, document.getDateRedaction());
			ps.setInt(6, document.getNombrePiecesJointes());

			// Etape 3: execution requête
			ps.executeUpdate();

			return 1;

			// Etape4 gestion des exceptions et libération automatique des
			// ressources

		} catch (SQLException e) {
			e.printStackTrace();
			return 0;

		}

	}

	@Override

	public List<Document> getAllDocuments() {

		/*
		 * *création d'une collection des documents
		 */
		List<Document> maListeDocument = new ArrayList<Document>();
		try {

			// Etappe1: récupération de la connexion

			Connection cn = ConnectionMYSQL.getInstance();

			// Etappe2:preparation d la requête
			Statement st = cn.createStatement();
			String sql = "SELECT * FROM document";

			// Etappe3:execution requête
			ResultSet rs = st.executeQuery(sql);

			// Etappe 4: parcours Resultset (optionnel)
			while (rs.next()) {

				Document document = new Document();
				// document.setRefference(rs.getString("id"));
				document.setNomDuDocument(rs.getString("nomDuDocument"));
				document.setObjet(rs.getString("objet"));
				document.setAuteur(rs.getString("auteur"));
				document.setDestinataire(rs.getString("destinataire"));
				document.setRefference(rs.getInt("idDocument"));
				document.setNombrePiecesJointes(rs.getInt("nombreDesPiecesJointes"));

				/**
				 * Instuction permettant d'ajouter un objet document dans la
				 * liste des documents
				 * 
				 */
				maListeDocument.add(document);
				// System.out.println(rs.getString("nomDuDocument")+""+rs.getString("objet"));
			}
			// Etape5: gestion des exceptions et liberation automatique' des
			// ressources
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return maListeDocument;

	}

}
