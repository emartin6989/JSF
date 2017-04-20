package pJSF2.jsf.exos;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "mbeanresult", eager = true)
// @SessionScoped
@ApplicationScoped
public class MBeanResult {

	private String dataResult = "";

	public String getDataResult() {
		return dataResult;
	}

	public void setDataResult(String dataResult) {
		System.out.println("setting DataResult" + dataResult);
		this.dataResult = dataResult;
	}

	public MBeanResult() {
		System.out.println("MBeanResult constructeur");
	}

}
