package entidades;

import entidades.Cargo;
import entidades.Ciudades;
import entidades.DetalleNomina;
import entidades.TiposDocumento;
import entidades.Usuarios;
import entidades.UsuariosHasRoles;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-30T23:52:02")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> apellidos;
    public static volatile SingularAttribute<Usuarios, String> numDocumento;
    public static volatile ListAttribute<Usuarios, UsuariosHasRoles> usuariosHasRolesList;
    public static volatile SingularAttribute<Usuarios, String> direccion;
    public static volatile SingularAttribute<Usuarios, Usuarios> usuarios1;
    public static volatile SingularAttribute<Usuarios, Usuarios> usuarios;
    public static volatile SingularAttribute<Usuarios, Ciudades> idCiudad;
    public static volatile SingularAttribute<Usuarios, String> nombres;
    public static volatile SingularAttribute<Usuarios, Integer> idCargo;
    public static volatile SingularAttribute<Usuarios, String> password;
    public static volatile SingularAttribute<Usuarios, Integer> sueldoBasico;
    public static volatile SingularAttribute<Usuarios, TiposDocumento> idTipoDocumento;
    public static volatile SingularAttribute<Usuarios, Integer> id;
    public static volatile SingularAttribute<Usuarios, Cargo> cargo;
    public static volatile SingularAttribute<Usuarios, String> email;
    public static volatile SingularAttribute<Usuarios, Boolean> activo;
    public static volatile ListAttribute<Usuarios, DetalleNomina> detalleNominaList;

}