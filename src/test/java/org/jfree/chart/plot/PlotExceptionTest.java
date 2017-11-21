package org.jfree.chart.plot;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Tests for the {@link PlotException} class.
 */
public class PlotExceptionTest {

    /**
     * Confirm that the exception displays the message given as parameter.
     */
	@Test
	public void testPlotException() {
		PlotException plotException = new PlotException("test message");
		assertEquals("test message", plotException.getMessage());
	}
}
