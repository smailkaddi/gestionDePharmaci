package gestionDePharmaci;

public class Pharmacien extends Personne {
	private double nombreDeVentes = 0;

	public double getNombreDeVentes() {
		return nombreDeVentes;
	}

	public void setNombreDeVentes(double nombreDeVentes) {
		this.nombreDeVentes = nombreDeVentes;
	}

	@Override
	public String toString() {
		return "ID: " + getIdentifiant() + "\nNom: " + getNom() + "\nPrenom: "
				+ getPrenom() + "\nNumeroDeTephone: " + getNumeroDeTephone() + "\nEmail: " + getEmail();
	}
}
