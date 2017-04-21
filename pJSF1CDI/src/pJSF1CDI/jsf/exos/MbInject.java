package pJSF1CDI.jsf.exos;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import service.IClientService;

@Named
@SessionScoped
public class MbInject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MbInject() {
	}

	@Inject
	private MbInjected mbInjected;

	@Inject
	private IClientService ics;

	// public void setMbInjected(MbInjected mbInjected) {
	// this.mbInjected = mbInjected;
	// }

	private String data = "data from inject";

	public String getData() {
		mbInjected.show();
		ics.getNombre();
		return mbInjected.getInjectedData() + " + " + " le nombre client est " + ics.getNombre();
		// return "data from MbInject";
	}

	private String editValue = "";
	private String spinnerValue = "";

	public String getEditValue() {
		return editValue;
	}

	public void setEditValue(String editValue) {
		this.editValue = editValue;
	}

	public String getSpinnerValue() {
		return spinnerValue;
	}

	public void setSpinnerValue(String spinnerValue) {
		this.spinnerValue = spinnerValue;
	}

}
