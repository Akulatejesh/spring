package com.project.demo.entities;
 
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String username;
    private String password;
    @OneToOne(mappedBy = "patient", cascade = CascadeType.ALL)
    private PatientDetails patientDetails;
 
    
    public PatientDetails getPatientDetails() {
		return patientDetails;
	}
	public void setPatientDetails(PatientDetails patientDetails) {
		this.patientDetails = patientDetails;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}