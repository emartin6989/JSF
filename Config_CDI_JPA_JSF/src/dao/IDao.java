package dao;

import java.util.ArrayList;

import metier.Client;

public interface IDao {
	public long addClient(Client c);
	public  ArrayList<Client> listeClient();
	public void supprimer(Client c);
	public void maj(Client c);
}
