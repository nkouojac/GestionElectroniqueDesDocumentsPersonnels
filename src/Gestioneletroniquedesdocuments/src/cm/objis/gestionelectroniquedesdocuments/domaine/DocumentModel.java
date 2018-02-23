package cm.objis.gestionelectroniquedesdocuments.domaine;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class DocumentModel extends AbstractTableModel {
	private final String[] entetes = { "Refference", "NomDuDocument", "Objet", "Auteur", "Destinataire",
			"DateRedaction", "NombrePiecesJointes" };

	private List<Document> documents;

	public DocumentModel(List<Document> documents) {// Liste des documents que
													// la couche service va
													// retourner
		this.documents = documents;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return documents.size();
	}

	@Override
	public int getColumnCount() {// méthode permettant d'obtenir le nombre des
									// colonnes
		// TODO Auto-generated method stub
		return entetes.length;
	}

	public String getColumnName(int columnIndex) {// methode permettant d' avoir
													// les noms des colonnes
		return entetes[columnIndex];
	}

	public DocumentModel() {

	}

	@Override

	public Object getValueAt(int rowIndex, int columnIndex) {// permet de
																// remplir notre
																// tableau avec
																// des valeurs
		switch (columnIndex) {
		case 0:
			// ID
			return documents.get(rowIndex).getRefference();// on sort de ID pour
															// retourner
															// IDRefference
		case 1:
			// NomDuDocumnt
			return documents.get(rowIndex).getNomDuDocument();
		case 2:
			// Objet
			return documents.get(rowIndex).getObjet();
		case 3:
			// Auteur
			return documents.get(rowIndex).getAuteur();
		case 4:
			// Destinataire
			return documents.get(rowIndex).getDestinataire();
		case 5:
			// Date
			return documents.get(rowIndex).getDateRedaction();
		case 6:
			// NombrePiecesJointes
			return documents.get(rowIndex).getNombrePiecesJointes();
		default:
			throw new IllegalArgumentException();
		}

	}
}
