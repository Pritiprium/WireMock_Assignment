package com.model;

public class Metrics {

	private Float yoymaintenancecost;
	private Float depreciation;
	private Rentalcount rentalcount;

	public Float getYoymaintenancecost() {
		return yoymaintenancecost;
	}

	public void setYoymaintenancecost(Float yoymaintenancecost) {
		this.yoymaintenancecost = yoymaintenancecost;
	}

	public Float getDepreciation() {
		return depreciation;
	}

	public void setDepreciation(Float depreciation) {
		this.depreciation = depreciation;
	}

	public Rentalcount getRentalcount() {
		return rentalcount;
	}

	public void setRentalcount(Rentalcount rentalcount) {
		this.rentalcount = rentalcount;
	}

	@Override
	public String toString() {
		return "Metrics [yoymaintenancecost=" + yoymaintenancecost + ", depreciation=" + depreciation + ", rentalcount="
				+ rentalcount + "]";
	}
	
	

}
