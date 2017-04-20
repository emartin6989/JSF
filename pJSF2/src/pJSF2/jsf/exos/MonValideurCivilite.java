package pJSF2.jsf.exos;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("civiliteValidator")
public class MonValideurCivilite implements Validator {
	@Override
	public void validate(FacesContext facesContext, UIComponent component, Object value) throws ValidatorException {
		// StringBuilder sb = new StringBuilder();

		String saisi = value.toString();

		if (!(saisi.equalsIgnoreCase("Mr") || saisi.equalsIgnoreCase("Mme") || saisi.equalsIgnoreCase("Melle"))) {
			FacesMessage msg = new FacesMessage("Erreur de civilité (Mr, Mme, Melle)");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}
	}

}
