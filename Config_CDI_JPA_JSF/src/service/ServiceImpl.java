package service;

import java.util.ArrayList;

import javax.inject.Inject;

import dao.IDao;
import metier.Client;

public class ServiceImpl implements IService {
	@Inject
	private IDao dao;

	@Override
	public long addClient(Client c) {
		// TODO Auto-generated method stub
		return dao.addClient(c);
	}
	
	public  ArrayList<Client> listeClient(){
		return dao.listeClient();
	}
	
	public void supprimer(Client c){
		dao.supprimer(c);
	}
	
	public void maj(Client c){
		dao.maj(c);
	}
}
