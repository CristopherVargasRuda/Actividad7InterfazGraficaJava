package app.client.components.principal;

import app.client.VistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PrincipalComponent implements ActionListener{
    private PrincipalTemplate principalTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    

    public PrincipalComponent(VistaPrincipalComponent vistaPrincipalComponent) {
        this.vistaPrincipalComponent = vistaPrincipalComponent;
        this.principalTemplate = new PrincipalTemplate(this);        
    }

    public PrincipalTemplate getPrincipalTemplate() {
        return principalTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
