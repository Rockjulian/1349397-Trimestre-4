/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.model.dao.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the observacion_item table.
 */
public class ObservacionItemPk implements Serializable
{
	protected int idObservacion;

	protected String numeroFicha;

	protected int grupoCodigo;

	protected String listaChequeo;

	protected int idItem;

	/** 
	 * This attribute represents whether the primitive attribute idObservacion is null.
	 */
	protected boolean idObservacionNull;

	/** 
	 * This attribute represents whether the primitive attribute grupoCodigo is null.
	 */
	protected boolean grupoCodigoNull;

	/** 
	 * This attribute represents whether the primitive attribute idItem is null.
	 */
	protected boolean idItemNull;

	/** 
	 * Sets the value of idObservacion
	 */
	public void setIdObservacion(int idObservacion)
	{
		this.idObservacion = idObservacion;
	}

	/** 
	 * Gets the value of idObservacion
	 */
	public int getIdObservacion()
	{
		return idObservacion;
	}

	/** 
	 * Sets the value of numeroFicha
	 */
	public void setNumeroFicha(String numeroFicha)
	{
		this.numeroFicha = numeroFicha;
	}

	/** 
	 * Gets the value of numeroFicha
	 */
	public String getNumeroFicha()
	{
		return numeroFicha;
	}

	/** 
	 * Sets the value of grupoCodigo
	 */
	public void setGrupoCodigo(int grupoCodigo)
	{
		this.grupoCodigo = grupoCodigo;
	}

	/** 
	 * Gets the value of grupoCodigo
	 */
	public int getGrupoCodigo()
	{
		return grupoCodigo;
	}

	/** 
	 * Sets the value of listaChequeo
	 */
	public void setListaChequeo(String listaChequeo)
	{
		this.listaChequeo = listaChequeo;
	}

	/** 
	 * Gets the value of listaChequeo
	 */
	public String getListaChequeo()
	{
		return listaChequeo;
	}

	/** 
	 * Sets the value of idItem
	 */
	public void setIdItem(int idItem)
	{
		this.idItem = idItem;
	}

	/** 
	 * Gets the value of idItem
	 */
	public int getIdItem()
	{
		return idItem;
	}

	/**
	 * Method 'ObservacionItemPk'
	 * 
	 */
	public ObservacionItemPk()
	{
	}

	/**
	 * Method 'ObservacionItemPk'
	 * 
	 * @param idObservacion
	 * @param numeroFicha
	 * @param grupoCodigo
	 * @param listaChequeo
	 * @param idItem
	 */
	public ObservacionItemPk(final int idObservacion, final String numeroFicha, final int grupoCodigo, final String listaChequeo, final int idItem)
	{
		this.idObservacion = idObservacion;
		this.numeroFicha = numeroFicha;
		this.grupoCodigo = grupoCodigo;
		this.listaChequeo = listaChequeo;
		this.idItem = idItem;
	}

	/** 
	 * Sets the value of idObservacionNull
	 */
	public void setIdObservacionNull(boolean idObservacionNull)
	{
		this.idObservacionNull = idObservacionNull;
	}

	/** 
	 * Gets the value of idObservacionNull
	 */
	public boolean isIdObservacionNull()
	{
		return idObservacionNull;
	}

	/** 
	 * Sets the value of grupoCodigoNull
	 */
	public void setGrupoCodigoNull(boolean grupoCodigoNull)
	{
		this.grupoCodigoNull = grupoCodigoNull;
	}

	/** 
	 * Gets the value of grupoCodigoNull
	 */
	public boolean isGrupoCodigoNull()
	{
		return grupoCodigoNull;
	}

	/** 
	 * Sets the value of idItemNull
	 */
	public void setIdItemNull(boolean idItemNull)
	{
		this.idItemNull = idItemNull;
	}

	/** 
	 * Gets the value of idItemNull
	 */
	public boolean isIdItemNull()
	{
		return idItemNull;
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
		
		if (!(_other instanceof ObservacionItemPk)) {
			return false;
		}
		
		final ObservacionItemPk _cast = (ObservacionItemPk) _other;
		if (idObservacion != _cast.idObservacion) {
			return false;
		}
		
		if (numeroFicha == null ? _cast.numeroFicha != numeroFicha : !numeroFicha.equals( _cast.numeroFicha )) {
			return false;
		}
		
		if (grupoCodigo != _cast.grupoCodigo) {
			return false;
		}
		
		if (listaChequeo == null ? _cast.listaChequeo != listaChequeo : !listaChequeo.equals( _cast.listaChequeo )) {
			return false;
		}
		
		if (idItem != _cast.idItem) {
			return false;
		}
		
		if (idObservacionNull != _cast.idObservacionNull) {
			return false;
		}
		
		if (grupoCodigoNull != _cast.grupoCodigoNull) {
			return false;
		}
		
		if (idItemNull != _cast.idItemNull) {
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
		_hashCode = 29 * _hashCode + idObservacion;
		if (numeroFicha != null) {
			_hashCode = 29 * _hashCode + numeroFicha.hashCode();
		}
		
		_hashCode = 29 * _hashCode + grupoCodigo;
		if (listaChequeo != null) {
			_hashCode = 29 * _hashCode + listaChequeo.hashCode();
		}
		
		_hashCode = 29 * _hashCode + idItem;
		_hashCode = 29 * _hashCode + (idObservacionNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (grupoCodigoNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (idItemNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.model.dao.dto.ObservacionItemPk: " );
		ret.append( "idObservacion=" + idObservacion );
		ret.append( ", numeroFicha=" + numeroFicha );
		ret.append( ", grupoCodigo=" + grupoCodigo );
		ret.append( ", listaChequeo=" + listaChequeo );
		ret.append( ", idItem=" + idItem );
		return ret.toString();
	}

}
