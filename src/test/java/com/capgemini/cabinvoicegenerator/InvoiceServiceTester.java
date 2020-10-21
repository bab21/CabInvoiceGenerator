package com.capgemini.cabinvoicegenerator;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTester {

	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
		double distance=2.0;
		int time=5;
		double fare=invoiceGenerator.calculateFare(distance,time);
		assertEquals(25,fare,0.0);
	}

}
