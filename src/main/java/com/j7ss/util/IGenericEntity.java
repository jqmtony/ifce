/*
 * @version     1.0.0
 * @author      Edivando J. Alves
 * @contact     edivando@j7ss.com ( http://www.j7ss.com )
 * 
 * @copyright  	Copyright 2010 - 2016 J7 Smart Solutions, all rights reserved.
 * 
 */
package com.j7ss.util;

import java.io.Serializable;

/**
 * 
 * @author Edivando Alves
 * @date  10/02/2016
 * 
 */
public interface IGenericEntity<T> extends Serializable{

	boolean isNew();
	
	T save() throws DAOException;
	
	boolean remove() throws DAOException;
}
