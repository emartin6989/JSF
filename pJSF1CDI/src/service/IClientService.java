package service;

import java.util.ArrayList;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import pJSF1CDI.jsf.exos.Client;

@Named
@ApplicationScoped
public interface IClientService {
	
	public ArrayList<Client> getClients();

	public void supprimer(Client client);

	public void ajouter(Client client);

	public int getNombre();

}