package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Education {

	private List<String> subjects;

	private Set<String> departments;

	private Map<String, Integer> feesForCourses;

	private Properties props;

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public Set<String> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<String> departments) {
		this.departments = departments;
	}

	public Map<String, Integer> getFeesForCourses() {
		return feesForCourses;
	}

	public void setFeesForCourses(Map<String, Integer> feesForCourses) {
		this.feesForCourses = feesForCourses;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "Education [subjects=" + subjects + ", departments=" + departments + ", feesForCourses=" + feesForCourses
				+ ", props=" + props + "]";
	}

}
