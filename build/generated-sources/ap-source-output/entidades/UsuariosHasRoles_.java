package entidades;

import entidades.Roles;
import entidades.Usuarios;
import entidades.UsuariosHasRolesPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-30T23:52:02")
@StaticMetamodel(UsuariosHasRoles.class)
public class UsuariosHasRoles_ { 

    public static volatile SingularAttribute<UsuariosHasRoles, UsuariosHasRolesPK> usuariosHasRolesPK;
    public static volatile SingularAttribute<UsuariosHasRoles, Usuarios> usuario;
    public static volatile SingularAttribute<UsuariosHasRoles, Roles> rol;
    public static volatile SingularAttribute<UsuariosHasRoles, Boolean> activo;

}