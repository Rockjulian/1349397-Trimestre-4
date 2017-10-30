/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package co.edu.sena.pruebas;

import java.math.*;
import java.util.Date;
import java.util.Collection;
import co.edu.sena.controller.dao.LogAuditoriaDao;
import co.edu.sena.model.dao.dto.LogAuditoria;
import co.edu.sena.controller.dao.exceptions.LogAuditoriaDaoException;
import co.edu.sena.controller.factory.LogAuditoriaDaoFactory;

public class LogAuditoriaDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findAll();
		// findWhereIdLogEquals(0);
		// findWhereLevelEquals("");
		// findWhereLogNameEquals("");
		// findWhereMensageEquals("");
		// findWhereFechaEquals(null);
		// findWhereUsuarioEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			LogAuditoriaDao _dao = getLogAuditoriaDao();
			LogAuditoria _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdLogEquals'
	 * 
	 * @param idLog
	 */
	public static void findWhereIdLogEquals(long idLog)
	{
		try {
			LogAuditoriaDao _dao = getLogAuditoriaDao();
			LogAuditoria _result[] = _dao.findWhereIdLogEquals(idLog);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereLevelEquals'
	 * 
	 * @param level
	 */
	public static void findWhereLevelEquals(String level)
	{
		try {
			LogAuditoriaDao _dao = getLogAuditoriaDao();
			LogAuditoria _result[] = _dao.findWhereLevelEquals(level);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereLogNameEquals'
	 * 
	 * @param logName
	 */
	public static void findWhereLogNameEquals(String logName)
	{
		try {
			LogAuditoriaDao _dao = getLogAuditoriaDao();
			LogAuditoria _result[] = _dao.findWhereLogNameEquals(logName);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereMensageEquals'
	 * 
	 * @param mensage
	 */
	public static void findWhereMensageEquals(String mensage)
	{
		try {
			LogAuditoriaDao _dao = getLogAuditoriaDao();
			LogAuditoria _result[] = _dao.findWhereMensageEquals(mensage);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereFechaEquals'
	 * 
	 * @param fecha
	 */
	public static void findWhereFechaEquals(Date fecha)
	{
		try {
			LogAuditoriaDao _dao = getLogAuditoriaDao();
			LogAuditoria _result[] = _dao.findWhereFechaEquals(fecha);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereUsuarioEquals'
	 * 
	 * @param usuario
	 */
	public static void findWhereUsuarioEquals(String usuario)
	{
		try {
			LogAuditoriaDao _dao = getLogAuditoriaDao();
			LogAuditoria _result[] = _dao.findWhereUsuarioEquals(usuario);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getLogAuditoriaDao'
	 * 
	 * @return LogAuditoriaDao
	 */
	public static LogAuditoriaDao getLogAuditoriaDao()
	{
		return LogAuditoriaDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(LogAuditoria dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getIdLog() );
		buf.append( ", " );
		buf.append( dto.getLevel() );
		buf.append( ", " );
		buf.append( dto.getLogName() );
		buf.append( ", " );
		buf.append( dto.getMensage() );
		buf.append( ", " );
		buf.append( dto.getFecha() );
		buf.append( ", " );
		buf.append( dto.getUsuario() );
		System.out.println( buf.toString() );
	}

}
