import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Lab2_bt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<NhanVien> nv = new ArrayList<>();
		nv.add(new NhanVien ("Van A", 22, 220));
		 nv.add(new NhanVien ("Thanh B", 12, 150));
		 nv.add(new NhanVien("Truong C", 6, 200));
		 nv.add(new NhanVien("Hung D", 34, 300));
		 for (int i=0; i<nv.size(); i++)
			 System.out.println (nv.get(i));
	}

}
class NhanVien{
	private double ngaycong;
	private String hoten;
	private double luongcb;
	public NhanVien() {}
	public NhanVien (String hoten, double ngaycong, double luongcb) {
		this.ngaycong=ngaycong;
		this.hoten=hoten;
		this.luongcb= luongcb;
	}
	public double getNgayCong() {
		return ngaycong;
	}
	public void setMssv (double ngaycong) {
		this.ngaycong=ngaycong;
	}
	public String getHoten () {
		return hoten;
	}
	public void setHoten (String hoten) {
		this.hoten=hoten;
	}
	public double getLuongCB() {
		return luongcb;
	}
	
	public void setLuongCB (double luongcb) {
		this.luongcb= luongcb;
	}
	public double getLuong() {
		return ngaycong*luongcb;
	}
	@Override
	public String toString() {
		return "NhanVien("+"hoten="+hoten+", ngaycon="+ngaycong+", luongcb="+luongcb+", luong"+getLuong()+')';
	}
}
