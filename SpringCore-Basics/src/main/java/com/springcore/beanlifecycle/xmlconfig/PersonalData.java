package com.springcore.beanlifecycle.xmlconfig;

public class PersonalData {

	private int pid;
	private String pname;
	private String paddress;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	public void intilizeBean() {
		System.out.println("intilizeBean()..!!! Method called inside persondata");
	}

	public void destroyBean() {
		System.out.println("destroyBean()..!!! Method called inside persondata");

	}

	@Override
	public String toString() {
		return "PersonalData [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + "]";
	}

}
