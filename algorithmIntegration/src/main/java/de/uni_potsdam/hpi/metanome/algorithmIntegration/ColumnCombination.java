package de.uni_potsdam.hpi.metanome.algorithmIntegration;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Represents column combinations.
 */
public class ColumnCombination {
	
	protected Set<String> columnCombination;
	
	/**
	 * Store string identifiers for columns to form a column combination.
	 * 
	 * @param columnIdentifier
	 */
	public ColumnCombination(String... columnIdentifier) {
		columnCombination = new HashSet<String>(Arrays.asList(columnIdentifier));
	}
}
