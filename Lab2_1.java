
public class Lab2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhTron ht;
		ht = new HinhTron(10);
		System.out.println(ht);
	}
}
class HinhTron{
	private double r;
	public HinhTron() {
	}
	public HinhTron(double r) {
		this.r=r;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r=r;
	}
	public double tinhCV() {
		return 2*Math.PI*r;
	}
	public double tinhDT() {
		return r*r*Math.PI;
	}
	public String toString() {
		return "HinhTron: r="+r+";CV="+tinhCV()+"\tDT="+tinhDT();
	}
}
