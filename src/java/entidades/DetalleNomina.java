/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rogoma
 */
@Entity
@Table(name = "detalle_nomina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleNomina.findAll", query = "SELECT d FROM DetalleNomina d")
    , @NamedQuery(name = "DetalleNomina.findById", query = "SELECT d FROM DetalleNomina d WHERE d.id = :id")
    , @NamedQuery(name = "DetalleNomina.findByDiasLaborados", query = "SELECT d FROM DetalleNomina d WHERE d.diasLaborados = :diasLaborados")
    , @NamedQuery(name = "DetalleNomina.findBySueldoDevengado", query = "SELECT d FROM DetalleNomina d WHERE d.sueldoDevengado = :sueldoDevengado")
    , @NamedQuery(name = "DetalleNomina.findByAuxilioTransporte", query = "SELECT d FROM DetalleNomina d WHERE d.auxilioTransporte = :auxilioTransporte")
    , @NamedQuery(name = "DetalleNomina.findByValorHorasExtras", query = "SELECT d FROM DetalleNomina d WHERE d.valorHorasExtras = :valorHorasExtras")
    , @NamedQuery(name = "DetalleNomina.findByDescuentoSalud", query = "SELECT d FROM DetalleNomina d WHERE d.descuentoSalud = :descuentoSalud")
    , @NamedQuery(name = "DetalleNomina.findByDescuentoPension", query = "SELECT d FROM DetalleNomina d WHERE d.descuentoPension = :descuentoPension")
    , @NamedQuery(name = "DetalleNomina.findByDescuentoFondoSolidaridad", query = "SELECT d FROM DetalleNomina d WHERE d.descuentoFondoSolidaridad = :descuentoFondoSolidaridad")
    , @NamedQuery(name = "DetalleNomina.findByOtrosDescuentos", query = "SELECT d FROM DetalleNomina d WHERE d.otrosDescuentos = :otrosDescuentos")
    , @NamedQuery(name = "DetalleNomina.findByTotalDevengado", query = "SELECT d FROM DetalleNomina d WHERE d.totalDevengado = :totalDevengado")
    , @NamedQuery(name = "DetalleNomina.findByTotalDescuento", query = "SELECT d FROM DetalleNomina d WHERE d.totalDescuento = :totalDescuento")
    , @NamedQuery(name = "DetalleNomina.findByNetoPagar", query = "SELECT d FROM DetalleNomina d WHERE d.netoPagar = :netoPagar")})
public class DetalleNomina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "dias_laborados")
    private int diasLaborados;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "sueldo_devengado")
    private int sueldoDevengado;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "auxilio_transporte")
    private int auxilioTransporte;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_horas_extras")    
    private int valorHorasExtras;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "descuento_salud")
    private int descuentoSalud;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "descuento_pension")
    private int descuentoPension;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "descuento_fondo_solidaridad")
    private int descuentoFondoSolidaridad;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "otros_descuentos")
    private int otrosDescuentos;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_devengado")    
    private int totalDevengado;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_descuento")
    private int totalDescuento;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "neto_pagar")
    private int netoPagar;
    
    @JoinColumn(name = "id_nomina", referencedColumnName = "id")
    @ManyToOne
    private Nominas idNomina;
    
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne
    private Usuarios idUsuario;

    public DetalleNomina() {
    }

    public DetalleNomina(Integer id) {
        this.id = id;
    }

    public DetalleNomina(Integer id, int diasLaborados, int sueldoDevengado, int auxilioTransporte, int valorHorasExtras, int descuentoSalud, int descuentoPension, int descuentoFondoSolidaridad, int otrosDescuentos, int totalDevengado, int totalDescuento, int netoPagar) {
        this.id = id;
        this.diasLaborados = diasLaborados;
        this.sueldoDevengado = sueldoDevengado;
        this.auxilioTransporte = auxilioTransporte;
        this.valorHorasExtras = valorHorasExtras;
        this.descuentoSalud = descuentoSalud;
        this.descuentoPension = descuentoPension;
        this.descuentoFondoSolidaridad = descuentoFondoSolidaridad;
        this.otrosDescuentos = otrosDescuentos;
        this.totalDevengado = totalDevengado;
        this.totalDescuento = totalDescuento;
        this.netoPagar = netoPagar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDiasLaborados() {
        return diasLaborados;
    }

    public void setDiasLaborados(int diasLaborados) {
        this.diasLaborados = diasLaborados;
    }

    public int getSueldoDevengado() {
        return sueldoDevengado;
    }

    public void setSueldoDevengado(int sueldoDevengado) {
        this.sueldoDevengado = sueldoDevengado;
    }

    public int getAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(int auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    public int getValorHorasExtras() {
        return valorHorasExtras;
    }

    public void setValorHorasExtras(int valorHorasExtras) {
        this.valorHorasExtras = valorHorasExtras;
    }

    public int getDescuentoSalud() {
        return descuentoSalud;
    }

    public void setDescuentoSalud(int descuentoSalud) {
        this.descuentoSalud = descuentoSalud;
    }

    public int getDescuentoPension() {
        return descuentoPension;
    }

    public void setDescuentoPension(int descuentoPension) {
        this.descuentoPension = descuentoPension;
    }

    public int getDescuentoFondoSolidaridad() {
        return descuentoFondoSolidaridad;
    }

    public void setDescuentoFondoSolidaridad(int descuentoFondoSolidaridad) {
        this.descuentoFondoSolidaridad = descuentoFondoSolidaridad;
    }

    public int getOtrosDescuentos() {
        return otrosDescuentos;
    }

    public void setOtrosDescuentos(int otrosDescuentos) {
        this.otrosDescuentos = otrosDescuentos;
    }

    public int getTotalDevengado() {
        return totalDevengado;
    }

    public void setTotalDevengado(int totalDevengado) {
        this.totalDevengado = totalDevengado;
    }

    public int getTotalDescuento() {
        return totalDescuento;
    }

    public void setTotalDescuento(int totalDescuento) {
        this.totalDescuento = totalDescuento;
    }

    public int getNetoPagar() {
        return netoPagar;
    }

    public void setNetoPagar(int netoPagar) {
        this.netoPagar = netoPagar;
    }

    public Nominas getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(Nominas idNomina) {
        this.idNomina = idNomina;
    }

    public Usuarios getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuarios idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleNomina)) {
            return false;
        }
        DetalleNomina other = (DetalleNomina) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.DetalleNomina[ id=" + id + " ]";
    }
    
}
