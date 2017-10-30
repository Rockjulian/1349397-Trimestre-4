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

public class TipoInstructor implements Serializable
{
	/** 
	 * This attribute maps to the column modalidad in the tipo_instructor table.
	 */
	protected String modalidad;

	/** 
	 * This attribute maps to the column estado in the tipo_instructor table.
	 */
	protected short estado;

	/**
	 * Method 'TipoInstructor'
	 * 
	 */
	public TipoInstructor()
	{
	}

	/**
	 * Method 'getModalidad'
	 * 
	 * @return String
	 */
	public String getModalidad()
	{
		return modalidad;
	}

	/**
	 * Method 'setModalidad'
	 * 
	 * @param modalidad
	 */
	public void setModalidad(String modalidad)
	{
		this.modalidad = modalidad;
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
		
		if (!(_other instanceof TipoInstructor)) {
			return false;
		}
		
		final TipoInstructor _cast = (TipoInstructor) _other;
		if (modalidad == null ? _cast.modalidad != modalidad : !modalidad.equals( _cast.modalidad )) {
			return false;
		}
		
		if (estado != _cast.estado) {
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
		if (modalidad != null) {
			_hashCode = 29 * _hashCode + modalidad.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) estado;
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return TipoInstructorPk
	 */
	public TipoInstructorPk createPk()
	{
		return new TipoInstructorPk(modalidad);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.model.dao.dto.TipoInstructor: " );
		ret.append( "modalidad=" + modalidad );
		ret.append( ", estado=" + estado );
		return ret.toString();
	}

}
