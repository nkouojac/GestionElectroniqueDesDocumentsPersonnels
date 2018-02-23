package cm.objis.gestionelectroniquedesdocuments.dao;

import java.util.List;

import cm.objis.gestionelectroniquedesdocuments.domaine.Document;

public interface IDao {
	public int enregistrerDocumentDao(Document document);

	public List<Document> getAllDocuments();

	// public List<Document> lectureDaoDocument();//cette methode permet lire en
	// base ds données
	// public void enregistrerDaoDocument(Document doc);//cette methode permet
	// d'enrégistrer en base desdonnées

}
