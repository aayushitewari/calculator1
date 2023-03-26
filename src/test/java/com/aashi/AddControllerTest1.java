package com.aashi;

import static org.junit.Assert.*;

import org.junit.Test;

import com.aashi.service.AddService;

public class AddControllerTest1 {

	@Test //Annotation for adding test cases
	public void test1() {
		AddService as=new AddService();
		int actual=as.op(5,4,"+");
		int expected=9;
		assertEquals(expected,actual);
	}
@Test
public void test2() {
	AddService as=new AddService();
	int actual=as.op(8,7,"-");
	int expected=1;
	assertEquals(expected,actual);
	
	}


}


