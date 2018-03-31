
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**** @author rogoma */

@Embeddable
public class UsuariosHasRolesPK implements Serializable {    
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_usuario")
    private int usuario;
        
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_rol")
    private String rol;

    public UsuariosHasRolesPK() {
        
    }
    
    public UsuariosHasRolesPK(int usuario, String rol) {
        this.usuario = usuario;
        this.rol = rol;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    
    
    
    
}
