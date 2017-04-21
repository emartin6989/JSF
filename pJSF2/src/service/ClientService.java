package service;

import java.util.ArrayList;

import pJSF2.jsf.exos.Client;

public class ClientService implements IClientService {

	private ArrayList<Client> clients = new ArrayList<Client>();
	
	public ArrayList<Client> getClients() {
		return clients;
	}
	
	public ClientService() {
			clients.add(new Client("Dupont", "Jean"));
			clients.add(new Client("Durand", "Paul"));
			clients.add(new Client("Villar", "Th�o"));
		}

	public void supprimer(Client client) {
		clients.remove(client);
	}

	public void  ajouter(Client client) {
		clients.add(client);
	}
	
	public int getNombre() {
		return clients.size();
	}
}


