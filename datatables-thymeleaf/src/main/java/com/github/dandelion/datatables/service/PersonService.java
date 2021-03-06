package com.github.dandelion.datatables.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.dandelion.datatables.core.ajax.DataSet;
import com.github.dandelion.datatables.core.ajax.DatatablesCriterias;
import com.github.dandelion.datatables.entity.Person;

/**
 * Service that manages the persons.
 * 
 * @author tduchateau
 */
@Service
public interface PersonService {

	/**
	 * @return the complete list of persons.
	 */
	public List<Person> findAll();

	/**
	 * @param maxResult
	 *            Max number of persons.
	 * @return a maxResult limited list of persons.
	 */
	public List<Person> findLimited(int maxResult);

	/**
	 * <p>
	 * Query used to populate the DataTable that displays the list of persons.
	 * 
	 * @param criterias
	 *            The DataTables criterias used to filter the persons.
	 *            (maxResult, filtering, paging, ...)
	 * @return a bean that wraps all the needed information by DataTables to
	 *         redraw the table with the data.
	 */
	public DataSet<Person> findPersonsWithDatatablesCriterias(DatatablesCriterias criterias);
}