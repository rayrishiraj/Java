package oops_relationship;

public class OR1 { //Association - Example Car
//	OR2 o = new OR2(); // 
	private OR2 o;
	public void setO(OR2 o) {
		this.o = o;
	}

	public OR2 getO() {
		o = new OR2();
		return o;
	}
	
}
