/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.model.dao.dto;

import co.edu.sena.controller.dao.*;
import co.edu.sena.controller.factory.*;
import co.edu.sena.controller.dao.exceptions.*;
import java.io.Serializable;
import java.util.*;
import java.util.Date;

public class ClienteHasRol implements Serializable
{
	/** 
	 * This attribute maps to the column tipo_documento in the cliente_has_rol table.
	 */
	protected String tipoDocumento;

	/** 
	 * This attribute maps to the column numero_documento in the cliente_has_rol table.
	 */
	protected String numeroDocumento;

	/** 
	 * This attribute maps to the column rol in the cliente_has_rol table.
	 */
	protected String rol;

	/** 
	 * This attribute maps to the column estado in the cliente_has_rol table.
	 */
	protected short estado;

	/** 
	 * This attribute maps to the column fecha_terminacion in the cliente_has_rol table.
	 */
	protected Date fechaTerminacion;

	/**
	 * Method 'ClienteHasRol'
	 * 
	 */
	public ClienteHasRol()
	{
	}

	/**
	 * Method 'getTipoDocumento'
	 * 
	 * @return String
	 */
	public String getTipoDocumento()
	{
		return tipoDocumento;
	}

	/**
	 * Method 'setTipoDocumento'
	 * 
	 * @param tipoDocumento
	 */
	public void setTipoDocumento(String tipoDocumento)
	{
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * Method 'getNumeroDocumento'
	 * 
	 * @return String
	 */
	public String getNumeroDocumento()
	{
		return numeroDocumento;
	}

	/**
	 * Method 'setNumeroDocumento'
	 * 
	 * @param numeroDocumento
	 */
	public void setNumeroDocumento(String numeroDocumento)
	{
		this.numeroDocumento = numeroDocumento;
	}

	/**
	 * Method 'getRol'
	 * 
	 * @return String
	 */
	public String getRol()
	{
		return rol;
	}

	/**
	 * Method 'setRol'
	 * 
	 * @param rol
	 */
	public void setRol(String rol)
	{
		this.rol = rol;
	}

	/**
	 * Method 'getEstado'
	 * 
	 * @return short
	 */
	public short getEstado()
	{
		return estado;
	}

	/**
	 * Method 'setEstado'
	 * 
	 * @param estado
	 */
	public void setEstado(short estado)
	{
		this.estado = estado;
	}

	/**
	 * Method 'getFechaTerminacion'
	 * 
	 * @return Date
	 */
	public Date getFechaTerminacion()
	{
		return fechaTerminacion;
	}

	/**
	 * Method 'setFechaTerminacion'
	 * 
	 * @param fechaTerminacion
	 */
	public void setFechaTerminacion(Date fechaTerminacion)
	{
		this.fechaTerminacion = fechaTerminacion;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof ClienteHasRol)) {
			return false;
		}
		
		final ClienteHasRol _cast = (ClienteHasRol) _other;
		if (tipoDocumento == null ? _cast.tipoDocumento != tipoDocumento : !tipoDocumento.equals( _cast.tipoDocumento )) {
			return false;
		}
		
		if (numeroDocumento == null ? _cast.numeroDocumento != numeroDocumento : !numeroDocumento.equals( _cast.numeroDocumento )) {
			return false;
		}
		
		if (rol == null ? _cast.rol != rol : !rol.equals( _cast.rol )) {
			return false;
		}
		
		if (estado != _cast.estado) {
			return false;
		}
		
		if (fechaTerminacion == null ? _cast.fechaTerminacion != fechaTerminacion : !fechaTerminacion.equals( _cast.fechaTerminacion )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (tipoDocumento != null) {
			_hashCode = 29 * _hashCode + tipoDocumento.hashCode();
		}
		
		if (numeroDocumento != null) {
			_hashCode = 29 * _hashCode + numeroDocumento.hashCode();
		}
		
		if (rol != null) {
			_hashCode = 29 * _hashCode + rol.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) estado;
		if (fechaTerminacion != null) {
			_hashCode = 29 * _hashCode + fechaTerminacion.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ClienteHasRolPk
	 */
	public ClienteHasRolPk createPk()
	{
		return new ClienteHasRolPk(tipoDocumento, numeroDocumento, rol);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.model.dao.dto.ClienteHasRol: " );
		ret.append( "tipoDocumento=" + tipoDocumento );
		ret.append( ", numeroDocumento=" + numeroDocumento );
		ret.append( ", rol=" + rol );
		ret.append( ", estado=" + estado );
		ret.append( ", fechaTerminacion=" + fechaTerminacion );
		return ret.toString();
	}

}
