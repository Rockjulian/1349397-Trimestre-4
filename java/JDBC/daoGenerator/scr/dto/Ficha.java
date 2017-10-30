/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.model.dao.dto;

import co.edu.sena.model.dao.dao.*;
import co.edu.sena.model.dao.factory.*;
import co.edu.sena.model.dao.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Ficha implements Serializable
{
	/** 
	 * This attribute maps to the column numero_ficha in the ficha table.
	 */
	protected String numeroFicha;

	/** 
	 * This attribute maps to the column programa_codigo_version in the ficha table.
	 */
	protected String programaCodigoVersion;

	/** 
	 * This attribute maps to the column jornada_nombre in the ficha table.
	 */
	protected String jornadaNombre;

	/** 
	 * This attribute maps to the column estado in the ficha table.
	 */
	protected String estado;

	/**
	 * Method 'Ficha'
	 * 
	 */
	public Ficha()
	{
	}

	/**
	 * Method 'getNumeroFicha'
	 * 
	 * @return String
	 */
	public String getNumeroFicha()
	{
		return numeroFicha;
	}

	/**
	 * Method 'setNumeroFicha'
	 * 
	 * @param numeroFicha
	 */
	public void setNumeroFicha(String numeroFicha)
	{
		this.numeroFicha = numeroFicha;
	}

	/**
	 * Method 'getProgramaCodigoVersion'
	 * 
	 * @return String
	 */
	public String getProgramaCodigoVersion()
	{
		return programaCodigoVersion;
	}

	/**
	 * Method 'setProgramaCodigoVersion'
	 * 
	 * @param programaCodigoVersion
	 */
	public void setProgramaCodigoVersion(String programaCodigoVersion)
	{
		this.programaCodigoVersion = programaCodigoVersion;
	}

	/**
	 * Method 'getJornadaNombre'
	 * 
	 * @return String
	 */
	public String getJornadaNombre()
	{
		return jornadaNombre;
	}

	/**
	 * Method 'setJornadaNombre'
	 * 
	 * @param jornadaNombre
	 */
	public void setJornadaNombre(String jornadaNombre)
	{
		this.jornadaNombre = jornadaNombre;
	}

	/**
	 * Method 'getEstado'
	 * 
	 * @return String
	 */
	public String getEstado()
	{
		return estado;
	}

	/**
	 * Method 'setEstado'
	 * 
	 * @param estado
	 */
	public void setEstado(String estado)
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
		
		if (!(_other instanceof Ficha)) {
			return false;
		}
		
		final Ficha _cast = (Ficha) _other;
		if (numeroFicha == null ? _cast.numeroFicha != numeroFicha : !numeroFicha.equals( _cast.numeroFicha )) {
			return false;
		}
		
		if (programaCodigoVersion == null ? _cast.programaCodigoVersion != programaCodigoVersion : !programaCodigoVersion.equals( _cast.programaCodigoVersion )) {
			return false;
		}
		
		if (jornadaNombre == null ? _cast.jornadaNombre != jornadaNombre : !jornadaNombre.equals( _cast.jornadaNombre )) {
			return false;
		}
		
		if (estado == null ? _cast.estado != estado : !estado.equals( _cast.estado )) {
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
		if (numeroFicha != null) {
			_hashCode = 29 * _hashCode + numeroFicha.hashCode();
		}
		
		if (programaCodigoVersion != null) {
			_hashCode = 29 * _hashCode + programaCodigoVersion.hashCode();
		}
		
		if (jornadaNombre != null) {
			_hashCode = 29 * _hashCode + jornadaNombre.hashCode();
		}
		
		if (estado != null) {
			_hashCode = 29 * _hashCode + estado.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return FichaPk
	 */
	public FichaPk createPk()
	{
		return new FichaPk(numeroFicha);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.model.dao.dto.Ficha: " );
		ret.append( "numeroFicha=" + numeroFicha );
		ret.append( ", programaCodigoVersion=" + programaCodigoVersion );
		ret.append( ", jornadaNombre=" + jornadaNombre );
		ret.append( ", estado=" + estado );
		return ret.toString();
	}

}