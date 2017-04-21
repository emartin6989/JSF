package service;

import java.util.ArrayList;

import pJSF2.jsf.exos.Client;

public interface IClientService {
	
	public ArrayList<Client> getClients();

	public void supprimer(Client client);

	public void ajouter(Client client);

	public int getNombre();

}