package service;

import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import pJSF2.jsf.exos.Client;

@ManagedBean(name="clientservice")
@ApplicationScoped
public class ClientService implements IClientService {

	private ArrayList<Client> clients = new ArrayList<Client>();
	
	public ArrayList<Client> getClients() {
		return clients;
	}
	
	public ClientService() {
			clients.add(new Client("Dupont", "Jean"));
			clients.add(new Client("Durand", "Paul"));
			clients.add(new Client("Villar", "Théo"));
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


