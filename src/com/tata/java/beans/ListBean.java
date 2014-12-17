/**
 * Copyright @ Paarmita Software and Consulting Pvt Ltd.
 * All Rights are reserved to Paarmita.
 * http://www.paarmita.com
 */
package com.tata.java.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tatarao voleti
 * @date   Dec 17, 2014
 * 
 */
public class ListBean<T> {

	private List<T> customList = new ArrayList<T>();

	public List<T> getCustomList() {
		return customList;
	}

	public void setCustomList(List<T> customList) {
		this.customList = customList;
	}
	
	
}
