package com.qlsv.entity;

import java.util.Date;

public class SinhVienKT extends SinhVien{
	
	private double diemMarketing;
	private double diemSale;
	
	
	
	
	public SinhVienKT() {
	}

	public SinhVienKT(int maSV, String hoTen, String nganh, Date ngaySinh, double diemMarketing, double diemSale) {
		super(maSV, hoTen, nganh, ngaySinh);
		this.diemMarketing = diemMarketing;
		this.diemSale = diemSale;
	}
	
	@Override
	public double tinhDiem() {
		// TODO Auto-generated method stub
		return (2 * diemMarketing + diemSale) / 3;
	}
	
	
	
	

}
