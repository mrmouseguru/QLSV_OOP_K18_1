package com.qlsv.control;

import com.qlsv.database.MemorySVAddDAO;
import com.qlsv.database.SVAddDAO;
import com.qlsv.entity.SinhVien;
import com.qlsv.ui.SVInAdd;
import com.qlsv.ui.SVOutAdd;

public class SVControlAdd {
	
	//
	//private MemorySVAddDAO svAddDAO;
	private SVAddDAO svAddDAO;
	private SVInAdd svInAdd;
	private SVOutAdd svOutAdd;
	
	
	//
	//constructor
	public SVControlAdd() {
	}



	public SVControlAdd(SVAddDAO svAddDAO, 
			SVInAdd svInAdd, SVOutAdd svOutAdd) {
		this.svAddDAO /*field*/ = svAddDAO /*tham so cua ham */;
		this.svInAdd = svInAdd;
		this.svOutAdd = svOutAdd;
	}
	
	public void add() {
		//1. gửi thông điệp cho đối tượng 
		//SVInAdd (nhận vào thông tin SV mà user nhập từ bàn phím)
		SinhVien sv = null;
		sv = svInAdd.input();
		
		//2. gửi thông điệp đến đối tượng 
		//SVAddDAO - thêm thông tin SV vào CSDL
		svAddDAO.insert(sv);
		
		//3. gửi thông điệp đến đối tượng 
		//SVOutAdd - hiển thị thông báo cho user
		svOutAdd.showMessage(sv);
	}
		
	
	

	
	
	

}
