package org.jfree.chart.plot;

import java.io.Serializable;

/**
 * A general purpose exception class for plot series.
 */
public class PlotException extends RuntimeException implements Serializable {

	/**
	 * For serialization.
	 */
	private static final long serialVersionUID = -3613032217135990089L;
	
    /**
     * Constructs a new plot exception.
     *
     * @param message  a message describing the exception.
     */
    public PlotException(String message) {
        super(message);
    }
}
