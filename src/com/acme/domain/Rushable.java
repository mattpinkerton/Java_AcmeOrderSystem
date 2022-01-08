package com.acme.domain;

import com.acme.utils.MyDate;

/**
*
* @author mattpinkerton
*/
public interface Rushable {

	public abstract boolean isRushable(MyDate orderDate, double amount);

}