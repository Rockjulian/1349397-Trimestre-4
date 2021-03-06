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
import co.edu.sena.controller.dao.RespuestaGrupoDao;
import co.edu.sena.model.dao.dto.RespuestaGrupo;
import co.edu.sena.controller.dao.exceptions.RespuestaGrupoDaoException;
import co.edu.sena.controller.factory.RespuestaGrupoDaoFactory;

public class RespuestaGrupoDaoSample
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
		
		 findAll();
		// findByGrupoProyecto("", 0);
		// findByItemChecker("", 0);
		// findByValoracion("");
		// findWhereFichaEquals("");
		// findWhereGrupoCodigoEquals(0);
		// findWhereListaChequeoEquals("");
		// findWhereIdItemEquals(0);
		// findWhereValoracionValorEquals("");
		// findWhereFechaEquals(null);
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			RespuestaGrupoDao _dao = getRespuestaGrupoDao();
			RespuestaGrupo _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByGrupoProyecto'
	 * 
	 * @param ficha
	 * @param grupoCodigo
	 */
	public static void findByGrupoProyecto(String ficha, int grupoCodigo)
	{
		try {
			RespuestaGrupoDao _dao = getRespuestaGrupoDao();
			RespuestaGrupo _result[] = _dao.findByGrupoProyecto(ficha, grupoCodigo);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByItemChecker'
	 * 
	 * @param listaChequeo
	 * @param idItem
	 */
	public static void findByItemChecker(String listaChequeo, int idItem)
	{
		try {
			RespuestaGrupoDao _dao = getRespuestaGrupoDao();
			RespuestaGrupo _result[] = _dao.findByItemChecker(listaChequeo, idItem);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findByValoracion'
	 * 
	 * @param valoracionValor
	 */
	public static void findByValoracion(String valoracionValor)
	{
		try {
			RespuestaGrupoDao _dao = getRespuestaGrupoDao();
			RespuestaGrupo _result[] = _dao.findByValoracion(valoracionValor);
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
			RespuestaGrupoDao _dao = getRespuestaGrupoDao();
			RespuestaGrupo _result[] = _dao.findWhereFichaEquals(ficha);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereGrupoCodigoEquals'
	 * 
	 * @param grupoCodigo
	 */
	public static void findWhereGrupoCodigoEquals(int grupoCodigo)
	{
		try {
			RespuestaGrupoDao _dao = getRespuestaGrupoDao();
			RespuestaGrupo _result[] = _dao.findWhereGrupoCodigoEquals(grupoCodigo);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereListaChequeoEquals'
	 * 
	 * @param listaChequeo
	 */
	public static void findWhereListaChequeoEquals(String listaChequeo)
	{
		try {
			RespuestaGrupoDao _dao = getRespuestaGrupoDao();
			RespuestaGrupo _result[] = _dao.findWhereListaChequeoEquals(listaChequeo);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdItemEquals'
	 * 
	 * @param idItem
	 */
	public static void findWhereIdItemEquals(int idItem)
	{
		try {
			RespuestaGrupoDao _dao = getRespuestaGrupoDao();
			RespuestaGrupo _result[] = _dao.findWhereIdItemEquals(idItem);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereValoracionValorEquals'
	 * 
	 * @param valoracionValor
	 */
	public static void findWhereValoracionValorEquals(String valoracionValor)
	{
		try {
			RespuestaGrupoDao _dao = getRespuestaGrupoDao();
			RespuestaGrupo _result[] = _dao.findWhereValoracionValorEquals(valoracionValor);
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
			RespuestaGrupoDao _dao = getRespuestaGrupoDao();
			RespuestaGrupo _result[] = _dao.findWhereFechaEquals(fecha);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getRespuestaGrupoDao'
	 * 
	 * @return RespuestaGrupoDao
	 */
	public static RespuestaGrupoDao getRespuestaGrupoDao()
	{
		return RespuestaGrupoDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(RespuestaGrupo dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getFicha() );
		buf.append( ", " );
		buf.append( dto.getGrupoCodigo() );
		buf.append( ", " );
		buf.append( dto.getListaChequeo() );
		buf.append( ", " );
		buf.append( dto.getIdItem() );
		buf.append( ", " );
		buf.append( dto.getValoracionValor() );
		buf.append( ", " );
		buf.append( dto.getFecha() );
		System.out.println( buf.toString() );
	}

}
