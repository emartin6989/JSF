package service;

import java.util.ArrayList;

import metier.Client;

public interface IService {
	public long addClient(Client c);
	public  ArrayList<Client> listeClient();
	public void supprimer(Client c);
	public void maj(Client c);
}
