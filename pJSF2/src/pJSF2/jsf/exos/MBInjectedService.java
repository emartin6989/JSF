package pJSF2.jsf.exos;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

//l'interface fera appel à l'implémentation
public interface MBInjectedService {
	
	public void show();

	public String getInjectedData();
	
	public String getInjectedData2();
}

