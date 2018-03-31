package entidades;

import entidades.Departamentos;
import entidades.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-30T23:52:02")
@StaticMetamodel(Ciudades.class)
public class Ciudades_ { 

    public static volatile ListAttribute<Ciudades, Usuarios> usuariosList;
    public static volatile SingularAttribute<Ciudades, Departamentos> idDepartamento;
    public static volatile SingularAttribute<Ciudades, Integer> id;
    public static volatile SingularAttribute<Ciudades, String> nombre;

}