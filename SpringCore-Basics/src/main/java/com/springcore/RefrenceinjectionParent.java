package com.springcore;

public class RefrenceinjectionParent {

	private int id;
	private ReferenceInjectionChild child;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ReferenceInjectionChild getChild() {
		return child;
	}

	public void setChild(ReferenceInjectionChild child) {
		this.child = child;
	}

	@Override
	public String toString() {
		return "RefrenceinjectionParent [id=" + id + ", child=" + child + "]";
	}

	public RefrenceinjectionParent(int id, ReferenceInjectionChild child) {
		super();
		this.id = id;
		this.child = child;
	}

	public RefrenceinjectionParent() {
		super();
		// TODO Auto-generated constructor stub
	}

}
