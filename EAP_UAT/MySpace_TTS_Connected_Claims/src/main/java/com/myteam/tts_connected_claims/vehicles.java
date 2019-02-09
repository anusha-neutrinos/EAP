package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class vehicles implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("description")
	private java.lang.String description;

	@org.kie.api.definition.type.Label("make")
	private java.lang.String make;

	@org.kie.api.definition.type.Label("model")
	private java.lang.String model;

	@org.kie.api.definition.type.Label("registrationNumber")
	private java.lang.String registrationNumber;

	@org.kie.api.definition.type.Label("year")
	private java.lang.String year;

	@org.kie.api.definition.type.Label("regularDriver")
	private java.lang.String regularDriver;

	@org.kie.api.definition.type.Label(value = "riskItemSequenceNumber")
	private java.lang.String riskItemSequenceNumber;

	public vehicles() {
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getMake() {
		return this.make;
	}

	public void setMake(java.lang.String make) {
		this.make = make;
	}

	public java.lang.String getModel() {
		return this.model;
	}

	public void setModel(java.lang.String model) {
		this.model = model;
	}

	public java.lang.String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(java.lang.String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public java.lang.String getYear() {
		return this.year;
	}

	public void setYear(java.lang.String year) {
		this.year = year;
	}

	public java.lang.String getRegularDriver() {
		return this.regularDriver;
	}

	public void setRegularDriver(java.lang.String regularDriver) {
		this.regularDriver = regularDriver;
	}

	public java.lang.String getRiskItemSequenceNumber() {
		return this.riskItemSequenceNumber;
	}

	public void setRiskItemSequenceNumber(
			java.lang.String riskItemSequenceNumber) {
		this.riskItemSequenceNumber = riskItemSequenceNumber;
	}

	public vehicles(java.lang.String description, java.lang.String make,
			java.lang.String model, java.lang.String registrationNumber,
			java.lang.String year, java.lang.String regularDriver,
			java.lang.String riskItemSequenceNumber) {
		this.description = description;
		this.make = make;
		this.model = model;
		this.registrationNumber = registrationNumber;
		this.year = year;
		this.regularDriver = regularDriver;
		this.riskItemSequenceNumber = riskItemSequenceNumber;
	}

}