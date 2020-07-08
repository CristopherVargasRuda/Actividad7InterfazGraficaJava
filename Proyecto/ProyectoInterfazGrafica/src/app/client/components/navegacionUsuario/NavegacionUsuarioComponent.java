package app.client.components.navegacionUsuario;

import app.client.VistaPrincipal.VistaPrincipalComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NavegacionUsuarioComponent implements ActionListener {

    private NavegacionUsuarioTemplate navegacionUsuarioTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;
    private String comando;
    
    public NavegacionUsuarioComponent(VistaPrincipalComponent vistaPrincipalComponent) {
        this.vistaPrincipalComponent = vistaPrincipalComponent;
        this.navegacionUsuarioTemplate =  new NavegacionUsuarioTemplate(this);
        comando = "";
    }
    
    public NavegacionUsuarioTemplate getNavegacionUsuarioTemplate() {
        return this.navegacionUsuarioTemplate;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(comando);
        if(e.getSource()== navegacionUsuarioTemplate.getbCerrar()){
            System.exit(0);
        }
        if(!comando.equals(e.getActionCommand().trim())){
            comando = e.getActionCommand().trim();
            System.out.println(comando);
            this.vistaPrincipalComponent.mostrarComponente(e.getActionCommand().trim()); 
        }
        else{
            System.out.println(comando+ " Vida hpta");
            comando = "";
            this.vistaPrincipalComponent.mostrarComponente("principal");
        }
    }

    
}