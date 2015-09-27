package org.henmix.sapmle01;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {
	@Test
	public void helloTest() {
		App app = new App();
		String actual = app.hello("hoge");
		String expected = "Hello, hoge.";

		assertThat(actual, is(expected));
	}

}