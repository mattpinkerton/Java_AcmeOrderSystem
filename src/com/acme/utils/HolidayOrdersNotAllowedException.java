package com.acme.utils;

/**
*
* @author mattpinkerton
*/
public class HolidayOrdersNotAllowedException extends Exception {

	public HolidayOrdersNotAllowedException(MyDate date) {
		super("Orders are not allowed to be created on: " + date);
	}

}
