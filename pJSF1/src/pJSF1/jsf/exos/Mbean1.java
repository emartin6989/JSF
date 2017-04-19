package pJSF1.jsf.exos;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "mbean1", eager = true)
public class Mbean1 {

	private String message="Hello";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
