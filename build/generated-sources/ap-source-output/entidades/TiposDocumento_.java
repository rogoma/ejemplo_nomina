package entidades;

import entidades.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-30T23:52:02")
@StaticMetamodel(TiposDocumento.class)
public class TiposDocumento_ { 

    public static volatile SingularAttribute<TiposDocumento, String> descripcion;
    public static volatile ListAttribute<TiposDocumento, Usuarios> usuariosList;
    public static volatile SingularAttribute<TiposDocumento, Integer> id;

}