package com.mitrais.java8.finaltest.vernando.Final_Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WordTest {
		@Test
		public void generateRandomNamesTest() throws Exception {
			assertEquals(WordUtils.generateRandomNames(10), 10);
		}
		@Test
		public void showAllRandomNamesTest() throws Exception {
			assertTrue(WordUtils.showAllRandomNames() > 0);
		}
		@Test
		public void mostLongNameTest() throws Exception {
			assertNotNull(WordUtils.mostLongName());
		}
		@Test
		public void mostShortNameTest() throws Exception {
			assertNotNull(WordUtils.mostShortName());
		}
		@Test
		public void nameContainsTest() throws Exception {
			assertTrue(WordUtils.nameContains("")>0);
		}
		@Test
		public void makeExcitedTest() throws Exception {
			assertTrue(WordUtils.makeExcited()>0);
		}
		@Test
		public void removeContainsTest() throws Exception {
			assertNotNull(WordUtils.removeContains("a"));
		}
	}
