package Bean;

/*
 * Developed By Rohit Pisipaty (G01084064)
 */


import java.io.Serializable;

public class DataBean implements Serializable {

	
	private Double mean;
	private Double stdDev;
	
	public DataBean() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the mean
	 */
	public Double getMean() {
		return mean;
	}

	/**
	 * @param mean the mean to set
	 */
	public void setMean(Double mean) {
		this.mean = mean;
	}

	/**
	 * @return the stdDev
	 */
	public Double getStdDev() {
		return stdDev;
	}

	/**
	 * @param stdDev the stdDev to set
	 */
	public void setStdDev(Double stdDev) {
		this.stdDev = stdDev;
	}

}


