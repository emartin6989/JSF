package pJSF2.jsf.exos;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

//l'interface fera appel � l'impl�mentation
public interface MBInjectedService {
	
	public void show();

	public String getInjectedData();
	
	public String getInjectedData2();
}

