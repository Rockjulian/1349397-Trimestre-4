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
import co.edu.sena.controller.dao.InstructorFichaDao;
import co.edu.sena.model.dao.dto.InstructorFicha;
import co.edu.sena.controller.dao.exceptions.InstructorFichaDaoException;
import co.edu.sena.controller.factory.InstructorFichaDaoFactory;

public class InstructorFichaDaoSample
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
		// findByCliente("", "");
		// findByFicha("");
		// findWhereTipoDocumentoEquals("");
		// findWhereNumeroDocumentoEquals("");
		// findWhereFichaEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			InstructorFichaDao _dao = getInstructorFichaDao();
			InstructorFicha _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByCliente'
	 * 
	 * @param tipoDocumento
	 * @param numeroDocumento
	 */
	public static void findByCliente(String tipoDocumento, String numeroDocumento)
	{
		try {
			InstructorFichaDao _dao = getInstructorFichaDao();
			InstructorFicha _result[] = _dao.findByCliente(tipoDocumento, numeroDocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByFicha'
	 * 
	 * @param ficha
	 */
	public static void findByFicha(String ficha)
	{
		try {
			InstructorFichaDao _dao = getInstructorFichaDao();
			InstructorFicha _result[] = _dao.findByFicha(ficha);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereTipoDocumentoEquals'
	 * 
	 * @param tipoDocumento
	 */
	public static void findWhereTipoDocumentoEquals(String tipoDocumento)
	{
		try {
			InstructorFichaDao _dao = getInstructorFichaDao();
			InstructorFicha _result[] = _dao.findWhereTipoDocumentoEquals(tipoDocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNumeroDocumentoEquals'
	 * 
	 * @param numeroDocumento
	 */
	public static void findWhereNumeroDocumentoEquals(String numeroDocumento)
	{
		try {
			InstructorFichaDao _dao = getInstructorFichaDao();
			InstructorFicha _result[] = _dao.findWhereNumeroDocumentoEquals(numeroDocumento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereFichaEquals'
	 * 
	 * @param ficha
	 */
	public static void findWhereFichaEquals(String ficha)
	{
		try {
			InstructorFichaDao _dao = getInstructorFichaDao();
			InstructorFicha _result[] = _dao.findWhereFichaEquals(ficha);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getInstructorFichaDao'
	 * 
	 * @return InstructorFichaDao
	 */
	public static InstructorFichaDao getInstructorFichaDao()
	{
		return InstructorFichaDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(InstructorFicha dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getTipoDocumento() );
		buf.append( ", " );
		buf.append( dto.getNumeroDocumento() );
		buf.append( ", " );
		buf.append( dto.getFicha() );
		System.out.println( buf.toString() );
	}

}
