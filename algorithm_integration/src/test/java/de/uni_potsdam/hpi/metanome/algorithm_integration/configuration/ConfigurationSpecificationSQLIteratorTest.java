package de.uni_potsdam.hpi.metanome.algorithm_integration.configuration;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for {@link ConfigurationSpecificationSQLIterator}
 */
public class ConfigurationSpecificationSQLIteratorTest {

	/**
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		
	}

	/**
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		
	}

	/**
	 * The identifier should be set in the constructor and be retrievable through getIdentifier.
	 */
	@Test
	public void testGetIdentifier() {
		// Setup
		// Expected values
		String expectedIdentifier = "parameter1";
		ConfigurationSpecificationSQLIterator configSpec = new ConfigurationSpecificationSQLIterator(expectedIdentifier);
		
		// Execute functionality
		String actualIdentifier = configSpec.getIdentifier();
		
		// Check result
		assertEquals(expectedIdentifier, actualIdentifier);
	}
}