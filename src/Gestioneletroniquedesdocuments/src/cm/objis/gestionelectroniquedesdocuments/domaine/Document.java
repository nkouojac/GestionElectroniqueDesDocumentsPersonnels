package cm.objis.gestionelectroniquedesdocuments.domaine;

/**
 * @author jaqueline La classe document fournit les methodes permettant de
 *         recupérer les informations d'un document
 */
public class Document {

	private String nomDuDocument;// propriété
	private String objet;// propriété
	protected String auteur;// propriété
	private String destinataire;// propriété
	private int refference;// propriété
	private String dateRedaction;// propriété
	private int nombrePiecesJointes;// propriété

	/*
	 * Constructeurs de la classe
	 * 
	 * @param nomDuDocument
	 * 
	 * @param objet
	 * 
	 * @param auteur
	 * 
	 * @param destinataire
	 * 
	 * @param refference
	 * 
	 * @param date
	 * 
	 * @param nombrepiecesjointes constructeur prenant en parametres tous les
	 * parametres de la classe Document(nom du document,l'objet,l'auteur,le
	 * destinataire,la refference, la date et le nombre des pièes jointes
	 */

	public Document(String nomDuDocument, String objet, String auteur, String destinataire, int refference, String date,
			int nombrepiecesjointes) {
		super();// super fait refference au constructeur de la classe parente
		this.nomDuDocument = nomDuDocument;// this désigne l'objet courant(cette
											// instance de l'objet)
		this.objet = objet;
		this.auteur = auteur;
		this.destinataire = destinataire;
		this.refference = refference;
		this.dateRedaction = date;
		this.nombrePiecesJointes = nombrepiecesjointes;
	}

	public Document(String nomDuDocument, String objet, String auteur, String destinataire, String date,
			int nombrepiecesjointes) {
		super();
		this.nomDuDocument = nomDuDocument;
		this.objet = objet;
		this.auteur = auteur;
		this.destinataire = destinataire;
		this.dateRedaction = date;
		this.nombrePiecesJointes = nombrepiecesjointes;
	}

	/**
	 * 
	 * constructeur par defaut qui ne prend aucun paramètre
	 */
	public Document() {
		super();// super fait reference au constructeur de la classe parente
	}

	public Document(String nomDuDocument2, Utilisateur uilisateur2, String destinataire2, int refference2,
			String date2) {
		// TODO Auto-generated constructor stub
	}

	/*
	 * Getter et Setter
	 * 
	 */

	/**
	 * methode permettant d'obtenir le nom du document
	 * 
	 * @return
	 */
	public String getNomDuDocument() {
		return nomDuDocument;
	}

	/**
	 * @param nomDuDocument
	 *            méthode permettant de modifier le nom du document dans la
	 *            classe en prenant en paramètre le nom du document
	 * 
	 */
	public void setNomDuDocument(String nomDuDocument) {
		this.nomDuDocument = nomDuDocument;
	}

	/**
	 * @return méthode permettant de lire l'objet de la classe et qui retourne
	 *         l'objet
	 */

	public String getObjet() {
		return objet;
	}

	/**
	 * @param objet
	 *            méthode permettant de modifier l'objet de la classe en prenant
	 *            en paramètre l'objet
	 */
	public void setObjet(String objet) {
		this.objet = objet;
	}

	/**
	 * @return méthode permettant de lire le nom de l'auteur du document et qui
	 *         retourne l'auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * @param auteur
	 *            méthode permettant de modifier le nom de l'auteur du document
	 *            dans la classe en prenant en paramètre l'auteur
	 * 
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	/**
	 * @return méthode permettant de lire le nom du destinataire du document
	 *         dans la classe et retourne le detinataire
	 * 
	 */
	public String getDestinataire() {
		return destinataire;
	}

	/**
	 * @param destinataire
	 *            méthode permettant de modifier le nom du destinataire dans la
	 *            classe et retourne le destinataire
	 * 
	 */
	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}

	/**
	 * @return méthode permettant de lire la refferene du document et retourne
	 *         la refference
	 * 
	 */
	public int getRefference() {
		return refference;
	}

	/**
	 * @param refference2
	 *            méthode permettant de modifier la reference du document en
	 *            prenant en paramètre la refference
	 * 
	 */
	public void setRefference(int refference2) {
		this.refference = refference2;
	}

	/**
	 * @return méthode permettant de lire la date de rédaction du document et
	 *         qui retourne la date
	 * 
	 */
	public String getDateRedaction() {
		return dateRedaction;
	}

	/**
	 * @param date
	 *            méthode permettant de modifier la date de rédaction du
	 *            document en prnant enn paramètre la date
	 */
	public void setDateRedaction(String date) {
		this.dateRedaction = date;
	}

	/**
	 * @return méthode permettant de lire le nombre des pièces jointes au
	 *         document et qui retourne le nombre des pièces jointes
	 */
	public int getNombrePiecesJointes() {
		return nombrePiecesJointes;
	}

	/**
	 * @param nombrePiecesJointes
	 *            méthode permettant de modifier le nombre des pièces jointes au
	 *            document en prenant en paramètre le nombre des pèièces jointes
	 * 
	 */
	public void setNombrePiecesJointes(int nombrePiecesJointes) {
		this.nombrePiecesJointes = nombrePiecesJointes;
	}

	@Override
	public String toString() {
		return "Document [nomDuDocument=" + nomDuDocument + ", objet=" + objet + ", auteur=" + auteur
				+ ", destinataire=" + destinataire + ", refference=" + refference + ", date=" + dateRedaction
				+ ", nombrepiecesjointes=" + nombrePiecesJointes + "]";
		// methode permettant d'afficher l'etat de l' objet en memoire
	}

}
