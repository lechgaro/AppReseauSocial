/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package framework.utilisateur;

import java.util.ArrayList;

import framework.exception.NotNullException;
// Start of user code (user defined imports)
import framework.rmi.*;
import framework.zonesPartage.*;
// End of user code

/**
 * Description of Utilisateur.
 * 
 * @author monbeigj
 */
public class Utilisateur {
	/**
	 * Description of the property requetes.
	 */
	private ArrayList<$Requete> requetes = new ArrayList<$Requete>();

	/**
	 * Description of the property connecter.
	 */
	private LoginMotDePasse connecter = null;

	/**
	 * Description of the property ZonesInteractions.
	 */
	private ArrayList<ZonePartageSimple> ZonesInteractions = new ArrayList<ZonePartageSimple>();

	private ArrayList<ZonePartageSimple> ZonesCrees = new ArrayList<ZonePartageSimple>();
	
	private String nom;;

	// Start of user code (user defined attributes for Utilisateur)

	// End of user code

	/**
	 * The constructor.
	 */
	public Utilisateur() {
		// Start of user code constructor for Utilisateur)
		super();
		// End of user code
	}
	
	public Utilisateur(String nom){
		this.nom = nom;
	}

	/**
	 * Returns requetes.
	 * 
	 * @return requetes
	 */
	public ArrayList<$Requete> getRequetes() {
		return this.requetes;
	}
	
	public String getNom(){
		return this.nom;
	}

	/**
	 * Returns connecter.
	 * 
	 * @return connecter
	 */
	public LoginMotDePasse getConnecter() {
		return this.connecter;
	}

	/**
	 * Sets a value to attribute connecter.
	 * 
	 * @param newConnecter
	 */
	public void setConnecter(LoginMotDePasse newConnecter) throws NotNullException {
		if (newConnecter == null)throw new NotNullException("LoginMotDePasse newConnecter","setConnecter");
		this.connecter = newConnecter;
	}

	/**
	 * Returns ZonesInteractions.
	 * 
	 * @return ZonesInteractions
	 */
	public ArrayList<ZonePartageSimple> getZonesInteractions() {
		return this.ZonesInteractions;
	}

	/**
	 * Returns ZonesCrees
	 * 
	 * @return ZonesCrees
	 */
	public ArrayList<ZonePartageSimple> getZonesCrees() {
		return this.ZonesCrees;
	}

	public void ajouterZone(ZonePartageSimple nouvelleZone) throws NotNullException {
		if (nouvelleZone != null)throw new NotNullException("ZonePartageSimple nouvelleZone","ajouterZone");
		this.ZonesCrees.add(nouvelleZone);
	}
	
	

}
