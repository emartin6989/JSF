package mbeans;

import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import metier.Client;
import service.IService;

@ManagedBean
@ViewScoped
@Named
public class ClientBean {

	@Inject
	private IService service;
	private Client client = new Client();
	private ArrayList<Client> clients;
	private Boolean editMode = false;

	public IService getService() {
		return service;
	}

	public void setService(IService service) {
		this.service = service;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ArrayList<Client> getClients() {
		return service.listeClient();
	}

	public String supprimerClient() {
		service.supprimer(client);
		client = new Client();
		return "index";
	}

	public String addClient() {
		if (editMode == false) {
			if (!client.getNom().equalsIgnoreCase("") && !client.getPrenom().equalsIgnoreCase("")) {
				service.addClient(client);
				client = new Client();
			} else {
				FacesContext context = FacesContext.getCurrentInstance();
				context.addMessage("client",
						new FacesMessage(FacesMessage.SEVERITY_ERROR, "veuillez saisir des valeurs non nulles", ""));
			}
		} else {
			if (!client.getNom().equalsIgnoreCase("") && !client.getPrenom().equalsIgnoreCase("")) {
				service.maj(client);
				editMode = false;
				client = new Client();
			} else {
				FacesContext context = FacesContext.getCurrentInstance();
				context.addMessage("client",
						new FacesMessage(FacesMessage.SEVERITY_ERROR, "veuillez saisir des valeurs non nulles", ""));
			}
		}
		return "index";
	}

	public void majClient() {
		// service.maj(client);
		editMode = true;
	}
}