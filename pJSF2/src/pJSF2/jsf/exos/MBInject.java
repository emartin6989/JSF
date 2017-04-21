package pJSF2.jsf.exos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="mbinject")
@SessionScoped
public class MBInject {
	
	public MBInject(){
	}
	
	@ManagedProperty(value="#{mbinjected}")
	private MBInjected mBInjected;
	
	public void setmBInjected(MBInjected mBInjected) {
		this.mBInjected = mBInjected;
	}
	
	@ManagedProperty(value="#{mbinjectedservice}")
	private MBInjectedService mBInjectedService;
		
	public void setmBInjectedService(MBInjectedService mBInjectedService) {
		this.mBInjectedService = mBInjectedService;
	}

	private String data = "data from inject";

	public String getData() {
		mBInjected.show();
		mBInjectedService.show();
		return mBInjected.getInjectedData()+" + " +mBInjectedService.getInjectedData()+" + "+mBInjectedService.getInjectedData2();
	}
	
}
