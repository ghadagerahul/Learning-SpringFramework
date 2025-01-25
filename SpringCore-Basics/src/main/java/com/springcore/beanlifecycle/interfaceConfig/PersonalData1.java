package com.springcore.beanlifecycle.interfaceConfig;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PersonalData1 implements InitializingBean, DisposableBean {

	private int pid;

	private String pName;
	private String pAddress;

	@Override
	public String toString() {
		return "PersonalData1 [pid=" + pid + ", pName=" + pName + ", pAddress=" + pAddress + "]";
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpAddress() {
		return pAddress;
	}

	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() Method called from PersonalData...!!!");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() Method called from PersonalData...!!!");

	}

}
