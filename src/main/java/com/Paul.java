package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Paul implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("age")
	private java.lang.Integer age;
	@org.kie.api.definition.type.Label("birthDate")
	private java.util.Date birthDate;

	@org.kie.api.definition.type.Label(value = "nationality")
	private java.lang.String nationality;

	public Paul() {
	}

	public java.lang.Integer getAge() {
		return this.age;
	}

	public void setAge(java.lang.Integer age) {
		this.age = age;
	}

	public java.util.Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(java.util.Date birthDate) {
		this.birthDate = birthDate;
	}

	public java.lang.String getNationality() {
		return this.nationality;
	}

	public void setNationality(java.lang.String nationality) {
		this.nationality = nationality;
	}

	public Paul(java.lang.Integer age, java.util.Date birthDate,
			java.lang.String nationality) {
		this.age = age;
		this.birthDate = birthDate;
		this.nationality = nationality;
	}

}