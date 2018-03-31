package entidades;

import entidades.Ciudades;
import entidades.Paises;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-30T23:52:02")
@StaticMetamodel(Departamentos.class)
public class Departamentos_ { 

    public static volatile SingularAttribute<Departamentos, Paises> idPais;
    public static volatile SingularAttribute<Departamentos, Integer> id;
    public static volatile ListAttribute<Departamentos, Ciudades> ciudadesList;
    public static volatile SingularAttribute<Departamentos, String> nombre;

}