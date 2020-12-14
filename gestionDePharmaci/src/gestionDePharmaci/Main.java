package gestionDePharmaci;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	//@SuppressWarnings("unused")
	public static void main(String[] args) {

		int input;
		int selected;
		boolean Quit = false;

		int PharmacienId = 1;
		int MedicamentId = 1;
		int ClientId = 1;

		int MPharmacien;
		int MMedicament;
		int MClient;

		int thePharmacienId;
		int theMedicamentId;
		int theClientId;

		int deletePharmacien;
		int deleteMedicament;
		int deleteClient;
		
		int ChearchPharmacien;
		int ChearchMedicament;
		int ChearchClient;
		
		double chifreAffaire = 0;

		int nombreDeClientFidele = 0;

		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Pharmacien> listOfPharmacien = new ArrayList<Pharmacien>();
		ArrayList<Medicament> listOfMedicament = new ArrayList<Medicament>();
		ArrayList<Client> listOfClient = new ArrayList<Client>();

		while(Quit != true) {

			System.out.println(" \n ******* Menu Principal ******** \n");
			System.out.println("1 - **********Gestionde  pharmacien *****************");
			System.out.println("2 - ***** Gestion de médicament *******");
			System.out.println("3 - ********** Gestion de Client ******************");
			System.out.println("4 - ********** stastics ******************");
			System.out.println("5 - Quiter");
			input = scanner.nextInt();

			switch(input) {
				case 1:
					System.out.println(" \n ******* Menu  de pharmacien ******** \n");
					System.out.println("1- ajouter pharmaciens");
					System.out.println("2- afichier pharmaciens");
					System.out.println("3- modifier pharmaciens");
					System.out.println("4- Rechercher pharmaciens");
					System.out.println("5- suprimer pharmaciens");
					System.out.println("6- anuuler");

					selected = scanner.nextInt();

					switch (selected) {
					case 1:
						
						System.out.println("do you want to add pharmacien Y/N");
						char YN = scanner.next().charAt(0);
						
						switch(YN) {
							case 'Y':
								while(YN == 'Y') {
									Pharmacien Pharmacien = new Pharmacien();
									
									Pharmacien.setIdentifiant(PharmacienId);
									System.out.println("entrer votre nom");
									String nom = scanner.next();
									Pharmacien.setNom(nom);
									System.out.println("entrer votre prenom");
									String prenom = scanner.next();
									Pharmacien.setPrenom(prenom);
									System.out.println("entrer votre numeroDeTephone");
									int numeroDeTephone = scanner.nextInt();
									Pharmacien.setNumeroDeTephone(numeroDeTephone);
									System.out.println("entrer votre email");
									String email = scanner.next();
									Pharmacien.setEmail(email);
									listOfPharmacien.add(Pharmacien);		
									PharmacienId++;
									
									System.out.println("do you want to add other pharmacien Y/N");
									YN = scanner.next().charAt(0);
								}
							break;
							
							case 'N':
							
							break;
						}
					break;
					
					case 2:
						for(Object object: listOfPharmacien) {
							System.out.println(object.toString());
						}
					break;

					case 3:
						System.out.println("entrer identifiere de pharmacien pour modifier");
						MPharmacien = scanner.nextInt() - 1;
						thePharmacienId = MPharmacien + 1;
						
						Pharmacien Pharmacien = new Pharmacien();
						
						Pharmacien.setIdentifiant(thePharmacienId);
						System.out.println("entrer votre nom");
						String nom1 = scanner.next();
						Pharmacien.setNom(nom1);
					    System.out.println(" prenom :");
						System.out.println("entrer votre prenom");
						String prenom1 = scanner.next();
						Pharmacien.setPrenom(prenom1);
						System.out.println("entrer votre numeroDeTephone");
						int numeroDeTephone1 = scanner.nextInt();
						Pharmacien.setNumeroDeTephone(numeroDeTephone1);
						System.out.println("entrer votre email");
						String email1 = scanner.next();
						Pharmacien.setEmail(email1);
						listOfPharmacien.set(MPharmacien,Pharmacien);
						
				        //Collections.sort(listOfClient); 
					break;

					case 4:
						System.out.println("entrer identifiere de pharmacien pour voir");
						ChearchPharmacien = scanner.nextInt() - 1;

						System.out.println(listOfPharmacien.get(ChearchPharmacien));
					break;

					case 5:
						System.out.println("tapez le id d'utilisateur pour suprimez");
						deletePharmacien = scanner.nextInt() - 1;

						//listOfPharmacien.set(deletePharmacien, "");
						listOfPharmacien.remove(deletePharmacien);
					break;
					
					case 6:
						
					break;
					}
				break;

				case 2:
					System.out.println("1- ajouter médicament");
					System.out.println("2- afichier médicament");
					System.out.println("3- modifier médicament");
					System.out.println("4- Rechercher médicament");
					System.out.println("5- suprimer médicament");
					System.out.println("6- anuuler");

					selected = scanner.nextInt();
					
					switch (selected) {

					case 1:
						System.out.println("do you want to add medicament Y/N");
						char YN = scanner.next().charAt(0);
						
						switch(YN) {
							case 'Y':
								while(YN == 'Y') {
									Medicament Medicament = new Medicament();
									
									Medicament.setIdentifiant(MedicamentId);
									System.out.println("entrer le nom de produit");
									String nom = scanner.next();
									Medicament.setNom(nom);
									
									System.out.println("entrer description de produit");
									String description = scanner.next();
									Medicament.setDescription(description);
									
									System.out.println("entrer prix de produit");
									double prix = scanner.nextDouble();
									Medicament.setPrix(prix);
									
									listOfMedicament.add(Medicament);
									
									chifreAffaire += Medicament.getPrix();
									
									MedicamentId++;
									
									System.out.println("do you want to add other Medicament Y/N");
									YN = scanner.next().charAt(0);
								}
							break;
							
							case 'N':
							
							break;
						}
					break;

					case 2:
						for(Object object: listOfMedicament) {
							System.out.println(object.toString());
						}
					break;

					case 3:
						
						System.out.println("entrer identifiere de medicament pour modifier");
						MMedicament = scanner.nextInt() - 1;
						theMedicamentId = MMedicament + 1;
						
						Medicament Medicament = new Medicament();
						
						Medicament.setIdentifiant(theMedicamentId);
						System.out.println("entrer le nom de produit");
						String nom = scanner.next();
						Medicament.setNom(nom);
						
						System.out.println("entrer description de produit");
						String description = scanner.next();
						Medicament.setDescription(description);
						
						System.out.println("entrer prix de produit");
						double prix = scanner.nextDouble();
						Medicament.setPrix(prix);
						
						listOfMedicament.set(MMedicament,Medicament);
					break;

					case 4:
						System.out.println("entrer identifiere de Medicament pour voir");
						ChearchMedicament = scanner.nextInt() - 1;

						System.out.println(listOfMedicament.get(ChearchMedicament));
					break;

					case 5:
						System.out.println("entrer id de Medicament pour suprimez");
						deleteMedicament = scanner.nextInt() - 1;

						listOfMedicament.remove(deleteMedicament);
					break;
					
					case 6:
						
					break;
					}
				break;

				case 3:
					System.out.println("1- ajouter Client");
					System.out.println("2- afichier Client");
					System.out.println("3- modifier Client");
					System.out.println("4- Rechercher Client");
					System.out.println("5- suprimer Client");
					System.out.println("6- anuuler");
					
					selected = scanner.nextInt();

					switch (selected) {
					case 1:
						System.out.println("do you want to add Client Y/N");
						char YN = scanner.next().charAt(0);
						
						switch(YN) {
							case 'Y':
								while(YN == 'Y') {
									Client Client = new Client();
									
									Client.setIdentifiant(ClientId);
									System.out.println("entrer votre nom");
									String nom = scanner.next();
									Client.setNom(nom);
									
									System.out.println("entrer votre prenom");
									String prenom = scanner.next();
									Client.setPrenom(prenom);
									
									System.out.println("entrer votre numeroDeTephone");
									int numeroDeTephone = scanner.nextInt();
									Client.setNumeroDeTephone(numeroDeTephone);
									
									System.out.println("entrer votre email");
									String email = scanner.next();
									Client.setEmail(email);
									
									System.out.println("entrer votre badge");
									int badge = scanner.nextInt();
									Client.setBadge(badge);
									
									if(Client.getBadge() >= 3) {
										Client.setFidele(true);
									}
									else {
										Client.setFidele(false);
									}
									
									listOfClient.add(Client);
									
									if(Client.isFidele()) {
										nombreDeClientFidele++;
									}
									
									ClientId++;
									
									System.out.println("do you want to add other Client Y/N");
									YN = scanner.next().charAt(0);
								}
							break;
							
							case 'N':
							
							break;
						}
					break;

					case 2:
						for(Object object: listOfClient) {
							System.out.println(object.toString());
						}
					break;

					case 3:

						System.out.println("entrer identifiere de pharmacien pour modifier");
						MClient = scanner.nextInt() - 1;
						theClientId = MClient + 1;

						Client Client = new Client();

						Client.setIdentifiant(theClientId);
						System.out.println("entrer votre nom");
						String nom1 = scanner.next();
						Client.setNom(nom1);
					    System.out.println(" prenom :");
						System.out.println("entrer votre prenom");
						String prenom1 = scanner.next();
						Client.setPrenom(prenom1);
						System.out.println("entrer votre numeroDeTephone");
						int numeroDeTephone1 = scanner.nextInt();
						Client.setNumeroDeTephone(numeroDeTephone1);
						System.out.println("entrer votre email");
						String email1 = scanner.next();
						Client.setEmail(email1);
						System.out.println("entrer votre badge");
						int badge = scanner.nextInt();
						Client.setBadge(badge);
						listOfClient.set(MClient,Client);
					break;

					case 4:
						System.out.println("entrer identifiere de Client pour voir");
						ChearchClient = scanner.nextInt() - 1;

						System.out.println(listOfClient.get(ChearchClient));
					break;

					case 5:
						System.out.println("tapez le id Client pour suprimez");
						deleteClient = scanner.nextInt() - 1;

						listOfClient.remove(deleteClient);
					break;
					
					case 6:
						
					break;
					}

				break;
				
				case 4:
					System.out.println("chifre d'affaire total de cette pharmaci est : " + chifreAffaire + "DH");
					System.out.println("nombre de client fedele est: " + nombreDeClientFidele + " Client");
				break;
				
				case 5:
					System.out.println(chifreAffaire + " DH");
					System.out.println("God Bye");
					Quit = true;
				break;
			}
		}

		scanner.close();
	}
}

