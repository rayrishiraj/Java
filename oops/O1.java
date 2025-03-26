package oops;

public class O1 { //Calculator_Datatype_Class
	private double num1;
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	private double num2;
	private double result;
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	O1 (double num1, double num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	public static O1 add(O1 o) {
		o.setResult(o.getNum1() + o.getNum2());
		return o;
 	}
	public static O1 mul(O1 o) {
		o.setResult(o.getResult() * 2);
		return o;
 	}
}
