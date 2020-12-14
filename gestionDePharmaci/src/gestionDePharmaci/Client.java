package gestionDePharmaci;

public class Client extends Personne {
	private int badge;
	private boolean fidele;
	
	public int getBadge() {
		return badge;
	}

	public void setBadge(int badge) {
		this.badge = badge;
	}

	public boolean isFidele() {
		return fidele;
	}

	public void setFidele(boolean fidele) {
		this.fidele = fidele;
	}
	
	@Override
	public String toString() {
		return "ID: " + getIdentifiant() + "\nNom: " + getNom() + "\nPrenom: "
				+ getPrenom() + "\nNumeroDeTephone: " + getNumeroDeTephone() + "\nEmail: " + getEmail() +
				" \n badge: " + getBadge() + "\n client fidele: " + isFidele();
	}
}
