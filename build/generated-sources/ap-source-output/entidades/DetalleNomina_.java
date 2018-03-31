package entidades;

import entidades.Nominas;
import entidades.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-30T23:52:02")
@StaticMetamodel(DetalleNomina.class)
public class DetalleNomina_ { 

    public static volatile SingularAttribute<DetalleNomina, Integer> descuentoPension;
    public static volatile SingularAttribute<DetalleNomina, Integer> descuentoSalud;
    public static volatile SingularAttribute<DetalleNomina, Integer> netoPagar;
    public static volatile SingularAttribute<DetalleNomina, Integer> otrosDescuentos;
    public static volatile SingularAttribute<DetalleNomina, Usuarios> idUsuario;
    public static volatile SingularAttribute<DetalleNomina, Integer> valorHorasExtras;
    public static volatile SingularAttribute<DetalleNomina, Integer> descuentoFondoSolidaridad;
    public static volatile SingularAttribute<DetalleNomina, Integer> totalDevengado;
    public static volatile SingularAttribute<DetalleNomina, Integer> diasLaborados;
    public static volatile SingularAttribute<DetalleNomina, Integer> sueldoDevengado;
    public static volatile SingularAttribute<DetalleNomina, Integer> totalDescuento;
    public static volatile SingularAttribute<DetalleNomina, Nominas> idNomina;
    public static volatile SingularAttribute<DetalleNomina, Integer> auxilioTransporte;
    public static volatile SingularAttribute<DetalleNomina, Integer> id;

}