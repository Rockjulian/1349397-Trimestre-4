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
import co.edu.sena.controller.dao.RolDao;
import co.edu.sena.model.dao.dto.Rol;
import co.edu.sena.controller.dao.exceptions.RolDaoException;
import co.edu.sena.controller.factory.RolDaoFactory;

public class RolDaoSample
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
		// findWhereIdRolEquals("");
		// findWhereDescripcionEquals("");
		// findWhereEstadoEquals(0);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			RolDao _dao = getRolDao();
			Rol _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdRolEquals'
	 * 
	 * @param idRol
	 */
	public static void findWhereIdRolEquals(String idRol)
	{
		try {
			RolDao _dao = getRolDao();
			Rol _result[] = _dao.findWhereIdRolEquals(idRol);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereDescripcionEquals'
	 * 
	 * @param descripcion
	 */
	public static void findWhereDescripcionEquals(String descripcion)
	{
		try {
			RolDao _dao = getRolDao();
			Rol _result[] = _dao.findWhereDescripcionEquals(descripcion);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereEstadoEquals'
	 * 
	 * @param estado
	 */
	public static void findWhereEstadoEquals(short estado)
	{
		try {
			RolDao _dao = getRolDao();
			Rol _result[] = _dao.findWhereEstadoEquals(estado);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getRolDao'
	 * 
	 * @return RolDao
	 */
	public static RolDao getRolDao()
	{
		return RolDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Rol dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getIdRol() );
		buf.append( ", " );
		buf.append( dto.getDescripcion() );
		buf.append( ", " );
		buf.append( dto.getEstado() );
		System.out.println( buf.toString() );
	}

}
