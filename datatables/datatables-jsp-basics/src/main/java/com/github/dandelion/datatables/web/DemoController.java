package com.github.dandelion.datatables.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.dandelion.datatables.model.Person;
import com.github.dandelion.datatables.service.PersonService;

/**
 * Controllers for the all demo examples.
 * 
 * @author Thibault Duchateau
 */
@Controller
@RequestMapping(method = RequestMethod.GET)
public class DemoController {

	@Autowired
	private PersonService personService;

	/**
	 * <p>
	 * This model attribute populates all the tables that use client-side
	 * processing, i.e. all DOM examples and also AJAX source.
	 * 
	 * @return the entire set of persons.
	 */
	@ModelAttribute("persons")
	public List<Person> populateTable() {
		return personService.findLimited(100);
	}

	@RequestMapping(value = "/")
	public String goToIndex(HttpServletRequest request) {
		return "index";
	}
	
	@RequestMapping(value = "/sorting/{page}")
	public String goToSortingExample(@PathVariable String page) {
		return "sorting." + page;
	}
	
	@RequestMapping(value = "/filtering/{page}")
	public String goToFilteringExample(@PathVariable String page) {
		return "filtering." + page;
	}
	
	@RequestMapping(value = "/paging/{page}")
	public String goToPagingExample(@PathVariable String page) {
		return "paging." + page;
	}
	
	@RequestMapping(value = "/scrolling/{page}")
	public String goToScrollingExample(@PathVariable String page) {
		return "scrolling." + page;
	}
	
	@RequestMapping(value = "/column-rendering/{page}")
	public String goToColumnRenderingExample(@PathVariable String page) {
		return "column-rendering." + page;
	}
	
	@RequestMapping(value = "/multiple-tables")
	public String goToMultipleTablesExample() {
		return "multiple-tables";
	}
	
	@RequestMapping(value = "/dom-positioning")
	public String goToDomPositioningExample() {
		return "dom-positioning";
	}
	
	@RequestMapping(value = "/styling")
	public String goToStylingExample() {
		return "styling";
	}
}