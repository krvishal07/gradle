package com.basic.langapp;

import org.junit.jupiter.api.Test;

import java.io.*;

public class SayHelloTest {
	
	@Test
	public void testSayHello() throws IOException {
		SayHello.main(new String[] {"Vishal"});
	}
}