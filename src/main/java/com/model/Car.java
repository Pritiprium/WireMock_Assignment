package com.model;

public class Car {

	private String make;
	private String model;
	private String vin;

	private Metadata metadata;
	private Perdayrent perdayrent;
	private Metrics metrics;	

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public Perdayrent getPerdayrent() {
		return perdayrent;
	}

	public void setPerdayrent(Perdayrent perdayrent) {
		this.perdayrent = perdayrent;
	}

	public Metrics getMetrics() {
		return metrics;
	}

	public void setMetrics(Metrics metrics) {
		this.metrics = metrics;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", vin=" + vin + ", metadata=" + metadata + ", perdayrent="
				+ perdayrent + ", metrics=" + metrics + ", getMake()=" + getMake() + ", getModel()=" + getModel()
				+ ", getVin()=" + getVin() + ", getMetadata()=" + getMetadata() + ", getPerdayrent()=" + getPerdayrent()
				+ ", getMetrics()=" + getMetrics() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	

}
