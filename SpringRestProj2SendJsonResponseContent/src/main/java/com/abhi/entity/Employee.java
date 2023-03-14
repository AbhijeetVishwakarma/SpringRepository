package com.abhi.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Employee implements Serializable {
	public Employee(String name, Integer empID, String[] favColors, List<String> nickNames, Set<Long> phones,
			Map<String, Long> idDetails, boolean vaccinated, LocalDateTime dob, Company company) {
		super();
		this.name = name;
		this.empID = empID;
		this.favColors = favColors;
		this.nickNames = nickNames;
		this.phones = phones;
		this.idDetails = idDetails;
		this.vaccinated = vaccinated;
		this.dob = dob;
		this.company = company;
	}
	private static final long serialVersionUID = 638192899031650078L;
	private String name;
	private Integer empID;
	private String[] favColors;
	private List<String> nickNames;
	private Set<Long> phones;
	private Map<String, Long> idDetails;
	private boolean vaccinated;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime dob;
	private Company company;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmpID() {
		return empID;
	}
	public void setEmpID(Integer empID) {
		this.empID = empID;
	}
	public String[] getFavColors() {
		return favColors;
	}
	public void setFavColors(String[] favColors) {
		this.favColors = favColors;
	}
	public List<String> getNickNames() {
		return nickNames;
	}
	public void setNickNames(List<String> nickNames) {
		this.nickNames = nickNames;
	}
	public Set<Long> getPhones() {
		return phones;
	}
	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}
	public Map<String, Long> getIdDetails() {
		return idDetails;
	}
	public void setIdDetails(Map<String, Long> idDetails) {
		this.idDetails = idDetails;
	}
	public boolean isVaccinated() {
		return vaccinated;
	}
	public void setVaccinated(boolean vaccinated) {
		this.vaccinated = vaccinated;
	}
	public LocalDateTime getDob() {
		return dob;
	}
	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empID=" + empID + ", favColors=" + Arrays.toString(favColors)
				+ ", nickNames=" + nickNames + ", phones=" + phones + ", idDetails=" + idDetails + ", vaccinated="
				+ vaccinated + ", dob=" + dob + ", company=" + company + "]";
	}

}
