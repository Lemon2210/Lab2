
public final class Lab2_bt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhChuNhat hcn;
		hcn = new HinhChuNhat(10, 5);
		System.out.println(hcn);
	}
}
class HinhChuNhat{
	private double r;
	private double d;
	public HinhChuNhat() {
	}
	public HinhChuNhat(double r,double d) {
		this.r=r;
		this.d=d;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r=r;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d=d;
	}
	public double tinhCV() {
		return (d+r)*2;
	}
	public double tinhDT() {
		return d*r;
	}
	public String toString() {
		return "HinhChuNhat: r="+r+";d="+d+";CV="+tinhCV()+";DT="+tinhDT();
	}
} 
