
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**** @author rogoma */

@Entity
@Table(name = "usuarios_has_roles")
public class UsuariosHasRoles implements Serializable {
    @EmbeddedId
    protected UsuariosHasRolesPK usuariosHasRolesPK;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "activo")
    private Boolean activo;
    
    @JoinColumn(name="id_usuario", referencedColumnName ="id")
    @ManyToOne(optional = false)
    private Usuarios usuario;
    
    @JoinColumn(name="id_rol", referencedColumnName ="id")
    @ManyToOne(optional = false)
    private Roles rol;

    public UsuariosHasRoles() {
    
    }
    
    public UsuariosHasRoles(UsuariosHasRolesPK usuariosHasRolesPK) {
        this.usuariosHasRolesPK = usuariosHasRolesPK;
    }

    public UsuariosHasRoles(UsuariosHasRolesPK usuariosHasRolesPK, Boolean activo) {
        this.usuariosHasRolesPK = usuariosHasRolesPK;
        this.activo = activo;
    }

    public UsuariosHasRolesPK getUsuariosHasRolesPK() {
        return usuariosHasRolesPK;
    }

    public void setUsuariosHasRolesPK(UsuariosHasRolesPK usuariosHasRolesPK) {
        this.usuariosHasRolesPK = usuariosHasRolesPK;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Roles getRol() {
        return rol;
    }

    public void setRol(Roles rol) {
        this.rol = rol;
    }    
}
