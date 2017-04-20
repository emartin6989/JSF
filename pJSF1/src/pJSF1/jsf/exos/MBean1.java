package pJSF1.jsf.exos;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "mbean1", eager = true)
// @SessionScoped
@ApplicationScoped
public class MBean1 {

	private String message = "Hello";
	private int compteur = 0;
	// final static int CONSTANTE = 10;
	private String data = "";
	private String data2 = "";
	private String lesDeux = "";
	private String civilite = "";

	public String getMessage() {
		compteur++;
		return message + " " + compteur + " data = " + data + " data 2 = " + data2;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getData() {
		return data;
	}

	public String getData2() {
		return data2;
	}

	public String getLesDeux() {
		return "data = " + data + " data2 = " + data2;
	}

	public void setData(String data) {
		this.data = data;
		System.out.println("setting data : " + data);
	}

	public void setData2(String data2) {
		this.data2 = data2;
		System.out.println("setting data : " + data2);
		FacesContext ctx = FacesContext.getCurrentInstance();
		ctx.addMessage("leForm:inputData2", new FacesMessage("message inputData2 depuis le bean"));
		ctx.addMessage("leForm:inputDataXXX", new FacesMessage("message inputDataXXX depuis le bean"));
		ctx.addMessage("leFormResult:inputDataResult", new FacesMessage("message inputDataResult depuis le bean"));
		ctx.addMessage(null, new FacesMessage("message à tous depuis le bean"));
	}

	public void setLesDeux(String lesDeux) {
		this.lesDeux = lesDeux;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		System.out.println("setting civilite " + civilite);
		this.civilite = civilite;
	}

	public MBean1() {
		System.out.println("MBean1 constructeur");
	}

	public String goConditionnel() {
		if (data.length() > 10) {
			return "jsf2result2";
		} else {
			return "jsf2result";
		}
	}

	public String testErreur() {
		System.out.println("testErreur");
		return "erreur";
	}
}
