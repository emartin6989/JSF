package pJSF2.jsf.exos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

//c'est limplementation de l'interface que l'on appelle dans le bean property
@ManagedBean(name="mbinjectedservice")
@SessionScoped
public class MBInjectedServiceImpl implements MBInjectedService {
	
	public MBInjectedServiceImpl(){
		System.out.println("Injected bean created");
	}
		
	public void show() {
		System.out.println("show injected");
	}

	public String getInjectedData() {
			return "Hello injected service";
	}
	
	public String getInjectedData2() {
		return "Hello injected service le retour";
}
}
	

