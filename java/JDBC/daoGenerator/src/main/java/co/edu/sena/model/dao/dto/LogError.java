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

public class LogError implements Serializable
{
	/** 
	 * This attribute maps to the column id_log in the log_error table.
	 */
	protected long idLog;

	/** 
	 * This attribute maps to the column level in the log_error table.
	 */
	protected String level;

	/** 
	 * This attribute maps to the column log_name in the log_error table.
	 */
	protected String logName;

	/** 
	 * This attribute maps to the column mensage in the log_error table.
	 */
	protected String mensage;

	/** 
	 * This attribute maps to the column fecha in the log_error table.
	 */
	protected Date fecha;

	/** 
	 * This attribute maps to the column usuario in the log_error table.
	 */
	protected String usuario;

	/**
	 * Method 'LogError'
	 * 
	 */
	public LogError()
	{
	}

	/**
	 * Method 'getIdLog'
	 * 
	 * @return long
	 */
	public long getIdLog()
	{
		return idLog;
	}

	/**
	 * Method 'setIdLog'
	 * 
	 * @param idLog
	 */
	public void setIdLog(long idLog)
	{
		this.idLog = idLog;
	}

	/**
	 * Method 'getLevel'
	 * 
	 * @return String
	 */
	public String getLevel()
	{
		return level;
	}

	/**
	 * Method 'setLevel'
	 * 
	 * @param level
	 */
	public void setLevel(String level)
	{
		this.level = level;
	}

	/**
	 * Method 'getLogName'
	 * 
	 * @return String
	 */
	public String getLogName()
	{
		return logName;
	}

	/**
	 * Method 'setLogName'
	 * 
	 * @param logName
	 */
	public void setLogName(String logName)
	{
		this.logName = logName;
	}

	/**
	 * Method 'getMensage'
	 * 
	 * @return String
	 */
	public String getMensage()
	{
		return mensage;
	}

	/**
	 * Method 'setMensage'
	 * 
	 * @param mensage
	 */
	public void setMensage(String mensage)
	{
		this.mensage = mensage;
	}

	/**
	 * Method 'getFecha'
	 * 
	 * @return Date
	 */
	public Date getFecha()
	{
		return fecha;
	}

	/**
	 * Method 'setFecha'
	 * 
	 * @param fecha
	 */
	public void setFecha(Date fecha)
	{
		this.fecha = fecha;
	}

	/**
	 * Method 'getUsuario'
	 * 
	 * @return String
	 */
	public String getUsuario()
	{
		return usuario;
	}

	/**
	 * Method 'setUsuario'
	 * 
	 * @param usuario
	 */
	public void setUsuario(String usuario)
	{
		this.usuario = usuario;
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
		
		if (!(_other instanceof LogError)) {
			return false;
		}
		
		final LogError _cast = (LogError) _other;
		if (idLog != _cast.idLog) {
			return false;
		}
		
		if (level == null ? _cast.level != level : !level.equals( _cast.level )) {
			return false;
		}
		
		if (logName == null ? _cast.logName != logName : !logName.equals( _cast.logName )) {
			return false;
		}
		
		if (mensage == null ? _cast.mensage != mensage : !mensage.equals( _cast.mensage )) {
			return false;
		}
		
		if (fecha == null ? _cast.fecha != fecha : !fecha.equals( _cast.fecha )) {
			return false;
		}
		
		if (usuario == null ? _cast.usuario != usuario : !usuario.equals( _cast.usuario )) {
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
		_hashCode = 29 * _hashCode + (int) (idLog ^ (idLog >>> 32));
		if (level != null) {
			_hashCode = 29 * _hashCode + level.hashCode();
		}
		
		if (logName != null) {
			_hashCode = 29 * _hashCode + logName.hashCode();
		}
		
		if (mensage != null) {
			_hashCode = 29 * _hashCode + mensage.hashCode();
		}
		
		if (fecha != null) {
			_hashCode = 29 * _hashCode + fecha.hashCode();
		}
		
		if (usuario != null) {
			_hashCode = 29 * _hashCode + usuario.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return LogErrorPk
	 */
	public LogErrorPk createPk()
	{
		return new LogErrorPk(idLog);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "co.edu.sena.model.dao.dto.LogError: " );
		ret.append( "idLog=" + idLog );
		ret.append( ", level=" + level );
		ret.append( ", logName=" + logName );
		ret.append( ", mensage=" + mensage );
		ret.append( ", fecha=" + fecha );
		ret.append( ", usuario=" + usuario );
		return ret.toString();
	}

}
