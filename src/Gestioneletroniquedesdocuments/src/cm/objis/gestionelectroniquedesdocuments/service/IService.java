/**
 * 
 */
package cm.objis.gestionelectroniquedesdocuments.service;

import java.util.List;

import cm.objis.gestionelectroniquedesdocuments.domaine.Document;

/**
 * @author jaqueline
 *
 */

/**
 * cette classe est une interface qui contient les signatures des methodes qui
 * permettent d'enregistrer un document et afficher la liste des documents.
 */
public interface IService {
	public int enregistrerDocumentService(Document document);

	public List<Document> getAllDocumentService();
	//

}
