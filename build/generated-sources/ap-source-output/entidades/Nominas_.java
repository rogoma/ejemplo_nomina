package entidades;

import entidades.DetalleNomina;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-30T23:52:02")
@StaticMetamodel(Nominas.class)
public class Nominas_ { 

    public static volatile SingularAttribute<Nominas, String> descripcion;
    public static volatile SingularAttribute<Nominas, Integer> mes;
    public static volatile SingularAttribute<Nominas, Integer> id;
    public static volatile ListAttribute<Nominas, DetalleNomina> detalleNominaList;

}