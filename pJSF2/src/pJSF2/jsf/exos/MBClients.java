package pJSF2.jsf.exos;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import service.ClientService;
import service.IClientService;

@ManagedBean(name = "mbclients", eager = true)
@SessionScoped
public class MBClients {

	private IClientService ics;
	
	private Client clientCourant = new Client();
	
	public MBClients(){
		ics = new ClientService();
	}
	

	public Client getClientCourant() {
		return clientCourant;
	}



	public ArrayList<Client> getClients() {
		return ics.getClients();
	}

	public String select(Client client) {
		this.clientCourant = client;
		return "client";
	}

	public String supprimer() {
		ics.supprimer(clientCourant);
		return "clients";
	}

	Client newClient = new Client("", "");

	public Client getNewClient() {

		return newClient;
	}

	public void setNewClient(Client newClient) {

		this.newClient = newClient;
	}

	public String ajouter() {

		ics.ajouter(clientCourant);

		clientCourant = new Client("", "");

		return "clients";
	}
	
	public int getNombre(){
		return ics.getClients().size();
	}
}
