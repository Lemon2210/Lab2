import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Lab2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<SinhVien> dssv = new ArrayList<>();
		 dssv.add(new SinhVien ("111", "Bach", 7));
		 dssv.add(new SinhVien ("222", "Kha", 7.5));
		 dssv.add(new SinhVien("333", "Duc", 6.5));
		 dssv.add(new SinhVien("444", "Nghia", 3));
		 dssv.add(new SinhVien ("555", "Tam", 9));
		 for (int i=0; i<dssv.size(); i++)
			 System.out.println (dssv.get(i));
	}
	public static SinhVien timLonNhat(List<SinhVien>dssv) {
		SinhVien max=dssv.get(0);//lay diem trung binh dau tien lam dtb lon nhat
		for(SinhVien sv:dssv) {//Duyet tung dtb
			if(sv.getDtb()>max.getDtb())//Neu dtb thu hai lon hon dtb thu nhat
				max=sv;//cho max la dtb thu hai va duyet tiep 
		}
		return max;
	}
}

class SinhVien{
	private String mssv;
	private String hoten;
	private double dtb;
	public SinhVien() {}
	public SinhVien (String mssv, String hoten, double dtb) {
		this.mssv=mssv;
		this.hoten=hoten;
		this.dtb= dtb;
	}
	public String getMssv() {
		return mssv;
	}
	public void setMssv (String mssv) {
		this.mssv=mssv;
	}
	public String getHoten () {
		return hoten;
	}
	public void setHoten (String hoten) {
		this.hoten=hoten;
	}
	public double getDtb() {
		return dtb;
	}
	
	public void setDtb (double dtb) {
		this.dtb= dtb;
	}
	@Override
	public String toString() {
		return "SinhVien("+"mssv="+mssv+", hoten="+hoten+", dtb="+dtb+')';
	}
}
