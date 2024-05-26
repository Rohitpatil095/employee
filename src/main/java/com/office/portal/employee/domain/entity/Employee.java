package com.office.portal.employee.domain.entity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long employee_Id;
	
//	@NotNull
	String empRef;
	
	@NonNull
	String employee_Name;
//	String employee_ref;
	String employee_Address;
	
	@NonNull
//	@Pattern()
	Long contact;
	Long sec_Contact;
	String blood_Group;
	String passport_No;
	String pan_No;
	String aadhar_No;
	String supervisor_Name;
	Long supervisor_EmpId;
	String supervisor_Email;
	
	@PrePersist
	public void prePersist ()
	{
		if(employee_Id!=null && employee_Name!=null)
		{
			empRef=employee_Name.replace(" ", "-")+"_"+employee_Id;
		}
	}
	
	public Long getEmployee_Id() {
		return employee_Id;
	}
	public void setEmployee_Id(Long employee_Id) {
		this.employee_Id = employee_Id;
	}
	public String getEmployee_Name() {
		return employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}
//	public String getEmployee_ref() {
//		return employee_ref;
//	}
//	public void setEmployee_ref(String employee_ref) {
//		this.employee_ref = employee_ref;
//	}
	public String getEmployee_Address() {
		return employee_Address;
	}
	public void setEmployee_Address(String employee_Address) {
		this.employee_Address = employee_Address;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public Long getSec_Contact() {
		return sec_Contact;
	}
	public void setSec_Contact(Long sec_Contact) {
		this.sec_Contact = sec_Contact;
	}
	public String getBlood_Group() {
		return blood_Group;
	}
	public void setBlood_Group(String blood_Group) {
		this.blood_Group = blood_Group;
	}
	public String getPassport_No() {
		return passport_No;
	}
	public void setPassport_No(String passport_No) {
		this.passport_No = passport_No;
	}
	public String getPan_No() {
		return pan_No;
	}
	public void setPan_No(String pan_No) {
		this.pan_No = pan_No;
	}
	public String getAadhar_No() {
		return aadhar_No;
	}
	public void setAadhar_No(String aadhar_No) {
		this.aadhar_No = aadhar_No;
	}
	public String getSupervisor_Name() {
		return supervisor_Name;
	}
	public void setSupervisor_Name(String supervisor_Name) {
		this.supervisor_Name = supervisor_Name;
	}
	public Long getSupervisor_EmpId() {
		return supervisor_EmpId;
	}
	public void setSupervisor_EmpId(Long supervisor_EmpId) {
		this.supervisor_EmpId = supervisor_EmpId;
	}
	public String getSupervisor_Email() {
		return supervisor_Email;
	}
	public void setSupervisor_Email(String supervisor_Email) {
		this.supervisor_Email = supervisor_Email;
	}
	public String getEmpRef() {
		return empRef;
	}
	public void setEmpRef(String empRef) {
		this.empRef = empRef;
	}

	@Override
	public String toString() {
		return "Employee [employee_Id=" + employee_Id + ", empRef=" + empRef + ", employee_Name=" + employee_Name
				+ ", employee_Address=" + employee_Address + ", contact=" + contact + ", sec_Contact=" + sec_Contact
				+ ", blood_Group=" + blood_Group + ", passport_No=" + passport_No + ", pan_No=" + pan_No
				+ ", aadhar_No=" + aadhar_No + ", supervisor_Name=" + supervisor_Name + ", supervisor_EmpId="
				+ supervisor_EmpId + ", supervisor_Email=" + supervisor_Email + "]";
	}
	
	
	
}
