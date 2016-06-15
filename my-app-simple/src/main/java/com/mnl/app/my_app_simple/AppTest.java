package com.mnl.app.my_app_simple;

import junit.framework.TestCase;

public class AppTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testAdd() {
		App app = new App();
		assertEquals(2, app.add(1, 1));
	}

	public void testMinus() {
		App app = new App();
		assertEquals(25, app.minus(30, 5));
	}

	public void testDivide() {
		fail("Not yet implemented");
	}

	public void testMultiply() {
		fail("Not yet implemented");
	}

}
