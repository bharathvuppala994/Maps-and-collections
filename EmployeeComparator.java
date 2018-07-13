package com.siri.collection;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<SiriEmployee> {

	@Override
	public int compare(SiriEmployee o1, SiriEmployee o2) {
		if(o1.getEmpID() > o2.getEmpID()) {
			return 1;
		} else if(o1.getEmpID() == o2.getEmpID()) {
			return 0;
		} else {
			return -1;
		}
	}

}
