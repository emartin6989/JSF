package pJSF2.jsf.exos;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "mbclients", eager = true)
@SessionScoped
public class MBClients {

	private ArrayList<Client> clients = new ArrayList<Client>();
	private Client clientCourant= new Client();
	private int nombre;

	public MBClients() {
		System.out.println("Constructeur MBClients");
		clients.add(new Client("Dupont", "Jean"));
		clients.add(new Client("Durand", "Paul"));
		clients.add(new Client("Villar", "Théo"));
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	public String select(Client client) {
		this.clientCourant = client;
		System.out.println("select : " + client.getNom());
		return "client";
	}

	public String supprimer() {
		clients.remove(clientCourant);
		System.out.println("Le client sélectionner a été supprimé");
		return "clients";
	}
	
	public String ajouter() {
		Client c = new Client();
		c.setNom(clientCourant.getNom());
		c.setPrenom(clientCourant.getPrenom());
		clients.add(c);
		clientCourant = new Client();
		System.out.println("Le client "+clientCourant.getPrenom()+" "+clientCourant.getNom() +"a bien été ajouté.");
		return "clients";
	}

	public Client getClientCourant() {
		return clientCourant;
	}

	public void setClientCourant(Client clientCourant) {
		this.clientCourant = clientCourant;
	}

	public int getNombre() {
		return clients.size();
	}

}
