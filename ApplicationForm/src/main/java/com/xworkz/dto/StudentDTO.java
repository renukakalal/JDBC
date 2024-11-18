package com.xworkz.dto;

public class StudentDTO{
	    private String name;
		private String email;
		private long phoneNumber;
		private String graduation;
		private String branch;
		private int cgpa;
		private String skills;
		private String address;
		
		public StudentDTO() {
			super();
		}
       public StudentDTO(String name, String email, long phoneNumber, String graduation, String branch, int cGPA,
				String skills, String address) {
			super();
			this.name = name;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.graduation = graduation;
			this.branch = branch;
			this.cgpa = cgpa;
			this.skills = skills;
			this.address = address;
		}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((branch == null) ? 0 : branch.hashCode());
		result = prime * result + cgpa;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((graduation == null) ? 0 : graduation.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
		result = prime * result + ((skills == null) ? 0 : skills.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof StudentDTO))
			return false;
		StudentDTO other = (StudentDTO) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (branch == null) {
			if (other.branch != null)
				return false;
		} else if (!branch.equals(other.branch))
			return false;
		if (cgpa != other.cgpa)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (graduation == null) {
			if (other.graduation != null)
				return false;
		} else if (!graduation.equals(other.graduation))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		if (skills == null) {
			if (other.skills != null)
				return false;
		} else if (!skills.equals(other.skills))
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getGraduation() {
		return graduation;
	}
	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getCgpa() {
		return cgpa;
	}
	public void setCgpa(int cgpa) {
		this.cgpa = cgpa;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
       
       
      
      
      
      
      
   
		

	}


