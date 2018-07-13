package com.siri.collection;

public class SiriEmployee implements Comparable<SiriEmployee> {
	
	private Integer empID;
	private String fname;
	private String emailID;
	private Integer rank;
	
	
	public SiriEmployee(Integer empID, String fname, String emailID, Integer rank) {
		super();
		this.empID = empID;
		this.fname = fname;
		this.emailID = emailID;
		this.rank = rank;
	}
	
	
	public Integer getEmpID() {
		return empID;
	}
	public void setEmpID(Integer empID) {
		this.empID = empID;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}


	@Override
	public String toString() {
		return "SiriEmployee [empID=" + empID + ", fname=" + fname + ", emailID=" + emailID + ", rank=" + rank + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empID == null) ? 0 : empID.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof SiriEmployee) {
			SiriEmployee siriObj = (SiriEmployee) obj;
			if(siriObj.getEmpID() == this.getEmpID()) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}


	@Override
	public int compareTo(SiriEmployee o) {
		if(this.getRank() > o.getRank()) {
			return 1;
		} else if(this.getRank() == o.getRank()) {
			return 0;
		} else {
			return -1;
		}
			
	}
	
	
	
	

}
