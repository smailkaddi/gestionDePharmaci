package gestionDePharmaci;

public class Medicament {
	
	private int setIdentifiant;
	private String nom;
	private String description;
	private double prix;

	public int getIdentifiant() {
		return setIdentifiant;
	}
	public void setIdentifiant(int setIdentifiant) {
		this.setIdentifiant = setIdentifiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	@Override
	public String toString() {
		return "ID: " + getIdentifiant() + "\nNom: " + getNom() + "\nDescription: "
				+ getDescription() + "\nPrix: " + getPrix() + " DH";
	}
}
