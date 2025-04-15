package com.qlsv.database;

import com.qlsv.entity.SinhVien;

public class MemorySVAddDAO implements SVAddDAO {
	
	//constructor
	//nếu LTV không tạo bất kỳ contructor
	//thì java sẽ tạo một constructor mặc định
	
	@Override
	public void insert(SinhVien sv) {
		//kết nối database
		//gọi hàm thông qua tên class
		MemorySVDB.insert(sv);
	}

}
