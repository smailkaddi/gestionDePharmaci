package gestionDePharmaci;

public class Personne {
	private int identifiant;
	private String nom;
	private String prenom;
	private int numeroDeTephone;
	private String email;

/*
	Personne(int identifiant, String nom, String prenom, int numeroDeTephone, String email, int selected) {
		Personne.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.numeroDeTephone = numeroDeTephone;
		this.email = email;
	}
*/

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getNumeroDeTephone() {
		return numeroDeTephone;
	}

	public void setNumeroDeTephone(int numeroDeTephone) {
		this.numeroDeTephone = numeroDeTephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

