package com.qlsv.entity;

import java.util.Date;

public class SinhVienPM extends SinhVien{
	
	private double diemJava;
	private double diemCss;
	private double diemHtml;
	
	
	public SinhVienPM() {}
	
	public SinhVienPM(int maSV, String hoTen, String nganh, Date ngaySinh, double diemJava, double diemCss,
			double diemHtml) {
		super(maSV, hoTen, nganh, ngaySinh);
		this.diemJava = diemJava;
		this.diemCss = diemCss;
		this.diemHtml = diemHtml;
	}
	
	@Override
	public double tinhDiem() {
		// TODO Auto-generated method stub
		return (2 * diemJava + diemHtml + diemCss) / 4;
	}
	
	
	
	


	

}
